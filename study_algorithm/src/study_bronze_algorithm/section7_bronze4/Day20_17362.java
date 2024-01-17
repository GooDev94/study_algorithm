package study_bronze_algorithm.section7_bronze4;

import java.util.Scanner;

public class Day20_17362 {

	public static void main(String[] args) {
		//나머지 연산을 풀어야 한다. 나머지가 1~5사이가 되어야 함
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%8==1) System.out.println(1);
		else if(n%8==0||n%8==2) System.out.println(2);
		else if(n%8==3||n%8==7) System.out.println(3);
		else if(n%8==4||n%8==6) System.out.println(4);
		else System.out.println(5);
	}

}
