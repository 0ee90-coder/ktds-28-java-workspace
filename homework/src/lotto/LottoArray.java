package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoArray {

	 public static void main(String[] args) {
	        int[] lottoNumbers = new int[6];
	        int count = 0;
	        Random random = new Random();
	        
	        while(count < 6) {
	        	int number = random.nextInt(45) + 1;
	        	boolean isDuplicate = false;
	        	
	        	for(int i=0; i<lottoNumbers.length; i++) {
	        		if (lottoNumbers[i] == number) {
	        			isDuplicate = true;
	        		}
	        	}
	        	
	        	if (isDuplicate == false) {
	        		lottoNumbers[count] = number;
	        		count ++;
	        		
	        	}
	        }
	        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
	     }
	}

