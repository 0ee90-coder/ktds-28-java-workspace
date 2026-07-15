package practice_0714;

public class DiceGame {

	public static void main(String[] args) {
		/*
		 * 주사위를 굴려 최종 목적지에 먼저 도착하는 플레이어가 승리하는 게임.
		 * 
		 * 위치 값을 가진 4명의 플레이어가 있습니다.
		 * 모든 플레이어들의 위치값은 0부터 시작합니다.
		 * 
		 * 각 플레이어들은 주사위 두 개를 굴려 나온 수 만큼 이동을 합니다.
		 * 도착지의 위치 값은 127입니다.
		 * 
		 * ====== 주사위 규칙 ======
		 * 1. 두 개의 주사위를 굴린 값이 3, 7 이라면 위치 값은 10 만큼 증가합니다.
		 * 2. 두 주사위가 똑같은 숫자가 나온다면 주사위 합의 배수 만큼 이동합니다.
		 *     -> 4, 4 ==> 8 * 2 ==> +16
		 * 3. 두 주사위값의 합이 3의 배수일 경우 위치 값은 합의 수 만큼 감소합니다.
		 *     -> 4, 5 ==> 9 ==> -9
		 * 
		 * 플레이어의 위치 값은 0보다 작아질 수 없습니다.
		 * - 현재 위치값이 8이고, 이동할 칸의 수가 -9 라면, 위치 값은 0이 되어야 합니다.
		 * 
		 * 플레이어가 주사위를 굴릴 때마다 주사위의 값, 이동할 칸의 수, 현재 위치값을 표시합니다.
		 */
		int playerAPosition = 0;
		int playerBPosition = 0;
		int playerCPosition = 0;
		int playerDPosition = 0;
		
		final int GOAL_POSITION = 127;
		
		int dice1 = 0;
		int dice2 = 0;
		int moveCount = 0;
		
		while (playerAPosition < GOAL_POSITION && 
				playerBPosition < GOAL_POSITION && 
				playerCPosition < GOAL_POSITION && 
				playerDPosition < GOAL_POSITION ) {
			System.out.println(); // 빈 줄 출력
			
			System.out.println("PlayerA==========");
			// 주사위 굴리기
			dice1 = (int) (Math.random() * 20) + 1;
			dice2 = (int) (Math.random() * 20) + 1;
			moveCount = dice1 + dice2;
			if (moveCount % 3 == 0) {
				System.out.println("PlayerA - 3의 배수! 뒤로 이동!");
				moveCount *= -1;
			} else if (dice1 == dice2) {
				System.out.println("PlayerA - 더블! 두 배 이동");
				moveCount *= 2;
			}
			
			// 플레이어 이동
			playerAPosition += moveCount;
			if (playerAPosition < 0) {
				playerAPosition = 0;
			}
			
			System.out.print("첫 번째 주사위 값 ");
			System.out.println(dice1);
			System.out.print("두 번째 주사위 값 ");
			System.out.println(dice2);
			System.out.print("이동할 칸의 수 ");
			System.out.println(moveCount);
			System.out.print("현재 위치 ");
			System.out.println(playerAPosition);
			
			System.out.println("PlayerB==========");
			// 주사위 굴리기
			dice1 = (int) (Math.random() * 20) + 1;
			dice2 = (int) (Math.random() * 20) + 1;
			moveCount = dice1 + dice2;
			if (moveCount % 3 == 0) {
				System.out.println("PlayerB - 3의 배수! 뒤로 이동!");
				moveCount *= -1;
			} else if (dice1 == dice2) {
				System.out.println("PlayerB - 더블! 두 배 이동");
				moveCount *= 2;
			}
			
			// 플레이어 이동
			playerBPosition += moveCount;
			if (playerBPosition < 0) {
				playerBPosition = 0;
			}
			
			System.out.print("첫 번째 주사위 값 ");
			System.out.println(dice1);
			System.out.print("두 번째 주사위 값 ");
			System.out.println(dice2);
			System.out.print("이동할 칸의 수 ");
			System.out.println(moveCount);
			System.out.print("현재 위치 ");
			System.out.println(playerBPosition);
			
			System.out.println("PlayerC==========");
			// 주사위 굴리기
			dice1 = (int) (Math.random() * 20) + 1;
			dice2 = (int) (Math.random() * 20) + 1;
			moveCount = dice1 + dice2;
			if (moveCount % 3 == 0) {
				System.out.println("PlayerC - 3의 배수! 뒤로 이동!");
				moveCount *= -1;
			} else if (dice1 == dice2) {
				System.out.println("PlayerC - 더블! 두 배 이동");
				moveCount *= 2;
			}
			
			// 플레이어 이동
			playerCPosition += moveCount;
			if (playerCPosition < 0) {
				playerCPosition = 0;
			}
			
			System.out.print("첫 번째 주사위 값 ");
			System.out.println(dice1);
			System.out.print("두 번째 주사위 값 ");
			System.out.println(dice2);
			System.out.print("이동할 칸의 수 ");
			System.out.println(moveCount);
			System.out.print("현재 위치 ");
			System.out.println(playerCPosition);
			
			System.out.println("PlayerD==========");
			// 주사위 굴리기
			dice1 = (int) (Math.random() * 20) + 1;
			dice2 = (int) (Math.random() * 20) + 1;
			moveCount = dice1 + dice2;
			if (moveCount % 3 == 0) {
				System.out.println("PlayerD - 3의 배수! 뒤로 이동!");
				moveCount *= -1;
			} else if (dice1 == dice2) {
				System.out.println("PlayerD - 더블! 두 배 이동");
				moveCount *= 2;
			}
			
			// 플레이어 이동
			playerDPosition += moveCount;
			if (playerDPosition < 0) {
				playerDPosition = 0;
			}
			
			System.out.print("첫 번째 주사위 값 ");
			System.out.println(dice1);
			System.out.print("두 번째 주사위 값 ");
			System.out.println(dice2);
			System.out.print("이동할 칸의 수 ");
			System.out.println(moveCount);
			System.out.print("현재 위치 ");
			System.out.println(playerDPosition);
		}
		
	}
	
}
