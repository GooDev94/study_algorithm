package study_programmers_algorithm;

public class Programmers_120831 {
	/*
	 *  코딩테스트 연습 > 코딩테스트 입문 > 짝수의 합
	 * */
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
        	if(i%2 == 0) answer += i;
        }
        
        /* i를 2씩 늘려서 짝수로 만들어 진행하는 방법
        for(int i=0; i<=n; i+=2) {
        	answer += i;
        }
        */
        return answer;
    }

}
