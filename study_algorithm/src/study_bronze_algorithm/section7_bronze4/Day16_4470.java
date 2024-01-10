package study_bronze_algorithm.section7_bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Day16_4470 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 내 방법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		for(int i=1; i<=N; i++) {
			bw.write(i + ". "+ br.readLine() + "\n");
		}
		bw.flush();
		bw.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		//한줄 다음에 있는 텍스트를 가져와야하기 때문에 nextLine사용
		for(int i=1; i<=N; i++) {
			System.out.println(i+". " + sc.nextLine());
		}
	}

}
