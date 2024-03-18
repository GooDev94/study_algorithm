package self_study_algorithm.just_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_2164 {
	/*
	 * BOJ_2164 카드2
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//수열
		for(int i=0; i<n; i++ ) {
			queue.add(i+1);
		}
		
		//1장 남을 때까지만 반복문을 돌린다.
		while(queue.size() > 1) {
			queue.poll();	//맨 front 부분에 있는 데이터를 삭제하고 확인
			queue.add(queue.poll()); 	//그 다음카드를 삭제하고 확인한 다음에 추가를 시킴
		}
		
		System.out.println(queue.poll());	//마지막 남은 카드를 출력
	}

}
