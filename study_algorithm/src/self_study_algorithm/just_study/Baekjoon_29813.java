package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_29813 {
	/*
	 * BOJ_1427 [큐] 소트인사이드 
	 * */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		//학생과 학생의 학번을 map에 담아서 해당 학생의 수만큼 for문을 돌려야 한다.
		HashMap<String, Integer> map = new HashMap<>();
		Queue<String> myQueue = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			map.put(name, num);
			myQueue.add(name);
		}
		
		while(myQueue.size() > 1) {
			String student = myQueue.poll();
			
			int student_num = map.get(student);
			
			for(int i=1; i<student_num; i++) {
				//기존에 있던 값을 삭제하고 확인 후 그 값을 다시 추가 하기 위함
				//확인과 삭제를 함께 할 수 있는 poll()을 사용하면 수월함
				myQueue.add(myQueue.poll());
			}
			
			//짝이 되어 나갈 학생은 지워준다.
			myQueue.poll();
		}

		System.out.println(myQueue.poll());
	}

}
