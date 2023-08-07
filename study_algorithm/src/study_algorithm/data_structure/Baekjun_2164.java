package study_algorithm.data_structure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjun_2164 {

	public static void main(String[] args) {
		// 스택과 큐 실전문제 - 카드게임
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		
		int N = sc.nextInt();
		for(int i = 1; i<=N; i++) {
			myQueue.add(i);
		}
		
		//한장 밖에 없을 경우 빠져나오기
		while(myQueue.size()>1) {
			//맨 위의 카드 한장을 버림
			myQueue.poll();
			
			//맨위의 카드를 가장 아래의 카드 밑으로 이동
			/* 1번 방법
			int temp = myQueue.poll();
			myQueue.add(temp);
			*/
			myQueue.add(myQueue.poll());
			
		}
			
		System.out.println(myQueue.poll());
	}


}
