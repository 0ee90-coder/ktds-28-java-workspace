package com.ktdsuniversity.eud.oop.exam;

public class Game {
	
	boolean isInsertCoin;
	int dolls;
	
	public void insertCoin() {
		isInsertCoin = dolls > 0;
	}
	
	public int doGame() {
		System.out.println();
		if (isInsertCoin) {
			int gameResult = (int) (Math.random() * 2);
			dolls -= gameResult;
			isInsertCoin = false;
			return gameResult;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Game machine = new Game();
		machine.dolls = 5;
		
		while (machine.dolls > 0) {
			machine.insertCoin();
			int dolls = machine.doGame();
			System.out.println("뽑기 결과: " + dolls);
			System.out.println("남은 인형의 개수: " + machine.dolls);
		}
	}


}
