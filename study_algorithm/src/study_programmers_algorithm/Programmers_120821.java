package study_programmers_algorithm;

import java.util.Collections;

public class Programmers_120821 {

	/*
	 *  코딩테스트 연습 > 코딩테스트 입문 > 배열 뒤집기
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num_list = {1, 2, 3, 4, 5};
		
		System.out.println(solution(num_list ));
	}
	
	public static int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		
		for(int i = num_list.length - 1, j = 0; i >= 0; i--, j++) {
			answer[j] = num_list[i];
		}
		
        return answer;
    }

}
