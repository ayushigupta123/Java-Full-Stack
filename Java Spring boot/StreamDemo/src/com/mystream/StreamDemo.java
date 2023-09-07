package com.mystream;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;


public class StreamDemo {

	public static void main(String[] args) {
		// Create Stream using Collection
		/*
		List<String> collection = Arrays.asList("Connector", "BSC","Teleprinter", "Terminal","Modems");
		Stream<String> stream=collection.stream();
		stream.forEach(System.out::println);
		*/
		/*Create a stream from specified values
		Stream <String> steam =Stream.of("Connector", "BSC","Teleprinter", "Terminal","Modems");
		
		*/
		
		/*Create sftream from Array
		String[] arr= {"Connector", "BSC","Teleprinter", "Terminal","Modems"};
		Stream<String> stream = Arrays.stream(arr);
		*/
		
		/*Stream using builder()
		
		Stream.Builder<Stream> builder=Stream.builder();
		builder.add("Modem");
		*/
		/* Stream using iterate method
		Stream<Integer> intstream = Stream.iterate(1, n->n+1).limit(15);
		intstream.forEach(System.out::println);
		*/
		/*
		IntStream intstream =IntStream.of(10,112,34,45,24);
		intstream.forEach(System.out::println);
		*/
		/* Filter()
		Stream<Integer> stream=Stream.of(10,12,45,23,24,678,78);
		stream.filter((e)->e>15).forEach(System.out::println);
		*/
		/* find first or any
		Stream<Integer> stream=Stream.of(10,12,45,23,24,678,78);
		System.out.println(stream.findFirst());
		*/
		
		
		
		
		
	}

}
