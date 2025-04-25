package study_programmers_algorithm;

import java.util.Arrays;

public class Programmers_12912 {

	/* 
	 * 코딩테스트 연습 > 연습문제 > 두 정수사이의 합
	 * */
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		System.out.println(solution(a, b));

	}
	
	public static long solution(int a, int b) {
        long answer = 0;
        
        /* 혼자한 방법
         * Math 함수를 이용하자 
        int max = a;
        int min = b;
        if(b > a) {
        	max = b;
        	min = a;
        }
        */
        
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
    	while(true) {
    		if(max < min) {
    			break;
    		}
    		
    		answer += min;
    		min++;
    	}
        
        return answer;
    }

}
