package study_programmers_algorithm;

import java.util.Arrays;

public class Programmers_12918 {

	/*
	 * 코딩테스트 연습 > 연습 문제 > 문자열 다루기 기본
	 * */
	public static void main(String[] args) {
		String s = "1203123449";
		System.out.println(solution(s));

	}
	
	 public static boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() >= 4 && s.length() <= 6) {
        	 for(char c: s.toCharArray()) {
             	if(c>64) {
             		answer = false;
             		break;
             	}
             }
        }else {
        	answer = false;
        }
        
        /*정규식 방법
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
        */
        return answer;
    }

}
