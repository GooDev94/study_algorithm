package java_algorithm_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*  이런 문제는 for문 등으로 풀 수 있냐를 묻는 게 아니라 
 *  투 포인터를 사용할 줄 아는지를 묻는 것
 *  
 *  6번 틀림,,
 * */

public class TwoPointer_01 {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		//a[p1]과 b[p1]을 비교하여 더 작은 쪽의 값을 결과에 넣어주고 p1++ 을 한다
		//그 후에 다시 p2와 비교하고 둘 중 더 작은 값의 p1++을 한다
		//그리고 한 쪽이 다 도달 했을 경우 나머지만 while 문을 돌려서 넣어줌
		ArrayList<Integer> result = new ArrayList<>();
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(a[p1]<=b[p2]) result.add(a[p1++]);
			else result.add(b[p2++]);			
		}
		

		//p1이 n에 도달하지 못했을 경우, 계속 ++ 하여 result에 담아줌
		while(p1<n) result.add(a[p1++]);
		while(p2<m) result.add(b[p2++]);
		return result;
	}
	
	public static void main(String[] args) {
		TwoPointer_01 T = new TwoPointer_01();
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		
		System.out.println();
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}		
		
		for(int x: T.solution(n, m, arr, arr2)) System.out.print(x+ " ");
		
	}

}
