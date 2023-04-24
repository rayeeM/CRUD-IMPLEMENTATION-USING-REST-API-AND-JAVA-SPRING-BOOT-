package com.example.child;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
    public class ChildController {

        @Autowired
        private ChildService childService;

        @PostMapping("/addchild")
        public ResponseEntity<Child> addChild(@RequestBody Child child) {
            Child createdChild = childService.addChild(child);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdChild);
        }

        @PutMapping("/editchild")
        public ResponseEntity<Child> editChild(@RequestBody Child child) {
            Child updatedChild = childService.editChild(child);
            if (updatedChild == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.ok(updatedChild);
        }

        @GetMapping("/search")
        public ResponseEntity<List<Child>> searchChildren(@RequestParam(name = "name") String name) {
            List<Child> children = childService.searchChildrenByName(name);
            return ResponseEntity.ok(children);
        }

        @GetMapping("/allchildren")
        public ResponseEntity<Map<String, Object>> getAllChildren(
                @RequestParam(defaultValue = "0") int page,
                @RequestParam(defaultValue = "10") int perPage
        ) {
            Map<String, Object> response = childService.getAllChildren(page, perPage);
            return ResponseEntity.ok(response);
        }
    }


