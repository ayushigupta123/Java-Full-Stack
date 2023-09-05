package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ItemTable")
public class Item {
	
	@Id
	private int itemid;
	
	@Column(name="ProductName")
	private String itemName;
	
	private float price;

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Item(int itemid, String itemName, float price) {
		super();
		this.itemid = itemid;
		this.itemName = itemName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemName=" + itemName + ", price=" + price + "]";
	}

	public Item() {
		super();
	}
	
	

}
