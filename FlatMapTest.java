package com.techleads.app;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

	public static void main(String[] args) {
		List<String> letters1 = Arrays.asList("a", "b");
		List<String> letters2 = Arrays.asList("b", "c", "d");
		List<String> letters3 = Arrays.asList("e", "f");
		List<List<String>> listOfLetters = Arrays.asList(letters1, letters2, letters3);
		
		listOfLetters.stream().forEach(System.out::println);
		
		System.out.println("===========");
		List<String> collect = listOfLetters.stream().flatMap(List::stream).collect(Collectors.toList());
		
		List<String> collect1 = listOfLetters.stream().flatMap(x-> x.stream())
				.map(y->y.toUpperCase())
				.collect(Collectors.toList());
		
		collect1.forEach(System.out::println);
		
		
		

	}

}
