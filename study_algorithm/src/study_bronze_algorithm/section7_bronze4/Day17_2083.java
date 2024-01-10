package study_bronze_algorithm.section7_bronze4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Day17_2083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			/* 내 방법
			String nm = sc.next();
			int age = sc.nextInt();
			int weight = sc.nextInt();
			
			if(nm.equals("#")) break;
			
			if(age > 17 || weight >= 80) System.out.println(nm + " " + "Senior");
			else System.out.println(nm + " " + "Junior");
			*/
			
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			String nm = st.nextToken();
			int age = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			if(nm.equals("#") && age==0 && weight==0) break;
			if(age > 17 || weight >= 80) System.out.println(nm + " " + "Senior");
			else System.out.println(nm + " " + "Junior");
		}

	}

}
