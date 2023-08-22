package com.service;

import org.springframework.stereotype.Service;

import com.model.Item;
import com.model.Item;
import java.util.ArrayList;
import java.util.Iterator;

@Service
public class ItemService {
	
ArrayList<Item> itemList = new ArrayList();
	
	public void addItem(Item e)
	{
		itemList.add(e);
	}
	
	public ArrayList<Item> getItemList()
	{
		return itemList;
	}
	
	public void updateItem(Item e)
	  {
		     Iterator<Item> iterator=itemList.iterator();
		     while(iterator.hasNext())
		     {
		    	Item item=iterator.next();
		    	if(item.getItemId()==e.getItemId())
		    		{
		    			iterator.remove();
		    		}
		     }
		     itemList.add(e);
	  }
	
	public void deleteItem(int id)
	  {
		  Iterator<Item> iterator=itemList.iterator();
		  while(iterator.hasNext())
		     {
		    	Item item=iterator.next();
		    	if(item.getItemId()==id)
		    		{
		    		iterator.remove();
		    		}
		     }
	  }
	
	public Item getItem(int id)
	  	{
			return itemList.get(id);
	  	}

}
