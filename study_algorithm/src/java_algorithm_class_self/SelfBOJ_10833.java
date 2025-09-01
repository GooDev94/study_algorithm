package java_algorithm_class_self;

import java.util.Scanner;

public class SelfBOJ_10833 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int leftNum = 0;
		for(int i=0; i<n; i++) {
			int student = sc.nextInt();
			int apple = sc.nextInt();
			
			leftNum += apple%student;
			
		}
		
		
		System.out.println(leftNum);
	}

}
