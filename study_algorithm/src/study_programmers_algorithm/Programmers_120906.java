package study_programmers_algorithm;

public class Programmers_120906 {
	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 자릿수 더하기
	 * 
	 * */
	public static void main(String[] args) {
		
		System.out.println(solution(930211));

	}
	
	public static int solution(int n) {
        int answer = 0;
        
        //1. String substring을 사용함
        String nTxt = String.valueOf(n);
        for(int i=0; i<nTxt.length(); i++) {
        	answer += Integer.parseInt(nTxt.substring(i, i+1));
        }
        
        //String[] s = Integer.toString(n).split("");
        //split을 사용하여 String 배열로 만들어 for문을 돌리는 방법
        
        return answer;
    }

}
