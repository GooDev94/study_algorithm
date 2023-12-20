package study_bronze_algorithm.section3_bronze5;

import java.util.Scanner;

public class Day20_2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] txt = sc.nextLine().toCharArray();
		for(int i=0; i<txt.length; i++) {
			char tmp = txt[i];
			if(tmp>='a' && tmp<='z') {
				//char를 사용하지 않을 경우 숫자로만 나오기 때문에 char로 캐스팅해주기
				System.out.print((char)(tmp - 32));
			}else {
				//대문자에 해당
				System.out.print((char)(tmp + 32));
			}
		}
		
	}

}
