package java_algorithm_class_self;

import java.util.Arrays;
import java.util.Scanner;

public class SelfBOJ_2581 {

	public static void main(String[] args) {
		//에라토스테네스의 체를 이용하여 소수를 골라낸다.
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		boolean[] arr = new boolean[n+1];
		Arrays.fill(arr, true);
		
		//에라토스테네스의 체는 구하고자하는 구간까지의 수를 나열해서
		//i가 숫자로 생각하고 2일 경우에는 소수이기 때문에 0으로 유지
		//4일 경우, 2의 배수이기 때문에 1을 추가
		arr[0] = arr[1] = false;
		for(int i=2; i*i<=n; i++) {
			if(arr[i]) {
				for(int j=i*i; j<=n; j+=i) {
					arr[j] = false;
				}
			}
		}
		
		int tot = 0;
		int min = Integer.MAX_VALUE;
		for(int i=m; i<=n; i++) {
			if(arr[i]) {
				if(i<min) min = i;
				tot += i;
			}
			
		}
		
		if(tot == 0) {
			System.out.println(-1);
		}else {
			System.out.println(tot);
			System.out.println(min);
		}
	
	}

}
