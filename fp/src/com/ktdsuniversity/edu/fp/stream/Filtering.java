package com.ktdsuniversity.edu.fp.stream;

import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

/**
 * 리스트 인스턴스를 스트림 인스턴스로 변환해
 * 필요한 데이터만 추출해내는 실습
 */

public class Filtering {
	
	public static void printLowCaloryFishDishes() {
		//1.
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream()  // Stream<Dish>
			  .filter((dish)->dish.getCalories()<=400 && 
			  dish.getDishType()==DishType.FISH)  // Stream<Dish>
			  .forEach(System.out::println)  //void
			  ;
		//2.번 사용방식 선호
//		dishes.stream() //Stream<Dish>
//			  .filter((dish) -> dish.getCalories()<=400)   // Stream<Dish>
//			  .filter((dish) -> dish.getDishType()==DishType.FISH)  // Stream<Dish>
//			  .forEach(System.out::println)  //void
//		;
	}
	
	public static void printFishDishes() {
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream()
			  .filter((dish)->dish.getDishType()==DishType.FISH)
			  .forEach(System.out::println)
			  ;
		
	}
	
	public static void printHighCaloryDishes() {
		// 고 칼로리 기준: Dish의 칼로리가 800이상.
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream()  // Stream<Dish>
			  .filter((dish)->dish.getCalories()>=800)  // Stream<Dish>
			  .forEach(System.out::println)  //void
		;
	}
	
	public static void printLowCaloryDishes() {
		// 저 칼로리 기준: Dish의 칼로리가 400이하.
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream()  // Stream<Dish>
			  .filter((dish)-> dish.getCalories() <= 400)  // Stream<Dish>
			  .forEach(System.out::println)  //void
		;
	}
	
	public static void printMeatDishes() {
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream() // Stream<Dish>
			  .filter((dish)-> dish.getFoodType()==FoodType.MEAT)  //Stream<Dish>
			  .forEach(System.out::println) // void
		;
	}
	
	public static void printVegetableDishes() {
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream() // Stream<Dish>
		
//			  .peek((dish)->{
//				  System.out.println("필터링 수행 전");    디버깅코드는 지워야함
//				  System.out.println(dish);
//			  })  //Stream<Dish>
			  
			  .filter((dish) -> dish.getFoodType()==FoodType.VEGETABLES)  //Stream<Dish>  //중간연산은 반환이 stream이고 최종은 아니다.

			  //			  .peek((dish)->{
//				  System.out.println("필터링 수행 후");
//				  System.out.println(dish);
//			  })  //Stream<Dish>
			 
			  .forEach( System.out::println ) //void
			  
//			  .forEach((dish) -> System.out.println(dish)) //void
		;
	}
	
	public static void main(String[]args) {
		printVegetableDishes();
		System.out.println("=".repeat(60));
		printMeatDishes();
		printLowCaloryFishDishes();
	}

}
