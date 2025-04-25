package study_programmers_algorithm;

import java.util.Arrays;

public class Programmers_12903 {

	/* 
	 * 코딩테스트 연습 > 연습문제 > 가운데 글자 가져오기	
	 * */
	public static void main(String[] args) {
		String s = "zhangR";
		System.out.println(solution(s));

	}
	
	public static String solution(String s) {
        String answer = "";
     
        char[] alArr = s.toCharArray();
        int tot = alArr.length/2;
        if(alArr.length%2 == 1) {
        	answer = s.substring(tot, tot +1);
        }else {
        	answer = s.substring(tot-1, tot+1);
        }
        return answer;
    }

}
