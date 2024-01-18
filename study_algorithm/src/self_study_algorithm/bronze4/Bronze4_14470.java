package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_14470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int sum = 0;
		if(a < 0) {
			//0보다 낮을 때 얼어 있음
			//1도를 데우는 데 c
			int heat = -a*c;
			sum = heat+d;	//얼어있던 고기 해동
			sum = sum + b*e;	//해동한 고기 데우기
		}else if(a > 0) {
			//0보다 높을 때 얼어있지 않음
			sum = (b-a) * e; 
		}
		
		System.out.println(sum);

	}

}
