package java_algorithm_class;

import java.util.Scanner;

public class TwoPointer_05_02 {

	//연속된 자연수의 합 (수학적 풀이)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		/*
		2개의 자연수를 합했을 때 n 이 나올 것이라고 생각하면
		x + y = 15 일 때 1+2의 값을 n에서 뺀다. 15-3 = 12
		12를 /2로 나누는 것
		3이라면 (15-1+2+3)/3 의 나머지가 없다면 몫을 1,2,3에 더하여 값을 만드는것
		나눴을 때 0 이 아니면 가능하지 않은 것
		*/
		
		int answer=0, cnt=1;
		n--;		//cnt가 1로 시작했기 때문에 1을 빼고 시작
		while(n>0) {
			cnt++;			 
			//미리 빼야하는 값들을 뺀다 ex) 1+2 일 경우, n-1 된 상태에서 cnt+1 이 되어 cnt는 2가 되고 n-2를 하면 1+2가 빠진 것
			n=n-cnt;	
			if(n%cnt == 0) answer++;
		}
		
		System.out.println(answer);
	}

}
