package study_programmers_algorithm;

import java.util.Arrays;

public class Programmers_120811 {
	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 중앙값 구하기
	 * */
	public static void main(String[] args) {
		int[] numebers = {1, 2, 7, 10, 11};
		System.out.println(solution(numebers));
	}
	
	public static int solution(int[] array) {
		 int answer = 0;
		 
		 Arrays.sort(array);
	     return array[array.length/2];
    }
}
