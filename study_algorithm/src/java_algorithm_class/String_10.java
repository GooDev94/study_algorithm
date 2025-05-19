package java_algorithm_class;

import java.util.Scanner;

public class String_10 {

	/* (도움)
	 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char c = (char) sc.next().charAt(0);
		int p = 1000;
		
		int[] arr = new int[str.length()];
		
		//1. 앞에서 체크한 특정 문자 c의 위치
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				p=0;
				arr[i] = p;
			}else {
				p++;
				arr[i] = p;
			}
		}
		
		p = 1000;
		//2. 뒤에서 체크한 특정 문자 c의 위치
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) == c) p=0; 
			else {
				p++;
				arr[i] = Math.min(arr[i], p);
			}
		}
		
		for(int i: arr) {			
			System.out.print(i + " ");
		}
	}

}
