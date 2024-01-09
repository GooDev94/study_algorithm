package study_bronze_algorithm.section6_bronze4;

import java.util.Scanner;

public class Day15_5575 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			int st_hour = sc.nextInt();
			int st_min = sc.nextInt();
			int st_sec = sc.nextInt();
			int end_hour = sc.nextInt();
			int end_min = sc.nextInt();
			int end_sec = sc.nextInt();
//			
//			int w_hour = end_hour - st_hour;
//			int w_min = end_min - st_min;			
//			int w_sec = end_sec - st_sec;
////			
//			if( w_sec < 0) {
//				if(w_min == 0) {
//					w_min = 59;
//					w_hour--; 
//				}else {
//					w_min--;
//				}
//				w_sec = w_sec + 60;
//			}
			
			if(st_sec > end_hour) {
				end_sec +=end_sec;
				end_min--;
			}
			
			end_sec -= st_sec;
			
			if(st_min > end_min) {
				end_min +=60;
				end_hour--;
			}
			
			end_min -= st_min;
			end_hour -= st_hour;
			
		
			System.out.println(end_hour + " " + end_min + " " + end_sec);
		}

	}

}
