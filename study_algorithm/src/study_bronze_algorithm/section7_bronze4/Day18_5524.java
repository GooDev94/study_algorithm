package study_bronze_algorithm.section7_bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Day18_5524 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 내 방법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			
			bw.write(br.readLine().toLowerCase() + "\n");
		}
		bw.flush();
		bw.close();
		 */
		
		Scanner sc = new  Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			//next와 nextLine : next는 공백이 있을 때 / nextLine은 줄단위
			System.out.println(sc.next().toLowerCase());
		}
		
	}

}
