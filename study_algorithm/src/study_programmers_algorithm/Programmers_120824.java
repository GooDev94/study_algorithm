package study_programmers_algorithm;

public class Programmers_120824 {
	
	/*
	 * 코딩테스트 > 코딩테스트 입문 > 짝수 홀수 개수
	 * */

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		solution(arr);

	}

	 public static int[] solution(int[] num_list) {        
	        
	        int odd = 0; 
	        int even = 0;
	        
	        for(int num : num_list) {
	        	if(num%2==0) even++;
	        	else odd++;
        	}
	        
	        int[] answer = {even, odd};
	        
	        return answer;
	    }
}
