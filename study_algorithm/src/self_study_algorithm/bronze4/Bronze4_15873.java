package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_15873 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		
		int a, b;
		
		if(num.length() == 2) {			//2개일 경우
			a = Integer.parseInt(num.substring(0, 1));
			b = Integer.parseInt(num.substring(1, 2));			
			
		}else if(num.length() == 3) {
			//3개일 경우
			if(num.length()-1 == num.lastIndexOf('0')) {
				//맨 마지막 글자가 0일 때
				a = Integer.parseInt(num.substring(0, 1));
				b = Integer.parseInt(num.substring(1, num.length()));
			}else {
				a = Integer.parseInt(num.substring(0, 2));
				b = Integer.parseInt(num.substring(2, num.length()));
			}		
		}else {
			//4개일 경우
			a = Integer.parseInt(num.substring(0, 2));
			b = Integer.parseInt(num.substring(2, num.length()));
		}
		

		System.out.println(a+b);

	}

}
