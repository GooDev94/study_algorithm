package java_algorithm_class_self;

import java.util.Scanner;

public class SelfBOJ_11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int factor = 2;			//소인수분해 시작 소수 2
		
		while(n>1) {
			//나누려는 소수와 같을 경우 멈춤
			if(n == factor) {
				System.out.println(factor);
				break;
			}
			
			if(n%factor == 0) {
				n = n/factor;
				System.out.println(factor);
			}else {
				factor++;
				
			}
			
		}

	}

}
