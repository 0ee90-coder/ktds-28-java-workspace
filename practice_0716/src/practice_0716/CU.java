package practice_0716;

public class CU {
	
	public static void main(String[] args) {
		// 편의점 drawio 파일을 토대로 작성한 코드.
		
		// 시작.
		
		// 손님이 바구니에 담아온 상품의 가격 정보
		int[] items = new int[5];
		items[0] = 5000;
		items[1] = 1800;
		items[2] = 3200;
		items[3] = 30000;
		items[4] = 1300;
		
		// 손님이 바구니에 담아온 상품의 할인 정보
		float[] dc = new float[5];
		dc[0] = 0;
		dc[1] = 0.1f; // 1800원 상품을 10% 할인.
		dc[2] = 0.2f; // 3200원 상품을 20% 할인.
		dc[3] = 1;    // 300000원 상품을 100% 할인.
		dc[4] = 0;    
		
		// 봉투 가격
		final int BAG_PRICE = 100;
		
		// 한 봉투에 넣을 수 있는 상품의 수
		final int SPLIT_COUNT = 2;
		
		// 고객의 자금 상황
		// 카드 한도
		final int CARD_LIMIT = 1_000_000;
		
		// 현재까지 사용한 카드 결제 금액
		int cardPaidMoney = 150_000;
		
		// 체크 카드 계좌 잔액
		int remainAccount = 4_000;
		
		// 보유한 현금
		int cash = 30_000;
		
		// 보유한 포인트
		int point = 1_750;
		
		// 최종 결제 금액
		int amount = 0;
		
		// 봉투 필요여부(필요 == 0 , 불필요 == 1)
		int needBag = (int)(Math.random()*2);
		if (needBag==0) {
			int bagCount = items.length / SPLIT_COUNT;
			if(items.length % SPLIT_COUNT > 0 ) {
				bagCount++;
			}
		}
		
		// TODO 손님이 가져온 상품 목록의 결제 금액 계산해서 amount에 할당.
		for(int i=0; i < items.length; i++) {
			amount += (items[i] - (int)(items[i] * dc[i]));
		}
		// 할인율 계산 필요.
		
		
		// 포인트 적립
		int addPoint = (int)(Math.random() * 2);
		
		// TODO 적립할 경우 (addPoint==0) 이라면 총 결제 금액에서 10% 적립.
		if (addPoint==0) {
			point += (amount * 0.1);
		}
		
		// 결제 수단 선택 (0 ==> 현금, 1 ==> 신용카드, 2 ==> 체크카드, 3 ==> 포인트 선결제, 4 ==> 포기)
		int payment = (int)(Math.random() * 5 );
		
		// TODO 결제 수단 선택
		if(payment == 0)
		
		if(payment == 1) {
			
		}
		
		// 신용카드 & 결제금액 5만원 이상일 경우 할부 또는 일시불 선택
		
		// TODO 현금으로 결제했을 때 보유한 현금을 최종 결제 금액만큼 차감
		
		// TODO 신용카드로 결제했을 때 카드 결제금액을 최종 결제 금액만큼 증가.
		
		// TODO 포인트 선결제 했을 때 포인트를 최종 결제 금액만큼 차감.
		
	}

}
