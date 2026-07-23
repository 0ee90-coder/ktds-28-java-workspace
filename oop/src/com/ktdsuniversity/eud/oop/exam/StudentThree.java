package com.ktdsuniversity.eud.oop.exam;

public class StudentThree {

		private int java;
		private int python;
		private int cpp;
		private int csharp;
		
		public StudentThree(int java, int python, int cpp, int csharp) {
			this.java = java;
			this.python = python;
			this.cpp = cpp;
			this.csharp = csharp;
		}
		
		public StudentThree() {
//			this.java = 100;
//			this.python = 100;
//			this.cpp = 100;
//			this.csharp = 100;
			
			// 생성자 내부에서는 다른 생성자의 호출이 가능하다.
			// 호출방법: this();
			this(100, 100, 100, 100);
		}

		private int getSumAllScores() {
			return java + python + cpp + csharp;
		}
		
		public double getAverage(int sumScore) {
			return sumScore / 4d;
		}
		
		public double getCourseCredit(double average) {
			if (average < 55) {
				return 0.1;
			}
			return (average - 55) / 10;
		}
		
		public String getABCDF(double courseCredit) {
			String grade = "F";
			
			if (courseCredit >= 4.1) {
				grade = "A+";
			} else if (courseCredit >= 3.6) {
				grade = "A";
			} else if (courseCredit >= 3.1) {
				grade = "B+";
			} else if (courseCredit >= 2.6) {
				grade = "B";
			} else if (courseCredit >= 1.6) {
				grade = "C";
			} else if (courseCredit >= 0.6) {
				grade = "D";
			} 
			
			return grade;
		}
		
		public static void main(String[] args) {
			//						  java, py, cpp, cs
			StudentThree song = new StudentThree(100, 90, 80, 70);
			
			StudentThree park = new StudentThree(90, 30, 50, 20);
			
			int sumScore = song.getSumAllScores();
			System.out.println("합계: " + sumScore);
			
			double average = song.getAverage(sumScore);
			System.out.println("평균: " + average);
			
			double courseCredit = song.getCourseCredit(average);
			System.out.println("학점: " + courseCredit);
			
			String grade = song.getABCDF(courseCredit);
			System.out.println("등급: " + grade);
		} 
	}

