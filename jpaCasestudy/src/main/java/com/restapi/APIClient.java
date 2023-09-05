package com.restapi;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="ITEM-SERVICE",url="http://localhost:8080")
public interface APIClient {

	@GetMapping("/item")
	List<ItemDTO> getAllItems();
	}
