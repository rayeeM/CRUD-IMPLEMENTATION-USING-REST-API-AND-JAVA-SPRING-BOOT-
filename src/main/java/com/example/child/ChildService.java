package com.example.child;


import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service
public class ChildService {
    @Autowired
    ChildDataStore ChildDataStore;
    private ChildService childDataStore;

    public Child addChild(Child child) {
        childDataStore.addChild(child);
        return child;
    }

    public Child editChild(Child child) {
        childDataStore.editChild(child);
        return child;
    }

    public Child getChild(String name) {
        return childDataStore.getChild(name);
    }

    public Map<String, Object> getAllChildren(int page, int per_page) {
        return childDataStore.getAllChildren(page, per_page);
    }

    public List<Child> searchChildrenByName(String name) {
        return null;
    }
}
