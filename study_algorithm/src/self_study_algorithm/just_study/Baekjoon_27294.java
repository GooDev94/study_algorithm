package self_study_algorithm.just_study;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_27294 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int t = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
			
		
		if(t<=11) {
			System.out.println(280);
		}else if(12 <=t && t<=16) {
			if(s == 0) {
				System.out.println(320);
			}else {
				System.out.println(280);
			}
		}else {
			System.out.println(280);
		}

	}

}
