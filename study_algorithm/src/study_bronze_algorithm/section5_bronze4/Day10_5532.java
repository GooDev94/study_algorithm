package study_bronze_algorithm.section5_bronze4;

import java.util.Scanner;

public class Day10_5532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		//국어 일수
		int lang_d = A/C;
		if(A%C > 0) lang_d++; 
		
		
		//수학 일수
		int math_d = B/D;
		if(B%D > 0) math_d++;
		
		//조건 중 '국어를 했을 경우 수학을 하지 않는다, 수학을 했을 경우 국어를 하지 않는다' 라는 조건이 없기때문에
		//둘이 같이 할 수 있음을 알고 최대 일수를 골라냄
		System.out.println(L-Math.max(math_d, lang_d));
	}

}
