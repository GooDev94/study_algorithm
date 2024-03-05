package study_programmers_algorithm;

public class Programmers_120818 {

	/*
	 *  코딩테스트 연습 > 코딩테스트 입문 > 옷가게 할인 받기
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(solution(150000));
	}

	public static int solution(int price) {
        int answer = price;
        if(price >= 500000) {
        	answer =(int) (price*0.8);
        }else if(price >= 300000) {
        	answer =(int) (price*0.9);
        } else if(price >= 100000) {
        	answer =(int) (price*0.95);
        }
        
        return answer;
    }
}
