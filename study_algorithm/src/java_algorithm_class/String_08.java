package java_algorithm_class;

import java.util.Scanner;

public class String_08 {
	/*
	 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
		문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
		단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
		알파벳 이외의 문자들의 무시합니다.
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
		String answer = "YES";
		
		/* 1. My Solution
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-1-i)) answer = "NO"; 
		}
		*/
		
		//2. reverse 사용
		String temp = new StringBuilder(str).reverse().toString();
		if(!str.equals(temp)) answer = "NO";
		
		System.out.println(answer);
		
	}
}
