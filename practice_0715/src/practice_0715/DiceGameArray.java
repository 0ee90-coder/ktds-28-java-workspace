package practice_0715;

public class DiceGameArray {

	public static void main(String[] args) {
		
		int[] playerPosition = new int[4];
		/*
		playerPosition[0] = 0;	// 배열타입 기본값 자동 할당 따라서 왼쪽 코드는 필요가 없다.
		playerPosition[1] = 0;  // int [ ] a = new int[4];
		playerPosition[2] = 0;	// boolean [ ] a = new boolean [4];  정수 = 0 , 실수 = 0 , boolean = false , char = 
		playerPosition[3] = 0;
		*/ 
		
		/* 기존 코드
		int playerAPosition = 0;
		int playerBPosition = 0;
		int playerCPosition = 0; 
		int playerDPosition = 0; // 반복되는 코드 원인 > 배열로 변환
		*/

		final int GOAL_POSITION = 127;
		
		int dice1 = 0;
		int dice2 = 0;
		int moveCount = 0;
		
		// 모든 플레이어가 127 미만의 위치에 있는가?
		/*
		boolean isPlaying = false;
		for (int i = 0; i < playerPosition.length; i++)
			if(playerPosition[i] < GOAL_POSITION) {
				isPlaying = true;
			} else {
				isPlaying = false;
				break;
			}
		*/ // 아래와 같이 하면 코드가 간단해짐

		boolean isPlaying = true;
		for (int i = 0; i < playerPosition.length; i++)
			if(playerPosition[i] >= GOAL_POSITION) {
				isPlaying = false;
				break;
			}
		
		/*
		while (playerPosition[0] < GOAL_POSITION && 
				playerPosition[1] < GOAL_POSITION && 
				playerPosition[2] < GOAL_POSITION && 
				playerPosition[3] < GOAL_POSITION )
		*/	
		while (isPlaying){
			System.out.println(); // 빈 줄 출력
			
			// 배열에 있는 플레이어 모두가 한 번씩 주사위를 던져 이동한다.
			
			for ( int i = 0 ; i < playerPosition.length; i++) {
				System.out.println("Player" + i + "==========");
				// 주사위 굴리기
				dice1 = (int) (Math.random() * 20) + 1;
				dice2 = (int) (Math.random() * 20) + 1;
				moveCount = dice1 + dice2;
				if (moveCount % 3 == 0) {
					System.out.println("PlayerA - 3의 배수! 뒤로 이동!");
					moveCount *= -1;
				} else if (dice1 == dice2) {
					System.out.println("Player" + i + "- 더블! 두 배 이동");
					moveCount *= 2;
				}
				
				// 플레이어 이동
				playerPosition[i] += moveCount;
				if (playerPosition[i] < 0) {
					playerPosition[i] = 0;
				}
				
				System.out.print("첫 번째 주사위 값 ");
				System.out.println(dice1);
				System.out.print("두 번째 주사위 값 ");
				System.out.println(dice2);
				System.out.print("이동할 칸의 수 ");
				System.out.println(moveCount);
				System.out.print("현재 위치 ");
				System.out.println(playerPosition);
			}	
			/*
			for (int i = 0; i <playerPosition.length; i++) {
				if (playerPosition[i])
			}
			*/
		}
	}
}	