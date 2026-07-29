package com.ktdsuniversity.edu.oop.exam.array;

//https://school.programmers.co.kr/learn/courses/30/lessons/181868
public class P181868 {

	public static String[] solution2(String my_string) {
		my_string = my_string.trim();
		my_string = my_string.replaceAll("[ ]{2,}", " ");
		return my_string.split(" ");
	}
	
	public static String[] solution(String my_string) {
		while (my_string.contains("  ")) {
			my_string = my_string.replace("  ", " ");
		}
		my_string = my_string.trim();
		return my_string.split(" ");
	}

	public static void main(String[] args) {
		String[] result = solution(" i    love  you");
		PrintUtils.print(result);

		result = solution("    programmers  ");
		PrintUtils.print(result);
		
		result = solution2(" i    love  you");
		PrintUtils.print(result);

		result = solution2("    programmers  ");
		PrintUtils.print(result);
	}
}