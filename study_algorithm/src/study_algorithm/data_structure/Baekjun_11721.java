package study_algorithm;


import java.util.Scanner;

public class Baekjun_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String sData = sc.next();
		
		char[] charArry = sData.toCharArray();
		
		for(var i=0; i<charArry.length; i++) {
			
			System.out.print(charArry[i]);
			
			if((i+1)%10 == 0) {
				System.out.println();
			}
			
		}

	
	}

}
