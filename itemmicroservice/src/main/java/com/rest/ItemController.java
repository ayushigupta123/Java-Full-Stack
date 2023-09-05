package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @GetMapping("/items")
    public List<Item> getAllItems() {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Item 1", 10.99, 50));
        items.add(new Item("Item 2", 5.49, 100));
        items.add(new Item("Item 3", 2.99, 75));
        
        return items;
    }
}
