package study_programmers_algorithm;

import java.util.Arrays;

public class Programmers_120583 {

	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 중복된 숫자 개수
	 * */
	public static void main(String[] args) {
		int[] arr = {0, 2, 3, 4};
		System.out.println(solution(arr, 1));

	}
	
	public static int solution(int[] array, int n) {
		 
		 /*	1. for문을 사용한 방법
		 int answer = 0; 
		 
		 for(int i : array) { 
			 if(i == n) answer++;
		 }
		 
         return answer;
		 */
		 
		return (int) Arrays.stream(array)
				.filter(e -> e == n)
				.count();
    }

}
