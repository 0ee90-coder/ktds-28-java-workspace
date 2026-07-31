package com.ktdsuniversity.eud.oop.collection.list.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tag {
	
	public static void main(String[] args) {
		
		//의류에 붙어있는 택 정보를 Map 을 이용해 표현.
		// java.util.map;
		// java.util.HashMap;
		Map<String, Object> tags = new HashMap<>();
		tags.put("사이즈", 30);
		tags.put("소재", "폴리에스테르");
		tags.put("가격", 59000);
		
		System.out.println(tags);  // {"사이즈"=30 , "소재"="폴리에스테르" , "가격"=59000}
		System.out.println(tags.size());  // 3
		
		tags.put("가격", 69000);
		
		System.out.println(tags);  // {"사이즈"=30 , "소재"="폴리에스테르" , "가격"=69000}
		System.out.println(tags.size());  // 3
		
		// Object 소재 = tags.get("소재");
		String 소재 = (String) tags.get("소재");  // 명시적 형변환 해준다.
		System.out.println(소재);				// 폴리에스테르
		
		String 브랜드 = (String)tags.get("브랜드");
		System.out.println(브랜드);			// null
		
		int 가격 = (int)tags.get("가격");
		System.out.println(가격);				// 69000
		
		/**
		int 할인가 = (int)tags.get("할인가");
		System.out.println(할인가);			// null 값인데 primitive라서 생김
		*/									// NullPointerException
		if (tags.containsKey("할인가")) {
			int 할인가 = (int)tags.get("할인가");
			System.out.println(할인가);
		}
		
		int 할인가 = (int) tags.getOrDefault("할인가", 0);
		System.out.println(할인가);
		
		List<Map<String, Object>> clothes = new ArrayList<>();
		Map<String, Object> tags1 = new HashMap<>();
		tags1.put("판매가격", 15000);
		tags1.put("소재", "나일론");
		tags1.put("사이즈", 32);
		clothes.add(tags1);
		
		tags1 = new HashMap<>();
		tags1.put("판매가격", 15000);
		tags1.put("소재", "나일론");
		tags1.put("사이즈", 31);
		clothes.add(tags1);
		
		tags1 = new HashMap<>();
		tags1.put("판매가격", 15000);
		tags1.put("소재", "나일론");
		tags1.put("사이즈", 30);
		clothes.add(tags1);
		
		tags1 = new HashMap<>();
		tags1.put("판매가격", 15000);
		tags1.put("소재", "나일론");
		tags1.put("사이즈", 28);
		clothes.add(tags1);
		
		tags1 = new HashMap<>();
		tags1.put("판매가격", 15000);
		tags1.put("소재", "나일론");
		tags1.put("사이즈", 26);
		clothes.add(tags1);
		
		for (int i = 0; i < clothes.size(); i++) {
			printTags(clothes.get(i));
		}
		
		// 클래스로 만드는 것이 더 쉽다.
		Map<String, List<Map<String,List<Map<String, Object>>>>> 옷 = new HashMap<>();
		
		
	}
	
	public static void printTags(Map < String, Object > tags){
		System.out.println("소재:" + tags.get("소재"));
		System.out.println("가격:" + tags.get("가격"));
		System.out.println("사이즈:" + tags.get("사이즈"));
	}
}
