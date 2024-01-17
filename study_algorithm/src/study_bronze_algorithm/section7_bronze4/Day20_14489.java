package study_bronze_algorithm.section7_bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day20_14489 {

	public static void main(String[] args) throws IOException {
		/* 내 방법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer( br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int chi = Integer.parseInt(br.readLine());
		
		if(chi*2 > a+b) bw.write(a+b + "\n");
		else bw.write((a+b)-chi*2 + "\n");
		
		bw.flush();
		bw.close();

		*/
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b >= c*2) System.out.println((a+b)-(c*2));
		else System.out.println((a+b));
	}

}
