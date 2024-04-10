package study_programmers_algorithm;

public class Programmers_120837 {

	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 개미 군단
	 * */
	public static void main(String[] args) {
		System.out.println(solution(999));

	}
	
	public static  int solution(int hp) {
        int answer = hp/5;
        answer += (hp%5)/3;
        answer += (hp%5)%3;
        
        return answer;
    }

}
