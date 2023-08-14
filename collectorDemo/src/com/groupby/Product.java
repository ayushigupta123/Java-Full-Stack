package com.groupby;

public class Product {
	
	private String productName;
	   private float price;
	   private int quantity;
	   private boolean in_stock;
	   private String store_name;
	   
	 public void product() {
		 
	 }

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isIn_stock() {
		return in_stock;
	}

	public void setIn_stock(boolean in_stock) {
		this.in_stock = in_stock;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public Product() {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.in_stock = in_stock;
		this.store_name = store_name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [productName=");
		builder.append(productName);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", in_stock=");
		builder.append(in_stock);
		builder.append(", store_name=");
		builder.append(store_name);
		builder.append("]");
		return builder.toString();
	}
	 
	 

}
