package self_study_algorithm.just_study;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon_1874 {
	/*
	 * BOJ_1874 스택 수열
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//수열을 받는다
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//stack 자료구조 만들기
		Stack<Integer> stack = new Stack<>();
		
		StringBuffer sb = new StringBuffer(); 	//push 할 때마다 +를, pop 할 때 -를 노출 시키기 위해 
		int num = 1;	//오름차순 시작
		boolean result = true;
		for(int i=0; i<n; i++) {
			int su = arr[i];
			
			if(su >= num) {
				//같아질 때까지 push 반복
				while(su>=num) {
					stack.push(num++);
					sb.append("+\n");
				}
				//똑같아졌을 때 같은 숫자 나오게함
				stack.pop();
				sb.append("-\n");
			}else {
				//작거나 같을 때는 pop으로 빼옴
				int ssu = stack.pop();
				
				if(ssu > su) {
					//pop한 숫자가 수열의 수보다 클 경우 틀린 것
					System.out.println("NO");
					result = false;
					break;
				}else {
					//ssu = su
					sb.append("-\n");
				}
			}
			
		}

		if(result) System.out.println(sb.toString());
	}

}
