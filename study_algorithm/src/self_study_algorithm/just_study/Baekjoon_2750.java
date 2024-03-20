package self_study_algorithm.just_study;

import java.util.Scanner;

public class Baekjoon_2750 {
	/*
	 * BOJ_2750
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//sort로 하는 간단한 방법이 있으나 for문을 사용하여 정렬 
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<n-1; i++) {  //마지막에는 2개가 한번에 swap 되기 때문에 n-1
			for(int j=0; j<n-1-i; j++) {	//루프가 돈만큼 정렬이 되기 때문에 i를 배줌 (1번 루프가 돌고나면 맨 마지막 배열은 더이상 돌지 않아도 되기 때문에)
				//앞 인덱스의 숫자가 클 경우 뒤 인덱스와 위치 변경
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
