package study_algorithm;

import java.util.Scanner;

public class Baekjun_2018 {
	public static void main(String[] args) {
		//가장 중요한 n의 범위
		//O(n) 의 시간 복잡도 알고리즘 방법 => 투포인터
		/*
		 * 
		 * sum = 1일 때 15보다 작으면 인덱스를 하나씩 올림
		 * 
		 * <슈도코드>
		 * 1. count = 1 : 자기 자신 하나로 이루어진 경우의 수 미리 저장을 위해 count를 1로 초기값 선언
		 * N 변수저장
		 * 사용 변수 초기화 (count = 1, start_index = 1, end_index = 1, sum =1)
		 * while(end_index != N){
		 * if(sum == N) count 증가, end_index 증가, sum값 변경
		 * else if (sum > N) sum값 변경, start_index 증가
		 * else if (sum < N) sum값 변경, end_index 증가
		 * }
		 * count 출력
		 * */
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count  = 1;
		int start_index  = 1;
		int end_index  = 1;
		int sum  = 1;
		
		while(end_index != N) {
			if(sum == N) {
				count++;
				end_index++;
				sum = sum + end_index;
			}else if(sum > N) {
				sum = sum - start_index;
				start_index++;
				
			}else {
				end_index++;
				sum = sum + end_index;
			}
		}
		
		System.out.println(count);
			
	}
}
