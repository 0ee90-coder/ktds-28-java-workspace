package practice_0715;

public class DiceGameArrayM {
	
	public static boolean isNotArrive(int[] players) {
		final int GOAL_POSITION = 127;
		
		boolean isPlaying = true;
		for (int i = 0; i <players.length; i++) {
			if (players[i]>= GOAL_POSITION) {
				isPlaying = false;
				break;
			}
		}
		return isPlaying;
	}
	
	public static int roleDice() {
		
		// 주사위 굴리기
		int dice1 = (int) (Math.random() * 20) + 1;
		int dice2 = (int) (Math.random() * 20) + 1;
		int moveCount = dice1 + dice2;
		if (moveCount % 3 == 0) {
			moveCount *= -1;
		} else if (dice1 == dice2) {
			moveCount *= 2;
		}
		return moveCount;
	}

	public static void main(String[] args) {
		
		int[] playerPosition = new int[4];
		int moveCount = 0;

		boolean isPlaying = isNotArrive(playerPosition);

		while (isPlaying){
			System.out.println(); // 빈 줄 출력
			
			// 배열에 있는 플레이어 모두가 한 번씩 주사위를 던져 이동한다.
			
			for ( int i = 0 ; i < playerPosition.length; i++) {
				System.out.println("Player" + i + "==========");
				
				//주사위 굴리기
				
				moveCount = roleDice(); // 호출할 때는 () 그러면 위에서 주사위를 돌리고 여기로 호출한다.
				moveCount += roleDice(); // 한번더 굴리고 싶을 때 코드
				
				// 플레이어 이동
				
				playerPosition[i] += moveCount;
				if (playerPosition[i] < 0) {
					playerPosition[i] = 0;
				}
				
				System.out.print("첫 번째 주사위 값 ");
				System.out.print("두 번째 주사위 값 ");
				System.out.print("이동할 칸의 수 ");
				System.out.println(moveCount);
				System.out.print("현재 위치 ");
				System.out.println(playerPosition);
			}	
			isPlaying = isNotArrive(playerPosition); // 파라미터 플레이어포지션을 제공중 따라서 int 배열
		}
	}
}
