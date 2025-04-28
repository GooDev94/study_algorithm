package study_programmers_algorithm;

public class Programmers_120826 {

	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 특정 문자 제거하기
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(solution("BCBdbe" , "B"));

	}

	public static String solution(String my_string, String letter) {
        String answer = "";

        
        //1. split을 사용하는 방법
        /*
        String[] arr = my_string.split(letter);

        for(String str : arr) {
        	answer += str;
        }
        */
        
        answer = my_string.replace(letter, "");
        
        return answer;
    }
}
