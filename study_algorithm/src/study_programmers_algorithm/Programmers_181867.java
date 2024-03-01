package study_programmers_algorithm;

import java.util.Scanner;

public class Programmers_181867 {

	/*
	 * 프로그래머스 > 코딩테스트 연습 > 코딩 기초 트레이닝 > x 사이의 개수
	 * 
	 * oxooxoxxox
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String myString = sc.nextLine();
		String[] arr = myString.split("x", -1);
		int[] answer = new int[arr.length];
		for(int i=0; i<arr.length; i++) {			
			answer[i] = arr[i].length();
		}
		
		System.out.print("[");
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]);
			if(i < answer.length-1) {
				System.out.print(", ");
			}
			
		}
		System.out.print("]");
	}

}
