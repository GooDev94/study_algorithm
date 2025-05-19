package java_algorithm_class;

import java.util.Scanner;

public class String_09 {
	/*
	 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
	   만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
	   추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* My Solution
		String str = sc.nextLine().replaceAll("[^0-9]","");
		System.out.println(Integer.parseInt(str));
	 	*/
		
		String str = sc.nextLine().replaceAll("[^0-9]","");
		int answer = 0;
		String answer_str = "";
		for(char x: str.toCharArray()) {
			//2. ascii 사용  0은 48 / 9는 57
			//if(x>=48 && x<=57) answer = answer*10+(x-48);
			
			//3. isDigit 사용
			if(Character.isDigit(x)) answer_str += x;
		}
		System.out.println(Integer.parseInt(answer_str));
	}

}
