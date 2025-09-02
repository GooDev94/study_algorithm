package java_algorithm_class_self;

import java.util.Scanner;

public class SelfBOJ_5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 하드 코딩인 것 같아서 다시
		char[] alpha = {'a', 'b', 'c' , 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s','t','u','v', 'w','x','y','z'};
		int[] alphaIdx = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9}; 
		
		String str = sc.next().toLowerCase();
		
		int sum = str.length();
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<alpha.length; j++) {
				if(alpha[j] == str.charAt(i)) {
					sum += alphaIdx[j];
				}
			}
		}
		System.out.println(sum);
		*/
		int sum = 0;
		String str = sc.next().toUpperCase();
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
				case 'A' :
				case 'B' :
				case 'C' :
					sum += 3;
					break;
				case 'D' :
				case 'E' :
				case 'F' :
					sum += 4;
					break;
				case 'G' :
				case 'H' :
				case 'I' :
					sum += 5;
					break;
				case 'J' :
				case 'K' :
				case 'L' :
					sum += 6;
					break;
				case 'M' :
				case 'N' :
				case 'O' :
					sum += 7;
					break;
				case 'P' :
				case 'Q' :
				case 'R' :
				case 'S' :
					sum += 8;
					break;
				case 'T' :
				case 'U' :
				case 'V' :
					sum += 9;
					break;
				case 'W' :
				case 'X' :
				case 'Y' :
				case 'Z' :
					sum += 10;
					break;
			}
		}

		System.out.println(sum);
	}

}
