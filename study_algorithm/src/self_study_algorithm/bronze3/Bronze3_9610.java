package self_study_algorithm.bronze3;

import java.util.Scanner;

public class Bronze3_9610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int axis = 0;
		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int q4 = 0;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			
		    if(x>0 && y>0){
				q1++;
			}else if(x<0 && y>0){
				q2++;
			}else if(x<0 && y<0){
				q3++;
			}else if(x>0 && y<0){
				q4++;
			}else if(x == 0 || y == 0) {
				axis++;
			}
		}
		System.out.println("Q1: " + q1);
		System.out.println("Q2: " + q2);
		System.out.println("Q3: " + q3);
		System.out.println("Q4: " + q4);
		System.out.println("AXIS: " + axis);
	}

}
