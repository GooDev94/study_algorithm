package study_programmers_algorithm;

public class Programmers_181940 {

	/*
	 *  코딩 테스트 연습 > 코딩 기초 트레이닝 > 문자열 곱하기
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(solution("love", 10));

	}
	
	public static String solution(String my_string, int k) {
		//최근에 배운 String repeat 메소드를 사용하였다.
        String answer = my_string.repeat(k);
        return answer;
    }

}
