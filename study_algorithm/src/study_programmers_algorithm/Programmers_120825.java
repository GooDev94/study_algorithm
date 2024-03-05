package study_programmers_algorithm;

public class Programmers_120825 {

	/*
	 *  코딩테스트 연습 > 코딩테스트 입문 > 문자 반복 출력하기
	 * */
	public static void main(String[] args) {
		
		System.out.println(solution("hello", 3));
		
	}
	
	public static String solution(String my_string, int n) {
				
        String answer = "";
        
        //1. 중첩 for 문 사용
        /*
        char[] textArr = my_string.toCharArray();
        for(int j=0; j<textArr.length; j++) {        	
        	for(int i=0; i<n; i++) {
        		answer += textArr[j];
        	}
        }
        */
        
        //2. String 문자열 반복을 해주는 repeat 메서드 사용
        String[] textArr = my_string.split("");        
        for(int j=0; j<textArr.length; j++) {
    		answer += textArr[j].repeat(n);
        }
        
        return answer;
    }

}
