package study_programmers_algorithm;

public class Programmers_181937 {

	/*
	 * 코딩테스트 연습 > 코딩 기초 트레이닝 > n의 배수
	 * */
	public static void main(String[] args) {
		System.out.println(solution(34, 3));

	}
	
	public static int solution(int num, int n) {
        int answer = 0;
        
        if(num%n == 0) answer = 1;
        else answer = 0;
        
        return answer;
    }
}
