package practice_0714;

public class Battle {

	public static void main(String[] args) {

	 /* BOSS와 Player가 전투를 합니다.
 		BOSS의 체력과 Player의 체력 중 하나라도 0이하가 된다면 게임은 종료됩니다.
 		BOSS가 Player에게 공격을 합니다. (데미지는 랜덤한 정수 값)
 		Player가 BOSS에게 공격을 합니다. (데미지는 랜덤한 정수 값)
	  공격이 끝난 이후 서로의 체력을 출력합니다.
	 */	
		
		int bossHitPoint = 1_000;
		int playerHitPoint = 800;
		
		
		while (bossHitPoint > 0 && playerHitPoint > 0) {
			double randomDamage = Math.random();
			int bossDamage = (int)(randomDamage * 200);
			playerHitPoint -= bossDamage;
			
			randomDamage = Math.random();
			int playerDamage = (int)(randomDamage * 250);
			bossHitPoint -= playerDamage;
			
			System.out.println("Player의 체력");
			System.out.println(playerHitPoint);
			
			System.out.println("BOSS의 체력");
			System.out.println(bossHitPoint);
			System.out.println("=============");
		}

	}
}
