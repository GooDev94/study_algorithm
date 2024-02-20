package self_study_algorithm.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze1_11557 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			int max = 0;
			String school = "";
			
			for(int j=0; j<n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				String name = st.nextToken();
				int drink = Integer.parseInt(st.nextToken());
				
				max = Math.max(max, drink);
				
				if(max == drink) {
					school = name;
				}
			}
			System.out.println(school);
		}

	}

}
