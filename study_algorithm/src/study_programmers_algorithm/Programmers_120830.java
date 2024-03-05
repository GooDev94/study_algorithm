package study_programmers_algorithm;

public class Programmers_120830 {
	
	/*
	 *  코딩테스트 연습 > 코딩테스트 입문 > 양꼬치
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(solution(64, 6) );
	}

	public static int solution(int n, int k) {
        int answer = n*12000;
        int free = n/10;
        answer = answer + (k-free)*2000;
        
        return answer;
    }

}
