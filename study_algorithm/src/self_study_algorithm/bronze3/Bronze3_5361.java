package self_study_algorithm.bronze3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bronze3_5361 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			double money = (a*350.34) + (b*230.90)+ (c*190.55)+ (d*125.30)+ (e*180.90);
			
			bw.write("$"+String.format("%.2f", money)+"\n");
		}
		
		bw.flush();
		bw.close();

	}

}