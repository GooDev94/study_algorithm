package java_algorithm_class;

import java.util.Scanner;

public class String_05 {

	/*
	 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	   특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c_str = sc.next().toCharArray();
		String answer = "";
		
//		for(int i=0; i<c_str.length; i++) {			
//			if((c_str[i]>=65 && c_str[i]<=90) || (c_str[i]>=97&&c_str[i]<=122)) {
//				//rt의 특수문자여부 체크필요
//				int lt=i, rt=c_str.length-1-i;
//				if((c_str[rt]>=65 && c_str[rt]<=90) || (c_str[rt]>=97&&c_str[rt]<=122)) {
//					if(lt<rt) {	//제한을 해주지 않으면 계속 돌기 때문에	
//						char tmp = c_str[lt];
//						c_str[lt] = c_str[rt];
//						c_str[rt] = tmp;
//						lt++;
//						rt--;
//					}
//				}
//				
//			}
//			answer += c_str[i];
//		}

		int lt=0, rt=c_str.length-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(c_str[lt])) lt++;
			else if (!Character.isAlphabetic(c_str[rt])) rt--;
			else {
				char tmp =  c_str[lt];
				c_str[lt] = c_str[rt];
				c_str[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		answer = String.valueOf(c_str);
		
		System.out.println(answer);
	}

}
