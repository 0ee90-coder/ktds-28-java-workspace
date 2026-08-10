package com.ktdsuniversity.edu.fp.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ktdsuniversity.edu.fp.objects.City;
import com.ktdsuniversity.edu.fp.objects.CityList;

public class Cities {
	
	
	// 1. 모든 도시의 이름만 출력해본다
	public static void allName (String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
			cityList.stream()
					.forEach(System.out::println)
		;
	}
	
	// 2. countryName이 "south Korean"인 데이터의 Native를 중복없이 출력한다.
	public static void mapNative (String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path,filename);
			String cities = cityList.stream()
									.map(city -> city.getSouthKorean())
									.distinct()
									.forEach(System.out::println)
		;
	}
	
	// 3. 모든 도시의 pouplation을 출력해본다. 
	public static void allCountryPopulation (String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		
	}
	
	// 4. 모든 도시의 population을 출력해보다 단, 0이상만 출력한다.
	
	// 5. countryName이 "A"로 시작하는 국가의 도시들의 TimeZone을 중복없이 출력해본다.
	
	// 6. countryId가 10 이상인 국가들의 도시명을 출력해본다.

	// 7. countryName이 "South Korea"인 도시의 population 총 합을 출력해본다.

	// 8. population 기준으로 내림차순 정렬해 10개 도시의 이름과 population을 출력해본다.

	// 9. type이 "special self-governing province" 인 도시의 이름과 countryName을 출력해본다.

	// 10. 모든 도시들을 id 별로 오름차순 정렬해 출력해본다.
	
	public static void sortPoupulation (String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.collect(Collectors.toList())
				.stream()
				.sorted((city1 , city2) -> city1.getPopulation() - city2.getPopulation())
				.forEach(System.out::println);
	}

	// 11. iso2 값이 숫자 형태인 것만 출력해본다.
	
	public static void isoNumber (String path, String filename) {
		Stream<City> cityList = CityList.loadCityStream(path, filename);
		cityList.stream()
				.collect(Collectors.toList());
	}

	// 12. iso2 값이 숫자형태가 아닌 도시의 국가명(countryName)을 오름차순 정렬해 출력해본다.

	// 13. 국가명(countryName) 별 도시의 목록을 그룹핑하여 출력해본다.

	// 14. latitude와 longitude가 없는 도시들의 이름만 출력해본다.

	// 15. 국가명(countryName)이 Canada인 도시 중 3개는 건너띄고 2개만 출력해본다.

	// 16. level과 parentId가 0보다 큰 도시만 출력해본다.
	
	
		
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\User\\Desktop\\java-stream-countries-states-cities-database-master\\csv";
		String filename = "states.csv";
		Stream<City> cityList = CityList.loadCityStream(path,filename);
		cityList.forEach(System.out::println);

	}

}
