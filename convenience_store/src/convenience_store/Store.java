package convenience_store;

/**
 * 편의점
 */
public class Store {
	
	/**
	 * 상품을 보관하는 창고
	 */
	Item[] garage = new Item[6];
	
	/**
	 * 진열장A
	 */
	Display sectionA = new Display();
	
	/**
	 * 진열장B
	 */
	Display sectionB = new Display();

	/**
	 * 직원A
	 */
	Employee kim = new Employee();
	
	/**
	 * 직원B
	 */
	Employee Lee = new Employee();
	
	/**
	 * 잔고
	 */
	int safe = 40_000;
		
	public static void main(String[] args) {
		
		Store gs25 = new Store();
		gs25.garage[0] = new Item();
		gs25.garage[0].name = "스타믹스"; // gs25 창고의 0번에 이름을 주겠다 스타믹스로
		gs25.garage[0].price = 2000;
		gs25.garage[0].stock = 10;
		
		gs25.garage[1] = new Item();
		gs25.garage[1].name = "포카칩 오리지널";
		gs25.garage[1].price = 1500;
		gs25.garage[1].stock = 5;
		
		gs25.garage[2] = new Item();
		gs25.garage[2].name = "프링글스 오리지널";
		gs25.garage[2].price = 3500;
		gs25.garage[2].stock = 8;
		
		gs25.garage[3] = new Item();
		gs25.garage[3].name = "초코송이";
		gs25.garage[3].price = 1200;
		gs25.garage[3].stock = 16;
		
		// 진열장에 상품 추가
		// 프링글스 오리지널을 A진열대 2번칸에 5개 진열한다.
		// 프링글스 오리지널 재고가 5개 줄어든다.
		gs25.garage[2].stock -= 5;
		// 진열장에는 프링글스 오리지널 재고가 5개 추가된다.
		gs25.sectionA.items[2] = new Item();
		gs25.sectionA.items[2].name = "프링글스 오리지널";
		gs25.sectionA.items[2].price = 3500;
		gs25.sectionA.items[2].stock = 5;
		
		gs25.kim.name = "김경환";
		gs25.kim.salary = 15000;
		gs25.kim.time = 45;
		
		gs25.Lee.name ="이동욱";
		gs25.Lee.salary = 15000;
		gs25.Lee.time = 37;
		
		// 프링글스 1개가 판매가 되었다.
		// 진열대의 프링글스 재고가 1개 줄어야 한다.
		gs25.sectionA.items[2].stock--;
		// 잔고는 프링글스 1개 가격만큼 증가되어야 한다.
		gs25.safe += gs25.sectionA.items[2].price;

		
	}
}
