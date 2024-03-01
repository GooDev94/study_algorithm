package study_programmers_algorithm;

public class Programmers_181838 {

	/* 프로그래머스 > 코딩테스트 연습 > 코딩 기초 트레이닝 > 날짜 비교
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] date1 = {2021, 12, 29};
		int[] date2 = {2021, 12, 28};
		
		System.out.println(solution(date1, date2));
		

	}
	
	public static int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        if(date1[0] == date2[0]) {
        	//달 비교
        	if(date1[1] == date2[1]) {
        		if(date1[2] < date2[2]) {
        			System.out.println("일 :: 1");
        			answer = 1;
        		}
        	}else if (date1[1] < date2[1]){
        		answer = 1;
        	}
        }else if (date1[0] < date2[0]){
        	answer = 1;
        }
        
        return answer;
    }

}
