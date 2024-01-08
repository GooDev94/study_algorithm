package study_bronze_algorithm.section6_bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Day12_9316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 일부러 BufferedReader를 사용해서 한 내 방식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			bw.write("Hello World, Judge "+ i +"! \n");
		}
		
		bw.flush();
		bw.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			System.out.println("Hello World, Judge "+ i +"!");
		}
		
	}

}
