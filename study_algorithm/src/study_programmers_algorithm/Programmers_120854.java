package study_programmers_algorithm;

public class Programmers_120854 {

	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 배열 원소의 길이
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] txt = {"We", "are", "the", "world!"};
		
		System.out.println(solution(txt));
	}

	public static int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		for(int i=0; i<strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
        
        return answer;
    }
	
}
