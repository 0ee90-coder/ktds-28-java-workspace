package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
		
	
	public static void main(String[] args) {
		
		List<Integer> LottoNum = new ArrayList<>();
		Random random = new Random();
	
		while(LottoNum.size() < 6 ){
			int number = random.nextInt(45) +1 ;
			if(LottoNum.contains(number)) {
			} else {
				LottoNum.add(number);
			} 
        }
		System.out.println("로또 번호: " + LottoNum);
	}
}
