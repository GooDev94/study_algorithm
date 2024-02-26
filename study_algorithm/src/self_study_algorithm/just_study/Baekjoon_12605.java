package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_12605 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int cnt = st.countTokens();
			String[] textArr = new String[cnt];
			
			for(int j=0; j<cnt; j++) {
				textArr[j] = st.nextToken();
			}
			
			System.out.print("Case #"+ (i+1) +":");
			for(int k=(textArr.length-1); k>=0; k--) {
				System.out.print(" " + textArr[k]);
			}
			System.out.println();
		}

	}

}
