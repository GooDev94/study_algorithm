package self_study_algorithm.bronze2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze2_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		char[] first = st.nextToken().toCharArray();
		char[] second = st.nextToken().toCharArray();

		int max = 0;
		String nf = String.valueOf(first[2])+String.valueOf(first[1])+String.valueOf(first[0]);
		String ns = String.valueOf(second[2])+String.valueOf(second[1])+String.valueOf(second[0]);
		
		
		System.out.println(Math.max(Integer.parseInt(nf), Integer.parseInt(ns)));
	}

}
