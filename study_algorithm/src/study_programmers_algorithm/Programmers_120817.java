package study_programmers_algorithm;

public class Programmers_120817 {

	/*
	 *  코딩테스트 연습 > 코딩테스트 입문 > 배열의 평균값
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numebers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(solution(numebers ));
	}
	
	public static double solution(int[] numbers) {
		double avg = 0.0;
		for(int i=0; i<numbers.length; i++) {
			avg += numbers[i];
		}
        double answer = avg/numbers.length;
        return answer;
    }

}
