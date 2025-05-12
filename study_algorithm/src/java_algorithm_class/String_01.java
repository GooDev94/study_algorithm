package java_algorithm_class;

import java.util.Scanner;

public class String_01 {
	/* 1. 문자 찾기
	 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요
		대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
	 * */

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		/* My solution
		 char[] text = in.nextLine().toUpperCase().toCharArray();
		 char c = in.nextLine().toUpperCase().charAt(0);
		 
		 int num = 0;
		 for(int i=0; i<text.length; i++) {
			if(text[i] == c) {
				num++;
			}
		 }
		*/
		
		
		/* 1. String length 로도 할 수 있음. char로 비교해야하기 때문에 charAt(i)로 비교할 것
		int num = 0;
		String text = in.next().toUpperCase();
	    char c = in.next().charAt(0);
		c = Character.toUpperCase(c);
		
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) == c) {
				num++;
			}
		}
		*/
		
		//2. 향상된 for문 사용하기 
		int num = 0;
		String text = in.next().toUpperCase();
	    char c = in.next().charAt(0);
		c = Character.toUpperCase(c);
		
		//for (char x : 배열) 이 와야함
		for(char x: text.toCharArray()) {
			if(x == c) {
				num++;
			}
		}
	    
	    System.out.println(num);
	    
		
	}

}
