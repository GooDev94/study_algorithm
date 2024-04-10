package study_programmers_algorithm;

public class Programmers_120833 {

	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 배열 자르기
	 * */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		System.out.println(solution(arr, num1, num2));

	}
	
	public static int[] solution(int[] numbers, int num1, int num2){
		// TODO Auto-generated method stub
		int[] answer = new int[num2-num1+1];
		
		int n = 0;
		for(int i=num1; i<=num2; i++) {
			answer[n++] = numbers[i];
		}
        return answer;
	}

}
