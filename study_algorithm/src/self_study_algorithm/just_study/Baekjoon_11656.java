package self_study_algorithm.just_study;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_11656 {
	/*
	 * BOJ_11656 [정렬] 접미사 배열 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ca = sc.next();
		
		String[] sa = new String[ca.length()];
		for(int i=0; i<ca.length(); i++) {
			sa[i] = ca.substring(i, ca.length());
		}

		Arrays.sort(sa);
		
		for(String a : sa) {
			System.out.println(a);
		}
		
	}

}
