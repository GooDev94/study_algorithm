package java_algorithm_class;

import java.util.Scanner;

public class Array_02 {
	
	/* (도움)
	 * 	선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
		선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
	 * 
	 * 시간 복잡도로 인해서 이중 for문은 안되기 때문에 max 라는 변수를 첫번째 인덱스 값으로 초기화하여 선언
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 1;
		int max = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i] > max) {
				cnt++;
				max = arr[i];
			}			
		}
		System.out.println(cnt);
	}

}
