package java_algorithm_class_self;

import java.util.Scanner;

public class SelfBOJ_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int r = sc.nextInt();
			//next() 인 이유 : nextLine()으로 입력 받으면 입력과정의 공백까지 읽기 때문
			//대문자만 값으로 가지고 있는다고 했기 때문에 혹시 몰라서 toUpperCase 사용
			String str = sc.next().toUpperCase();		
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<r; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
