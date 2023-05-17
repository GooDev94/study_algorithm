package study_algorithm.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_11659 {
	public static void main(String[] args) {
		/*
		 * suNo(숫자개수), quizNo(질의 개수) 저장하기
		 * for (숫자 개수만큼 반복하기){
		 * 		합 배열 생성하기 (S[i] = S[i -1] + A[i]
		 * }
		 * 
		 * for(질의 개수만큼 반복하기){
		 * 		질의 범위받기 (i ~j )
		 * 		구간합 출력하기 (S[j] - S[i -1)
		 * }
		 * */
		
		//Scanner 보다 성능이 좋음
		BufferedReader  bufferedRead = new BufferedReader(new InputStreamReader(System.in));
		
		//10만개까지 값이 들어올 경우, int나 long으로는 안되기 때문에 한줄로 쭉 받을 수 있도록 StringTokenizer 사용
		StringTokenizer stringTokenizer;
		try {
			stringTokenizer = new StringTokenizer(bufferedRead.readLine());
			
			int suNo = Integer.parseInt(stringTokenizer.nextToken());
			int quizNo = Integer.parseInt(stringTokenizer.nextToken());
			
			//합배열 만들기
			//int 범위를 넘어갈 수 있기 때문에 long형으로
			//배열은 0번째부터 하기 때문에 1부터 시작할 수 있도록 +1
			long[] S = new long[suNo + 1];
			stringTokenizer = new StringTokenizer(bufferedRead.readLine());
			
			for(int i=1; i<=suNo; i++) {
				S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
			}
			
			for(int q=0; q<quizNo; q++) {
				stringTokenizer = new StringTokenizer(bufferedRead.readLine());
				int i = Integer.parseInt(stringTokenizer.nextToken());
				int j = Integer.parseInt(stringTokenizer.nextToken());
				System.out.println(S[j] - S[i-1]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		
	}
}
