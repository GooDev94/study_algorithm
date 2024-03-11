package self_study_algorithm.just_study;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_1940 {
	/*
	 * BOJ 1940 : 주몽
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int count = 0;
		
		//재료 데이터를 오름차순으로 정렬
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(sc.next());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);

		//i는 시작, j는 끝 => 둘을 양 끝에 두고 하나씩
		//a[i] + a[j] > m ; m보다 크면 작은 숫자를 더해야하기 때문에 j-- 
		//a[i] + a[j] == m ; 같을 경우에는 i를 키우고 j를 줄이면서 숫자 확인 후 count 올림 i++ j-- count++
		//a[i] + a[j] < m ; m이 크면 작은 숫자를 올림 i++
		
		int i = 0;
		int j = n-1;
		
		while (i < j) {
			if(arr[i] + arr[j] < m) {
				i++;
			}else if(arr[i] + arr[j] > m) {
				
				j--;
			}else {
				 count++; i++; j--;
			}
		}
		
		System.out.println(count);
	}

}
