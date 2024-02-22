package self_study_algorithm.just_study;

import java.util.Scanner;

public class Baekjoon_25372 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			char[] arr = sc.next().toCharArray();
			if(6<=arr.length && arr.length <=9) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}

	}

}
