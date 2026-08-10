package com.ktdsuniversity.edu.fp.stream;

import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

public class Reducing {
	
	public static void printLongestNameDish() {
		// 이름이 가장 긴 Dish를 출력.
		
		List<Dish> dishes = DishList.makeDishList();
		
		Dish dish = dishes.stream() // Stream<Dish>
						  .reduce(dishes.get(0), (longestDish, eachDish) -> {
							  int longestDishsNameLength = longestDish.getName().length();
							  int eachDishsNameLength = eachDish.getName().length();
							  if(longestDishsNameLength < eachDishsNameLength) {
								  return eachDish;
							  }
							  return longestDish;
						  })
		;
		System.out.println("이름이 가장 긴 Dish:");
		System.out.println(dish);
	}
	
	public static void printMaxCalory() { 
		// 가장 높은 칼로리를 출력
		
		List<Dish> dishes = DishList.makeDishList();
		int calories = dishes.stream() 								// Stream<Dish>
							 .map(dish -> dish.getCalories()) 		// Stream<Integer>
						     .reduce(Integer.MIN_VALUE,Math::max)   // Stream<Integer>
		;
		System.out.println(calories);
	}
	
	public static void printMinCaloryOtherDishes() {
		// OTHER Dish 중에 가장 낮은 칼로리를 출력
		List<Dish> dishes = DishList.makeDishList();
		int cal = dishes.stream() // Stream<Dish>
						.filter(d -> d.getDishType() == DishType.OTHER) // Stream<Dish>
						.map(d -> d.getCalories()) // Stream<Integer>
						.reduce(Integer.MAX_VALUE, Math::min) // Integer
		;
		System.out.println("OTHER 중 가장 낮은 칼로리: " + cal);
	}
	
	
	public static void printMinNumberWithReference() {
		
		List<Integer> numbers = List.of(123,4532,125,4632,436,6346,-156,-753);
		int min = numbers.stream()
						 .reduce(Integer.MAX_VALUE,Math::min)
		;					
		System.out.println(min);
	}
	
	public static void printMaxNumberWithReference() {
	
		
		List<Integer> numbers = List.of(123,4532,125,4632,436,6346,-156,-753);
		int max = numbers.stream()
						 .reduce(Integer.MIN_VALUE,Math::max)
		;					
		System.out.println(max);
	}
	
	public static void printMaxNumber() {
		List<Integer> numbers = List.of(123,4532,125,4632,436,6346,-156,-753);
		int max = numbers.stream()
						 .reduce(Integer.MIN_VALUE,(maxNum,eachNumber) -> {
							 if(maxNum < eachNumber) {
								 return eachNumber;
							 } else {
								 return maxNum;
							 }
						 })
		;							//최대값을 구할때는 0이 아니라 젤 작은값(MIN_VALUE)부터
		System.out.println(max);
	}
	
	public static void printSumNumbers() {
		List<Integer> numbers = List.of(123,123,4532,125,4632,43,436,6346);
		int sum = numbers.stream()
						 .reduce(0,(total, eachNumber) -> total + eachNumber)
		;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		printSumNumbers();
		System.out.println("=".repeat(60));
		printMaxNumber();
	}

}
