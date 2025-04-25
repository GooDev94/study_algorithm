package study_programmers_algorithm;

import java.util.Arrays;

public class Programmers_12937 {

	/* 
	 * 코딩테스트 연습 > 연습문제 > 짝수와 홀수
	 * */
	public static void main(String[] args) {
		int num = 4;
		System.out.println(solution(num));

	}
	
	public static String solution(int num) {
        String answer = "";
        //테스트 케이스 중 2개가 실패했던 이유
        // -1 % 2 = -1 이기 때문에 체크를 해줬어야 함 
        if(num%2==1 || num%2==-1) {
        	answer = "Odd";
        }else {
        	answer = "Even";
        }
        return answer;
    }

}
