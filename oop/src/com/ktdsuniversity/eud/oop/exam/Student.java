package com.ktdsuniversity.eud.oop.exam;

public class Student {

	int java;		// 멤버변수엔 값을 할당하지 않는다.
	int python;
	int cpp;
	int csharp;
	
	int getSumAllSocres() {
		return  java + python + cpp + csharp;
	}
	double getAverage(int sum) {
		return sum / 4d ;				//4에 d를 붙여 형변환해줌
	}
	double getCourseCredit(double average) {
		if(average < 55) {				// 55미만이면 음수가 나오기 때문에
			return 0.1;
		}
		return (average - 55) / 10;
	}
    String getABCDF(double credit) {
    	if(credit > 4.0){
    		return "A+";
    	} else if(credit >= 3.6 && credit <= 4.0) {
    		return "A";
    	} else if(credit >= 3.1 && credit <= 3.5) {
    		return "B+";
    	} else if(credit >= 2.6 && credit <= 3.0) {
    		return "B";
    	} else if(credit >= 1.6 && credit <= 2.5) {
    		return "C";
    	} else if(credit >= 0.6 && credit <= 1.5) {
    		return "D";
    	} else {
    		return "F";
    	}
    }
	
	public static void main(String[] args) {
	
	Student student = new Student();
	student.java = 80;
	student.python = 90;
	student.cpp = 70;
	student.csharp = 60;
	
	int sum = student.getSumAllSocres();
	double average = student.getAverage(sum);
	double credit = student.getCourseCredit(average);
	String score = student.getABCDF(credit);
	
	System.out.println(sum);
	System.out.println(average);
	System.out.println(credit);
	System.out.println(score);
	
	}
	
	
}
