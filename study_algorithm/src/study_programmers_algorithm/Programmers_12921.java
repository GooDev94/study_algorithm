package study_programmers_algorithm;

public class Programmers_12921 {
	/*
	 * 코딩테스트 연습 > 연습 문제 > 소수 찾기
	 * */
	public static void main(String[] args) {
		int n = 5;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        
        for(int i=2; i<=n; i++) {
        	if(arr[i] == 0) {
        		answer++;
        		for(int j=i; j<=n; j=j+i) arr[j] = 1;
        	}
    	}
        
        return answer;
    }

}
