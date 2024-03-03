package study_programmers_algorithm;

public class Programmers_120898 {

	/*
	 * 코딩 테스트 연습 > 코딩테스트 입문 > 편지
	 * */
	public static void main(String[] args) {
		 System.out.println(solution("happy birthday!"));

	}
	
	 public static int solution(String message) {
		 	char[] txt = message.toCharArray();
	        int answer = txt.length*2;
	        return answer;
	    }

}
