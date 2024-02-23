package self_study_algorithm.just_study;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_2914 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int a = Integer.parseInt(st.nextToken());
		int i = Integer.parseInt(st.nextToken());
		
		System.out.println(a * (i-1) +1 );
		

	}

}
