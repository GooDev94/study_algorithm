package study_programmers_algorithm;

public class Programmers_120814 {
	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 피자 나눠 먹기(1)
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(solution(15));

		}
		
		public static int solution(int n) {
			int answer = n/7;			
			if(n%7 > 0) answer++;
			
	        return answer;
	        
	        /* 정수론을 이용한 방법
	          6은 어떤 수를 7로 나누면 나머지가 0부터 6까지만 들어가 있기 때문에 나머지가 
	          int는 정수를 반환하기 때문에 나누었을 때 소수점 이하는 모두 버리고 정수 부분만 반환
	         */
	        //return (n + 6) / 7;
		}

}
