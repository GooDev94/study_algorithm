package study_bronze_algorithm.section7_bronze4;

import java.util.Scanner;

public class Day19_4299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hap = sc.nextInt();
		int cha = sc.nextInt();
		
		int a = ((hap+cha)/2);
		int b = ((hap-cha)/2);
		
		if(cha > hap) System.out.println("-1");
		else {
			if(a+b == hap && a-b == cha) {
				System.out.println(a+ " " + b);
			}else {
				System.out.println("-1");
			}
			
		}

	}

}
