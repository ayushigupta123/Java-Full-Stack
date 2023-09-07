package com.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
	@GetMapping("/item/list")
    public List<Item> getAllItems() {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Item 1", 10.99, 50));
        items.add(new Item("Item 2", 5.49, 100));
        items.add(new Item("Item 3", 2.99, 75));
        
        return items;
    }
	
	@GetMapping("/hello")
    public String getHello() {
        
        return "Hello";
    }

}
