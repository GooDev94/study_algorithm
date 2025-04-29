package study_programmers_algorithm;

import java.util.Arrays;

public class Programmers_76501 {

	/*
	 * 코딩테스트 연습 > 월간 코드 챌린지 시즌2 > 음양 더하기
	 * */
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		boolean[] signs = {false,false,true};
		System.out.println(solution(arr, signs));

	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i=0; i<absolutes.length; i++) {
			absolutes[i] = signs[i] ? absolutes[i] : -absolutes[i]; 			
			answer += absolutes[i];
		}
        return answer;
    }

}
