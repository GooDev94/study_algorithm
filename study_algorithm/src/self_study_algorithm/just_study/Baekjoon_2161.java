package self_study_algorithm.just_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_2161 {
	/*
	 * BOJ_2164 카드2
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//문제에서 선입선출임을 보여줌 => Queue를 통해서 해결 할 수 있음
		Queue<Integer> queue = new LinkedList<>();
		
		//큐에 n까지의 수 삽입 (add)
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		//마지막 한 장을 남길 때까지 poll을 사용하여 삭제하고
		//첫 번째 삭제 후 다음 수를 빼서 (poll) 뒤에 삽입함 (add)
		while(queue.size() > 1) {
			System.out.print(queue.poll() + " ");
			queue.add(queue.poll());
		}
		
		System.out.print(queue.poll());

	}

}
