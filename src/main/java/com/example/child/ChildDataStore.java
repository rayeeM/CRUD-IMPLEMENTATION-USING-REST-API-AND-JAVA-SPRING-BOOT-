package com.example.child;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ChildDataStore {
    private static final Map<Integer, Child> childMap = new HashMap<>();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Child addChild(Child child) {
        int id = childMap.size() + 1;
        child.setId(id);
        childMap.put(id, child);
        return child;
    }

    public static Child editChild(Child child) {
        if (childMap.containsKey(child.getId())) {
            childMap.put(child.getId(), child);
            return child;
        }
        return null;
    }

    public static List<Child> searchChildByName(String name) {
        List<Child> children = new ArrayList<>();
        for (Child child : childMap.values()) {
            if (child.getName().equalsIgnoreCase(name)) {
                children.add(child);
            }
        }
        return children;
    }

    public static Map<String, Object> getAllChildren(int page, int perPage) {
        List<Child> children = new ArrayList<>(childMap.values());
        int total = children.size();
        int totalPages = (int) Math.ceil((double) total / perPage);
        int fromIndex = (page - 1) * perPage;
        int toIndex = Math.min(fromIndex + perPage, total);
        List<Child> paginatedChildren = children.subList(fromIndex, toIndex);
        return (Map<String, Object>) new ArrayList<>(paginatedChildren);
    }

    public static String getChildrenData(int page, int perPage) {
        List<Child> children = (List<Child>) getAllChildren(page, perPage);
        int total = childMap.size();
        int totalPages = (int) Math.ceil((double) total / perPage);
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("page", page);
        dataMap.put("per_page", perPage);
        dataMap.put("total", total);
        dataMap.put("total_pages", totalPages);
        dataMap.put("data", children);
        String dataJson = "";
        try {
            dataJson = objectMapper.writeValueAsString(dataMap);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return dataJson;
    }
}
