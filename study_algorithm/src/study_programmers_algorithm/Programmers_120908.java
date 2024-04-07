package study_programmers_algorithm;

public class Programmers_120908 {
	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 문자열안에 문자열
	 * */
	public static void main(String[] args) {
		System.out.println(solution("ppprrrogrammers", "pppp"));

	}
	
	public static int solution(String str1, String str2) {
        
        
        /* 1. if 사용
        int answer = 0;
        
        if(str1.contains(str2)) answer = 1;
        else answer = 2;
        
        return answer; 
        */
		
		//삼항 연산자 사용
		return (str1.contains(str2) ? 1 : 2);
        
    }

}
