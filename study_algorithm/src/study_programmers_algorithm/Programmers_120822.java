package study_programmers_algorithm;

public class Programmers_120822 {

	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 문자열 뒤집기
	 * */
	public static void main(String[] args) {
		System.out.println(solution("bread"));

	}
	
	public static String solution(String my_string) {
        String answer = "";
        /* 1. toCharArray 를 사용하여 배열화 하고 for문을 돌려서 answer를 만들어줌
        char[] arr = my_string.toCharArray();
        for(int i=arr.length-1; i>=0; i--) {
        	answer += arr[i];
        }
        
        +) 굳이 char 배열로 만들지 않고 거꾸로 돌리는 방법
     	for(int i=my_string.length()-1; i>=0; i--){
            answer+=my_string.charAt(i);
        }
        */
        
        //2. StringBuilder 의 reverse 함수 사용
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        answer = sb.reverse().toString();
        
        return answer;
    }

}
