package study_programmers_algorithm;

public class Programmers_120809 {
	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 배열 두 배 만들기
	 * */
	public static void main(String[] args) {
		int[] numebers = {1, 2, 3, 4, 5};
		System.out.println(solution(numebers));
	}
	
	public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++) {
        	answer[i] = numbers[i]*2;
        }
        
        return answer;
    }

}
