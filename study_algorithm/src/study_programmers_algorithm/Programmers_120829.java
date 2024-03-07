package study_programmers_algorithm;

import java.util.Arrays;

public class Programmers_120829 {
	
	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 각도기
	 * */
	public static void main(String[] args) {
		System.out.println(solution(180));

	}
	
	public static int solution(int angle) {
        int answer = 0;
        
        if(angle == 90) {
        	answer = 2;
        }else if(angle < 90) {
        	answer = 1;
        }else if(90 < angle && angle < 180) {
        	answer = 3;
        }else if(angle == 180) {
        	answer = 4;
        }
        
        return answer;
    }
}
