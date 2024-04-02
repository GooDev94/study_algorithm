package self_study_algorithm.just_study;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon_11899 {
	/*
	 * BOJ_11969 [스택] 괄호 끼워넣기 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = sc.next().toCharArray();
		
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			char c = arr[i];
			
			if(c == '(') {
				stack.push(c);
				
			}else {
				//c가 ) 일 경우, stack.peek을 사용하여 현재 데이터를 확인하고 해당 데이터 제거 (pop)
				if(stack.size() > 0 && stack.peek() == '(') {
					stack.pop();
				}else {
					//c가 ) 이고, 현재 데이터가 ) 일 경우 stack 에 넣어놓고 (가 입력되어 나갈 때까지 가지고 있음
					stack.push(c);
					
				}
			}
			
		}
		System.out.println(stack.size());
		
	}

}
