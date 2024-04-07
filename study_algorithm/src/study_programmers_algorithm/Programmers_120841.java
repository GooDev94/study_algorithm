package study_programmers_algorithm;

public class Programmers_120841 {
	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 점의 위치 구하기
	 * */
	public static void main(String[] args) {
		int[] dot = {-7, 9};
		System.out.println(solution(dot));

	}
	
	public static int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0] > 0) {
        	if(dot[1] > 0) answer = 1;
        	else answer = 4;
        }else {
        	if(dot[1] > 0) answer = 2;
        	else answer = 3;
        }
        
        return answer;
    }
}
