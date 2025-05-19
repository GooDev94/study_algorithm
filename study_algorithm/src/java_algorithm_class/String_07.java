package java_algorithm_class;

import java.util.Scanner;

public class String_07 {

	/* 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
		문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
		단 회문을 검사할 때 대소문자를 구분하지 않습니다.
	 * 
	 * */
	public static void main(String[] args) {
		//My Solution
			/*
			//1. 단어 대문자로 변경
			Scanner sc = new Scanner(System.in);
			String str = sc.next().toUpperCase();
			
			//2. lt, rt로 비교하여 같은 값을 가졌을 때 true, false로 (charAt)  
			int lt=0, rt=str.length()-1;
			boolean goOrNot = true;
			while(lt<rt) {			
				if(str.charAt(lt) == str.charAt(rt)) {
					lt++; 
					rt--;
					goOrNot = true;
				}else {
					goOrNot = false;
					System.out.println("NO");
					break;
				}
				
			}
			
			if(goOrNot) {
				System.out.println("YES"); 
			}
			*/
		
		//2로 나누어 그 앞까지만 도는 방식으로
		/* 2) length 사용
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int len = str.length();
		String answer = "YES";
		
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-1-i)) answer = "NO";
		}
		
		System.out.println(answer);
		*/
		
		//3) StringBuilder의 reverse를 사용하여 뒤집어진 값과 원래 문자열이 동일한지의 여부체크 하는 방법
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String answer = "NO";
		String reverse = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(reverse)) answer = "YES";
		
		System.out.println(answer);
		
		
	}

}
