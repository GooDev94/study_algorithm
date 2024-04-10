package study_programmers_algorithm;

public class Programmers_120839 {
	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 가위 바위 보
	 * */
	public static void main(String[] args) {
		System.out.println(solution("205"));

	}
	
	public static String solution(String rsp) {
		StringBuilder sb = new StringBuilder();
		char[] arr = rsp.toCharArray();
		
		for(char a : arr) {
			switch (a) {
				case '2' :
					sb.append('0');
					break;
				case '0' :
					sb.append('5');
					break;
				case '5' :
					sb.append('2');
					break;
			}
			
		}
		
        return sb.toString();
	}

}
