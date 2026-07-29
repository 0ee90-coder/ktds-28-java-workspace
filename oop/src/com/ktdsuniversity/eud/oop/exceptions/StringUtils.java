package com.ktdsuniversity.eud.oop.exceptions;

public class StringUtils {
	
	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}
	
	public static String emptyToDefault(String str, String defaultString) {
		if(str != null && !str.isBlank()) {
			return str;
		} else {
			return defaultString;
		}
	}

}
