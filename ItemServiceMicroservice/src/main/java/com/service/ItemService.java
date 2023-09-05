package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.StoreLocation;
import com.repository.LocationRepository;

@Service
public class ItemService {
	
	@Autowired
	LocationRepository locationRepository;
	
	public void addStoreLocation(StoreLocation storeLocation)
	  {
		locationRepository.save(storeLocation);
	  }
	
	public void updateStoreLocation(StoreLocation storeLocation)
	  {
		locationRepository.save(storeLocation);
	  }
	
	public void deleteStoreLocation(StoreLocation storeLocation)
	  {
		locationRepository.delete(storeLocation);
	  }
	
	public List<StoreLocation> getAllStoreLocation()
	  {
		
		  ArrayList<StoreLocation> itemlist=new ArrayList();
		  return locationRepository.findAll();
		  
		  
	  }

}
