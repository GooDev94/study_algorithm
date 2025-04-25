package study_programmers_algorithm;

import java.util.Arrays;

public class Programmers_12910 {

	/* 
	 * 코딩테스트 연습 > 연습문제 > 나누어 떨어지는 숫자 배열
	 * */
	public static void main(String[] args) {
		int[] arr = {3,2,6};
		System.out.println(solution(arr, 1));

	}
	
	public static int[] solution(int[] arr, int divisor) {
        int cnt = 0;	//나누어 떨어지는 횟수
        int num = 0;
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%divisor == 0) {
        		cnt++;
        	}
        }
        
        int[] answer = new int[cnt];
        if(cnt == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%divisor == 0) {
        		answer[num] = arr[i];
        		num++;
        	}
        }
        
        Arrays.sort(answer);
        
        return answer;
    }

}
