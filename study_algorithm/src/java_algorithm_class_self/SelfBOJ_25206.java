package java_algorithm_class_self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelfBOJ_25206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] abc = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};
		String[] su = {"4.5","4.0","3.5","3.0","2.5","2.0","1.5","1.0","0.0"};
		
		double total = 0.0;
		double totalHakjum = 0.0;
		for(int i=0; i<20; i++) {
			//한 줄에 공백을 기준으로 여러 개의 데이터가 주어졌을 때
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String subject = st.nextToken();
			String score = st.nextToken();
			String hakjum = st.nextToken();
			if(!hakjum.equals("P")) {
				totalHakjum += Double.parseDouble(score);
			}
			for(int j=0; j<abc.length; j++) {
				if(hakjum != "P") {
					if(abc[j].equals(hakjum)) {
						total += Double.parseDouble(su[j]) * Double.parseDouble(score);
					}
				}
				
			}
		}
		System.out.printf("%f\n", total/totalHakjum); 
		//3.0E-6
		//System.out.println(Math.round(total/totalHakjum) / 1000000.0);

	}

}
