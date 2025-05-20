package study_programmers_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Programmers_12916 {

	/*
	 * 코딩테스트 연습 > 연습 문제 > 문자열 내 p와 y의 개수
	 * */
	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(solution(s));

	}
	
	public static boolean solution(String s) {
		int p = 0;
		int y = 0;
		for(char x: s.toUpperCase().toCharArray()) {
			if(x == 'P') p++;
			else if(x == 'Y') y++;
		}
		
		if(p != y) return false;
		else return true;
		
    }

}
