package study_bronze_algorithm.section7_bronze4;

import java.util.Scanner;

public class Day16_17388 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int K = sc.nextInt();
		int H = sc.nextInt();
		
		/* 내 방법
		if(S+K+H < 100) {
			int min = Math.min(S, Math.min(K, H));
			if(min == S) System.out.println("Soongsil");
			else if(min == K) System.out.println("Korea");
			else System.out.println("Hanyang");
		}else {
			System.out.println("OK");
		}				
		 */
		
		if(S+K+H >= 100) {
			System.out.println("OK");
		}else if(S<H && S<K){
			System.out.println("Soongsil");
		}else if(H<S && H<K){
			 System.out.println("Korea");
		}else{
			 System.out.println("Hanyang");
		}
		
		
	}

}
