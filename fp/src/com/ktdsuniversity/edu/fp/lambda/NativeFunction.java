package com.ktdsuniversity.edu.fp.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;


public class NativeFunction {
	
	public static void main(String[] args) {
		
		// Predicate<T> => T를 받아서 boolean을 반환시킨다.		
		
		Predicate<String> isEmpty = (str) -> str == null || str.isBlank();
		System.out.println(isEmpty.test(null));			//true
		System.out.println(isEmpty.test("   "));		//true
		System.out.println(isEmpty.test("Asdfasdfasd"));//false
				
		// Consumer<T> => T를 받아서 void 를 반환시킨다.		
		// ctrl + shift + t 했을 때 void 니까 {} 들어가야함
		// 그러나 중괄호가 없으면 반환시키는것. 없는데 작동이 되면 println 이 무엇을 반환하는지 확인해야함,
		// print 반환하는것도 확인했을때 두개가 같으면 둘다 void 면 중괄호 생략가능
		
		Consumer<String> print = (str)->{
			System.out.println(str);
		};
		print.accept("Asdfasdfasdasdasd");
		
		// Function<T, R> => T를 받아서 R을 반환시킨다.
		
		// String 을 파라미터로 전달해서 문자열의 길이를 반환 시키는 함수.
		Function<String, Integer> getLength = (str) -> str.length();
		int len = getLength.apply("asddsfsfsdfssdfs");
		System.out.println(len);
		
		// String 을 파라미터로 전달해서 숫자로 변경해주는 함수.
		Function<String, Integer> toInt = (str) -> Integer.parseInt(str);
		int val = toInt.apply("1234");
		System.out.println(val);
		
		// Integer 를 파라미터로 전달해서 문자로 변경해주는 함수.
		Function<Integer, String> toString = (intVal) -> intVal +"";
		String toResult = toString.apply(123456);
		System.out.println(toResult);
		
		// Integer 를 파라미터로 전달해서 2의 배수만 true 로 반환시켜주는 함수.
		Function<Integer, Boolean> isEven = (intVal) -> intVal % 2 == 0;
		boolean result = isEven.apply(1234);
		System.out.println(result);
		
		result = isEven.apply(12345);
		System.out.println(result);
		
		DishSummary summary = new DishSummary();
		summary.printAllDishesBy((dish)-> dish.getDishType() == DishType.MEAT);
		
		summary.printAllDishesBy((dish)->true);
		summary.printAllDishesBy((dish)->false);
		
		summary.printAllDishesBy((dish)-> dish.getFoodType() == FoodType.VEGETABLES);
		
		summary.printTotalCaloriesBy(
				(dish) -> true, 
				(dish) -> dish.getCalories());
		
		summary.printTotalCaloriesBy(
				(dish) -> dish.getDishType() == DishType.MEAT, 
				(dish) -> dish.getCalories()
		);
		
		summary.printAverageCaloriesBy(
				(dish) -> true, 
				(dish) -> dish.getCalories()
		);
		
		summary.printAverageCaloriesBy(
				(dish) -> dish.getDishType() == DishType.OTHER, 
				(dish) -> dish.getCalories()
		);
		
		
		
	}
	
	

}
