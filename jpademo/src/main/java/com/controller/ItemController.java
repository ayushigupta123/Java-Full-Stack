package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Item;
import com.service.ItemService;
import java.util.*;
import java.util.List;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@PostMapping("/item")
	public ResponseEntity<?> addItem(@RequestBody Item item)
	{
		itemService.addItem(item);
		return new ResponseEntity("item added", HttpStatus.CREATED);
		
	}
	
	@GetMapping("/item")
	public ResponseEntity<?> getAllItems()
	{
		List<Item> itemList= itemService.getAlItems();
		return new ResponseEntity<List<Item>>(itemList,HttpStatus.OK);
	}
	
	@PatchMapping("/item")
	public ResponseEntity<?> updateItem(@RequestBody Item item)
	{
		itemService.updateItem(item);
		return new ResponseEntity("item updated", HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/item")
	public ResponseEntity<?> deleteItem(@RequestBody Item item)
	{
		itemService.deleteItem(item);
		return new ResponseEntity("item deleted", HttpStatus.OK);
		
	}
	
	@GetMapping("/item/{id}")
	public ResponseEntity<?> getItemById(@PathVariable int id)
	{
		Item item=itemService.getItemById(id);
				return new ResponseEntity<>(item,HttpStatus.FOUND);
	}

	@GetMapping("/itemprice/{price}")
	public ResponseEntity<?> getByPrice(@PathVariable float price)
	{
		List<Item> itemlist=itemService.findByPrice(price);
		return new ResponseEntity<>(itemlist,HttpStatus.FOUND);
	}


	@GetMapping("/itemname/{name}")

	public ResponseEntity<?> getByName(@PathVariable String name)
	{ 
		return new ResponseEntity<>(itemService.findByNane(name),HttpStatus.FOUND);
	}
	
	
}
