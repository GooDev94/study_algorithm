package study_bronze_algorithm.section4_bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Day4_25304 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//총 금액
		int X = Integer.parseInt(br.readLine());
		
		//물건종류
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sum += a*b;
		}
		
		if(sum == X) bw.write("Yes");
		else bw.write("No");
		
		bw.flush();
		bw.close();
	}

}
