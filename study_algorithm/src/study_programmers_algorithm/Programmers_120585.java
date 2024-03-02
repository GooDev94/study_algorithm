package study_programmers_algorithm;

public class Programmers_120585 {

	/*
	 *  코딩테스트 연습 > 코딩테스트 입문 > 머쓱이보다 키 큰 사람
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numebers = {149, 180, 192, 170};
		System.out.println(solution(numebers, 167 ));
	}
	
	public static int solution(int[] array, int height) {
		int answer = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > height) {
				answer++;
			}
		}
		
		return answer;
    }

}
