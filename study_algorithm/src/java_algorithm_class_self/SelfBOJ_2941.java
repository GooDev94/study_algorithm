package java_algorithm_class_self;

import java.util.Scanner;

public class SelfBOJ_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
		String str = sc.next();
		
		
		int count = 0;
		for(int i=0; i<alpha.length; i++) {
			str = str.replaceAll(alpha[i], "a");
		}
		
		System.out.println(str.length());
	}

}
