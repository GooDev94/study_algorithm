package java_algorithm_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 교집합 구하기
public class TwoPointer_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nArr = new int[n];
		for(int i=0; i<n; i++) {
			nArr[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] mArr = new int[m];
		for(int i=0; i<m; i++) {
			mArr[i] = sc.nextInt();
		}
		

		ArrayList<Integer> result = new ArrayList<>();
		
		//p1과 p2를 비교하여 두 값이 같을 경우에만 result에 넣어준다
		int p1=0, p2=0;
		
		//오름차순으로 정렬해놓고 진행하면 비교가 수월함
		Arrays.sort(nArr);
		Arrays.sort(mArr);
		
		while(p1<n && p2<m) {
			if(nArr[p1]== mArr[p2]) {
				result.add(nArr[p1++]);
				p2++;
			}else if(nArr[p1]<mArr[p2]) {
				p1++;
			}else {
				p2++;
			}
		}
		
		for(int i=0; i<result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}

}
