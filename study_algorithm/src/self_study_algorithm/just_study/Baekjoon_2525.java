package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2525 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int min =  Integer.parseInt(st.nextToken());
		
		int t = Integer.parseInt(br.readLine());
		
		int tot_min = t + min;	//전체 분
		
		int hour_t = tot_min/60;	//추가된 시
		int min_t = tot_min%60;	//남은 분
		
		int return_hour = hour + hour_t;
		int return_min = min + min_t;
		if(return_hour > 23) {
			return_hour = return_hour - 24;
		}
		
		System.out.println(return_hour + " " + min_t);
			
	}

}
