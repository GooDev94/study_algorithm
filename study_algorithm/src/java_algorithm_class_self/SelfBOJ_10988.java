package java_algorithm_class_self;

import java.util.Scanner;

public class SelfBOJ_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] spelling = sc.next().toCharArray();
		
		int alpha = (spelling.length)/2;
		int remain = (spelling.length)%2;
		int end_plus = 1;
		
		while(alpha > 0) {
			//짝수 일 때
			if(remain==0) {
				int start = alpha;
				int end = alpha+end_plus;
				
				if(spelling[start-1] != spelling[end-1]) {
					System.out.println(0);
					break;
				}
				
				
			}else {
				//홀수 일 때
				int start = alpha;
				int end = alpha+(end_plus+1);
				
				if(spelling[start-1] != spelling[end-1]) {
					System.out.println(0);
					break;
				}
			}
			alpha--;
			end_plus = end_plus+2;
		}
		
		if(alpha == 0) {
			System.out.println(1);
		}

	}

}
