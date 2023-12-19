package study_bronze_algorithm.section3_bronze5;

import java.util.Scanner;

public class Day17_9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for(int i=0; i<T; i++) {
			String txt = sc.nextLine();
			String answer = txt.substring(0, 1) + txt.substring(txt.length()-1);
			System.out.println(answer);
		}

	}

}
