package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day1_made_christmas_tree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num-1; j>=0; j--) {
				System.out.print(" ");
				if(j <= i) {
					System.out.print("*");	
				}
			}
			System.out.print(" ");
			System.out.println("");
		}

	}

}
