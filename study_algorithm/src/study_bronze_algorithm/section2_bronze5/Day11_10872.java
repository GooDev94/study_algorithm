package study_bronze_algorithm.section2_bronze5;

import java.util.Scanner;

public class Day11_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		/* 내 방법 (맞음)
		int gop = 1;
		for(int i=1; i<=N; i++) {
			gop = gop * i;
		}
		System.out.println(gop);
		*/
		//0일 경우에는 1이 나와야 하기 때문
		if(N<2) {
			System.out.println(1);
		}else {
			int fac = 1;
			for(int i=2; i<=N; i++) {
				fac = fac*i;
			}
			System.out.println(fac);
		}
	}

}
