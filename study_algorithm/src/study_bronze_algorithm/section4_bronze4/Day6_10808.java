package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day6_10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] AtoZ = new int[26];
		char[] tmp = sc.next().toCharArray();
		for(int i=0; i<tmp.length; i++) {
			//a는 97임, tmp[i]-97 을 통해 a 일경우 tmp[0]에 들어갈 수 있음 
			AtoZ[tmp[i]-97]++;
			
		}
		
		for(int j=0; j<AtoZ.length; j++) {
			System.out.print(AtoZ[j] + " ");
		}
	}

}
