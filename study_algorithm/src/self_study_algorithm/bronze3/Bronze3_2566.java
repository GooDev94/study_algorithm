package self_study_algorithm.bronze3;

import java.util.Scanner;

public class Bronze3_2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = arr[0][0];
		int row = 0;
		int col = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				max = Math.max(max, arr[i][j]);
				
				if(max == arr[i][j]) {
					row = i+1;
					col = j+1;
				}
				
			}
		}
		
		System.out.println(max);
		System.out.println(row + " " + col);
	}

}
