package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day5_10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int a = sc.nextInt();
		a = a < 40 ? 40 : a;
		
		int b = sc.nextInt();
		b = b < 40 ? 40 : b;
		
		int c = sc.nextInt();
		c = c < 40 ? 40 : c;
		
		int d = sc.nextInt();
		d = d < 40 ? 40 : d;
		
		int e = sc.nextInt();
		e = e < 40 ? 40 : e;
		
		System.out.println((a+b+c+d+e)/5);
		 */
		int sum = 0;
		for(int i=0; i<5; i++) {
			int tmp = sc.nextInt();
			tmp = tmp < 40 ? 40 : tmp;
			//if(tmp<40) tmp = 40;
			
			sum += tmp;
		}
		
		System.out.println(sum/5);
	}

}
