package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon_11268 {
	/*
	 * BOJ_11268 절댓값 힙
	 * */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//1. 절댓값 정렬
		//비교하는 방법으로 커스터마이징 할 것이기 때문에 비교하는 것 추가
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
			//두 수의 절댓값 구하기
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			if(first_abs == second_abs) {
				//절댓값이 같은 경우 음수 우선
				return o1 > o2 ? 1 : -1;
			}
			return first_abs - second_abs; //절댓값 작은 데이터 우선 	
		});
		
		//2. 연산
		for(int i=0; i<n; i++) {
			int request = Integer.parseInt(br.readLine());
			if(request == 0) {
				if(myQueue.isEmpty()) {
					System.out.println("0");
				}else {
					System.out.println(myQueue.poll());
				}
			}else {
				myQueue.add(request);
			}
		}

	}

}
