package practice_0715;

public class ReverveSeat {

	public static void main(String[] args) {
		
		int[] seats = new int[50];
		
		// 랜덤하게 좌석을 배정
		// 0 <-- 예약 가능한 좌석
		// 1 <-- 예약 불가능한 좌석
		for (int i = 0; i < seats.length; i++) {
			seats[i] = (int)(Math.random()*2);			
		}
		// 배열의 값을 출력
		// "0 0 1 0 1 1 1 1 0 0 1 0 1 0 0 0 1 0 1 1 1 . . . ."
		for (int i = 0; i < seats.length; i++) {
			seats[i] = (int)(Math.random()*2);
			System.out.println(seats[i]);
		}
		
		
		// 예약 가능한 좌석의 수를 출력
		// "n개의 좌석을 예약할 수 있습니다."
		for (int i = 0; i < seats.length; i++) {
			//seats[i] = (int)(Math.random()*2);
			
		}
		
		
		// 예약 불가능한 좌석의 수를 출력
		// "m개의 좌석이 이미 예약되어 있습니다."
		
		
	}
	
}
