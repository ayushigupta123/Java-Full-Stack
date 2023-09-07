package com.consumer;
import java.util.function.Consumer;
import java.util.ArrayList;

public class ConsumerDemo {
	
	ArrayList<Item> itemList = new ArrayList<>();
	
	ConsumerDemo()
	{
		itemList.add(new Item(1,"Coffee",20));
		itemList.add(new Item(2,"Tea",58));
		itemList.add(new Item(3,"Latte",100));
		itemList.add(new Item(4,"IceTea",60));
	}
	
	public void forEachItem(Consumer<Item> c)
	{
		for(Item i:itemList) {
			c.accept(i);
		}
	}

	public static void main(String[] args) {
		
		ConsumerDemo obj =new ConsumerDemo();
		obj.forEachItem((e)->System.out.println("id "+e.getItemId()+" Name "+e.getItemName()+" Price "+e.getItemPrice()));
		
		/*
		Item item = new Item(1, "Coffee",20);
		
		Consumer<Item> c=(e)->System.out.println("Item Name "+e.getItemName()+"Item price "+e.getItemPrice());
		*/
		
	}
}
