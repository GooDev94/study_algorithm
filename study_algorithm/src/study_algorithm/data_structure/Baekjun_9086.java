package study_algorithm;


import java.util.Scanner;

public class Baekjun_9086 {

	public static void main(String[] args) {
		// 문자열
		Scanner sc = new Scanner(System.in);
		
		int testNum = sc.nextInt();
		String testChar = "";
		
		for(var i=0; i<testNum; i++) {
			testChar = sc.next();
			
			char[] firstEnd = testChar.toCharArray();
			int len = firstEnd.length;

			System.out.println(firstEnd[0]+ "" + firstEnd[len-1]);
						
		}
		
	
	}

}
