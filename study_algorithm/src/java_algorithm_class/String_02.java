package java_algorithm_class;

import java.util.Scanner;

public class String_02 {

	/* 2. 대소문자 변환
	 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
	 * 
	 * */
	public static void main(String[] args) {
		/* 1. My solution - 아스키 코드를 활용
		 * 굳이 int로 형변환하여 진행하지 않아도 됨
		Scanner in=new Scanner(System.in);
		char[] str = in.next().toCharArray();
		for(int i=0; i<str.length; i++) {
			//대문자 65~90, 소문자 97~122 (차: 32)
			if((int) str[i] < 96) {
				str[i] = (char) ((int) str[i] + 32);
				
			}else {
				str[i] = (char) ((int) str[i] - 32);
			}
			System.out.print(str[i]);
		}
		
	    return ;
	    */
		
		
		Scanner in=new Scanner(System.in);
		String str = in.next();
		String answer = "";
		for(char x: str.toCharArray()) {
			/* 2. isLowerCase 함수를 사용하여 소문자 여부를 체크
			if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
			*/
			
			//character를 부등호로 비교하면 비교가 되고 연산도 가능
			if(x>=97 && x<=122) answer += (char) (x-32);
			else answer += (char) (x+32);
		}
		
		System.out.println(answer);
		return;
	}

}
