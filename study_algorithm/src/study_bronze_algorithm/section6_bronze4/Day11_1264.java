package study_bronze_algorithm.section6_bronze4;

import java.util.Scanner;

public class Day11_1264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 배운 방법
		while(true) {
			String text = sc.nextLine();
			if(text.equals("#")) break;
			char[] textArr = text.toLowerCase().toCharArray();
			int num = 0;	
			for(int i=0; i<textArr.length; i++) {
			
				if(textArr[i] == 'a' || textArr[i] ==  'e' || textArr[i] ==  'i' || textArr[i] ==  'o' || textArr[i] ==  'u') {
					num ++;
				}
				
			}
		System.out.println(num);
		}
		*/
		
		//내 방법
		char[] al = { 'a', 'e', 'i', 'o', 'u'};
		
		while(true) {
			String text = sc.nextLine();
			
			if(text.equals("#")) break;
			
			char[] textArr = text.toLowerCase().toCharArray();
			int num = 0;	
			
			for(int i=0; i<textArr.length; i++) {			
				for(int j=0; j<al.length; j++) {
					if(textArr[i] == al[j]) {
						num ++;
					}
				}
			}
			
			System.out.println(num);
		}
	}

}
