package study_bronze_algorithm.section7_bronze4;

import java.util.Scanner;

public class Day18_20499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String kda = sc.nextLine();
		
		String[] kdaArr = kda.split("/");
		if(Integer.parseInt(kdaArr[0]) + Integer.parseInt(kdaArr[2]) < Integer.parseInt(kdaArr[1]) || Integer.parseInt(kdaArr[1]) == 0)	
			System.out.println("hasu");
		else 
			System.out.println("gosu");
		

	}

}
