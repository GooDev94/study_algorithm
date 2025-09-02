package java_algorithm_class_self;

import java.util.Scanner;

public class SelfBOJ_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] alpha = {'a', 'b', 'c' , 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s','t','u','v', 'w','x','y','z'};
		int[] alphaIdx = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}; 
		
		char[] strArr = sc.next().toLowerCase().toCharArray();
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<alpha.length; j++) {
				//같을 때 숫자를 넣어주는데
				if(strArr[i] == alpha[j]) {
					if(alphaIdx[j] == -1) {
						alphaIdx[j] = i;
					}
				}
			}
		}
		
		for(int i=0; i<alphaIdx.length; i++) {
			System.out.print(alphaIdx[i] + "");
		}

	}

}
