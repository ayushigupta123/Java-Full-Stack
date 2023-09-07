package com.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.model.Item;
import com.model.ItemNotFoundException;
import com.model.Product;

import java.util.*;

@RestController
public class ProductController{
	ArrayList<Product> productList= new ArrayList();
	
	public ProductController()
	{
		productList.add(new Product(1,"Coffee",20));
		productList.add(new Product(2,"Tea",15));
		productList.add(new Product(3,"Hot chocolate",50));
		productList.add(new Product(5,"Ice Tea",40));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getProduct(@PathVariable int id)
	{
		return new ResponseEntity(productList.get(id-1),HttpStatus.OK);
	}
	
	@PostMapping("/addproduct")
	public ResponseEntity<?> addProduct(@RequestBody Product product, 
			UriComponentsBuilder comp )
	{
		productList.add(product);
		int id=product.getProductId();
		UriComponents components =comp.path("/{"+id+"}").buildAndExpand(product.getProductId());
		
		return new ResponseEntity(components.toUri().toString(),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getallproducts")
	public ResponseEntity<?> getallproducts(UriComponentsBuilder uricomp)
	{
		ArrayList<String> resourseList= new ArrayList<>();
		for(Product p:productList)
		{
			int id=p.getProductId();
			UriComponents components= uricomp.replacePath("/"+id).build();
			resourseList.add(components.toUriString());
		}
		return new ResponseEntity<>(resourseList,HttpStatus.OK);
	}
	
	
}
/*
public class ProductController {
	
	@GetMapping("/items")
	public ResponseEntity<?> getProducts(@PathVariable int id)
	{
		Map <Integer,Item> mapitems= new HashMap();
		
		mapitems.put(1, new Item(1,"Coffee",20));
		mapitems.put(2, new Item(2,"Tea",25));
		mapitems.put(3, new Item(3,"Ice Tea",50));
		
		if(!mapitems.containsKey(id))
		{
			throw new ItemNotFoundException("not found "+id);
		}
		else
		{
			return new ResponseEntity(mapitems.get(id), HttpStatus.OK);
		}
		
		
	}

}*/
