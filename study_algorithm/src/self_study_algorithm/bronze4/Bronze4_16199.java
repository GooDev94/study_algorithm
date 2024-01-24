package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_16199 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int birthY = sc.nextInt(); 
		int birthM = sc.nextInt(); 
		int birthD = sc.nextInt();
		
		int todayY = sc.nextInt(); 
		int todayM = sc.nextInt(); 
		int todayD = sc.nextInt();
		
		int year = todayY - birthY;
		
		//만 나이

		
		if(birthM < todayM) System.out.println(year);
        else if(birthM==todayM && birthD<=todayD) System.out.println(year);
        else System.out.println(year-1);
		
		//세 나이
		System.out.println(year+1);
		//연 나이
		System.out.println(year);

	}

}
