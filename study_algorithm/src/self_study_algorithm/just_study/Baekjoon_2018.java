package self_study_algorithm.just_study;

import java.util.Scanner;

public class Baekjoon_2018 {
	/*
	 * BOJ 2018번 : 수들의 합 5
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index < n) {
			if(sum == n) {
				count++; 
				end_index++;
				sum = sum + end_index;
			}else if(sum > n) {
				//기존에 있던 start_index를 빼주고 
				sum = sum - start_index;
				//이 후 start_index를 올려줌
				start_index++;
			}else {
				end_index++;
				sum = sum+ end_index;
			}
		}
		
		System.out.println(count);
		
	}

}
