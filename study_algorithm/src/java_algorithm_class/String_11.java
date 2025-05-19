package java_algorithm_class;

import java.util.Scanner;

public class String_11 {

	/* (도움) 
	 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
	   문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
	   단 반복횟수가 1인 경우 생략합니다.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next() + " ";
		String answer = "";		//i+1 로 한칸을 더 가기 때문에 추가
		int num = 1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				//같을 경우에는 숫자 up
				num++;
			}else {
				//다를 경우 값을 쌓아주고
				answer += str.charAt(i);
				//숫자가 1 초과일 때만 숫자를 붙여주고 기존 숫자는 리셋
				if(num > 1)  answer += String.valueOf(num);
				num = 1;
			}
		}
		
		System.out.println(answer);

	}

}
