package self_study_algorithm.bronze2;

import java.util.Scanner;

public class Bronze2_2711 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			char[] txtArr = sc.next().toCharArray();
			
			for(int j=0; j<txtArr.length; j++) {
				if(j != (n-1)) {
					System.out.print(txtArr[j]);
				}
				
			}
			System.out.println();
		}
		
	} 
}
