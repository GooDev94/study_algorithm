package self_study_algorithm.bronze3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bronze3_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n]; 
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<n; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
	
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}

}
