package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_9325 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++) {
			int s = Integer.parseInt(br.readLine());
			int option_num = Integer.parseInt(br.readLine());
			
			int option_price = 0; 
			if( option_num > 0) {
				for(int j=0; j<option_num; j++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					
					int q = Integer.parseInt(st.nextToken());
					int p = Integer.parseInt(st.nextToken());
					
					option_price += q*p;
				}
			}
			System.out.println(s+option_price);
		}
	}

}
