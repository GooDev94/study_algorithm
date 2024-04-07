package study_programmers_algorithm;

public class Programmers_120819 {

	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 아이스 아메리카노
	 * */
	public static void main(String[] args) {
	
		System.out.println(solution(15000));

	}
	
	public static int[] solution(int money) {
        int[] answer = {money/5500, money%5500};
        
        return answer;
    }
}
