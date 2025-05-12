package java_algorithm_class;

import java.util.Scanner;

public class String_03 {
	
	/* 3. 문장 속 단어
	 * 
	 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
	 * 문장속의 각 단어는 공백으로 구분됩니다.
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 1. My solution
		// (" ") 도 되고 "\\s" 도 됨
		// 단어가 아니라 한 줄을 받아야 함 (next()로 받으면 단어만 찍힘 -> nextLine() 사용)
		String[] str = sc.nextLine().split(" ");
		
		int max = 0;
		for(int i=0; i<str.length; i++) {
			if(str[max].length() < str[i].length()) {
				max = i;
			}
		}
		
		System.out.println(str[max]);
		*/
		
		
		String str = sc.nextLine();
		String answer = "";
		
		/* 최대값 구하는 알고리즘 사용
		int m = Integer.MIN_VALUE; 	//가장 작은 값으로 초기화 세팅
		String[] s = str.split(" ");
		
		for(String x: s) {
			//
			int len = x.length();
			if(len>m) {
				m = len;
				answer = x;
			}
		}
		
		*/
		
		//3. indexOf(), substring() 사용
		int m = Integer.MIN_VALUE, pos;
		while((pos = str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len>m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);		//이미 길이를 확인한 값 뒤부터 진행될 수 있도록 str 잘라주기
		}
	
		if(str.length()>m) answer = str;	//마지막 단어에는 공백이 있을 수 없기 때문에 마지막 단어를 비교해줘야 함
		
		System.out.println(answer);
		
	}

}
