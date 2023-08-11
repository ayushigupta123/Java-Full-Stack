/*
 * 
 * Apply BinaryOperator.maxBy to compare 2 Item objects based on price and get the item with max price
 * 
 */

package com.ref;

import java.util.*;
import java.util.function.*;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    } 

    @Override
    public String toString() {
        return name + " " + price;
        
    }



    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item 1", 10.99));
        items.add(new Item("Item 2", 15.49));
        items.add(new Item("Item 3", 5.99));
       
        BinaryOperator<Item> maxPriceComparator = BinaryOperator.maxBy(Comparator.comparingDouble(Item::getPrice));

        Optional<Item> maxPriceItem = items.stream().reduce(maxPriceComparator);

        maxPriceItem.ifPresent(item -> System.out.println("Item with maximum price: " + item));
    
}
    
}
