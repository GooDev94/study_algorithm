package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Baekjoon_11728 {
	/*
	 * BOJ_11728 배열합치기
	 * */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] aArr = new Integer[Integer.parseInt(st.nextToken())];
		Integer[] bArr = new Integer[Integer.parseInt(st.nextToken())];
		
		//1. 합칠 배열 aArr 
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<aArr.length; i++) {
			aArr[i] = Integer.valueOf(st.nextToken());
		}
		
		//2. 합칠 배열 bArr 
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<bArr.length; i++) {
			bArr[i] = Integer.valueOf(st.nextToken());
		}

		//3. 배열 합치기
		Integer[] totArr = Stream.concat(Arrays.stream(aArr), Arrays.stream(bArr))
							.toArray(Integer[]::new);
		
		//4. 오름차순 정렬
		Arrays.sort(totArr);
		
		//5. 출력
		for(Integer n : totArr) {
			System.out.print(n + " ");
		}
		
		br.close();
	}

}
