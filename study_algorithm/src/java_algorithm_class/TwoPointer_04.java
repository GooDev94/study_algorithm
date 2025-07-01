package java_algorithm_class;

import java.util.Scanner;

public class TwoPointer_04 {

//	연속 부분수열 문제
	//lt 부터 rt 까지의 값을 더한다고 생각하면 됨
	//그러면서 rt를 더해나감
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//주어지는 수의 개수
		int m = sc.nextInt();	//특정 숫자
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		/* O의 n제곱을 O(n)으로 끝내야 하는데 현재는 O(n2)상태임 -> 이중for문 사용했기 때문
		int sum=0, result=0, num=1;
		while(num <= m) {
			sum = 0;
			for(int i=0; i<num; i++) {
				sum += arr[i];
			}
			
			if(sum == m) {
				for(int i=num; i<n; i++) {
					
					sum += (arr[i]-arr[i-num]);
					if(sum == m) {
						result++;
					}
				}
			}
			num++;
		}
		System.out.println(result);
		*/
		int lt=0, cnt=0, sum=0;
		for(int rt=0; rt<n; rt++) {
			//rt를 증가하고 더하고 sum의 값을 확인하고
			sum+=arr[rt];
			if(sum==m) cnt++;
			while(sum>=m) {
				//sum의 값이 더 늘어나면 sum에서 lt 값을 빼주고 lt index는 늘려줌
				sum -=arr[lt++];		//lt가 가리키는 값을 sum에서 빼주고 lt는 증가하여 다음 index로 넘어감
				if(sum==m) cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
