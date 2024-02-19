package self_study_algorithm.bronze2;

import java.util.Scanner;

public class Bronze2_2789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] textArr = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
		
		char[] inputArr = sc.nextLine().toCharArray();
		
		for(int i=0; i<textArr.length; i++) {
			for(int j=0; j<inputArr.length; j++) {
				if(textArr[i] == inputArr[j]) {
					inputArr[j] = '1';
				}
			}
		}
		
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i] != '1') {
				System.out.print(inputArr[i]);
			}
			
		}

	}

}
