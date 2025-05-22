package java_algorithm_class;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Array_08 {
	/*
	 * 
	 *  N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.

		같은 점수가 입력될 경우 높은 등수로 동일 처리한다.

		즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int[n];
		//같은 점수가 있을 경우, 다음 등수는 같은 등수 만큼 +하여 등수 책정		
		
		for(int i=0; i<n; i++) {			
			score[i] = sc.nextInt();
		}
				
		int[] answer = new int[n];
		for(int i=0; i<n; i++) {
			int cnt = 1;
			for(int j=0; j<n; j++) {
				// ** 마지막 if 조건을 생각해내는데 오래걸림! 주의할 것 
				if(score[j] > score[i]) {
					cnt++;
				}
				answer[i] = cnt;
			}
			System.out.print(answer[i] + " ");
			
		}
		
	}

}
