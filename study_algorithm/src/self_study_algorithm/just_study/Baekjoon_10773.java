package self_study_algorithm.just_study;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon_10773 {
	/*
	 * BOJ 10773번 : [스택] 제로
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}

		Stack<Integer> money = new Stack<>();

		for (int i = 0; i < k; i++) {
			//0이 아닐 경우에는 스택에 삽입하고
			if (arr[i] != 0)
				money.push(arr[i]);
			else
				//0일 경우에는 현재 위치의 데이터 삭제
				money.pop();
		}

		int sum = 0;
		for(int i : money) {
			 sum += i;
		}
		System.out.println(sum);
	}

}
