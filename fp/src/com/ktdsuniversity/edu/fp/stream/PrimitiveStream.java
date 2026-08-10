package com.ktdsuniversity.edu.fp.stream;

import java.util.IntSummaryStatistics;
import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;

public class PrimitiveStream {
	
	public static void printSummaryStatisticsOfDishes() {
		// 모든 Dish의 Calory를 가진 IntStream으로 변환해서
		// summaryStatistics()를 호출한 결과를 출력해본다.
		List<Dish> dishes = DishList.makeDishList();
		IntSummaryStatistics statistics = dishes.stream() //Stream<Dish>
												.mapToInt(dish -> dish.getCalories())//IntStream
												.summaryStatistics()
		;
		System.out.println(statistics);
		
		int min = statistics.getMin();
		System.out.println("min:"+ min);
		double average = statistics.getAverage();
		System.out.println("average:"+ average);
		
		long sum = statistics.getSum();
		System.out.println("sum:"+sum);
		
		long count = statistics.getCount();
		System.out.println("count:"+count);
	}
	
	public static void printDishesAverageCalory() {
		//모든 Dish의 평균 Calory를 구해서 출력한다.
		List<Dish> dishes = DishList.makeDishList();
		
		double average = dishes.stream() 							 //Stream<Dish>
							   .mapToInt(dish -> dish.getCalories()) //IntStream
							   .average()							 //OptionalDouble
							   .orElse(-1)                           //double
		;
		System.out.println(average);
	}
	
	public static void printMinNumbers() {
		List<String> numbers = List.of("1235","4634423","1823","1111","2","5655","6767","1231","36777","987172","66434");
		
		//numbers에서 가장 작은 값을 찾아 출력한다.
		int min = numbers.stream() 								 //Stream<String>
						 .mapToInt(str -> Integer.parseInt(str)) //IntStream
						 .min()									 //OptionalInt
						 .orElse(-1) 							 //int
		;
		System.out.println(min);
	}
	
	public static void printMaxNumbers() {
		List<Integer> numbers = List.of(12,324,453,26342,352,23,215,745,352);
		int max = numbers.stream() 					//Stream<Integer>
						 .mapToInt(num -> num)      // IntStream
						 .max() 					// OptionalInt
						 .orElse(-1)				// int			   
		;
		System.out.println(max);		
	}
	
	public static void printSumNumbers() {
		List<Integer> numbers = List.of(12,324,453,26342,352,23,215,745,352);
		int sum = numbers.stream() // Stream<Integer>
						 .mapToInt(num -> num) // IntStream
						 .sum() //int
		;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		printSummaryStatisticsOfDishes();
	}

}
