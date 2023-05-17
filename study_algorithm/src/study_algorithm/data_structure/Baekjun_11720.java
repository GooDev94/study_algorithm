package study_algorithm;


import java.util.Scanner;

public class Baekjun_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String sNum = sc.next();
		
		char[] cNum = sNum.toCharArray();
		//int 형 변수 sum 선언
		int sum = 0;
		for(var i=0; i<cNum.length; i++) {
			//cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
			sum += cNum[i] - '0';
		}

		System.out.println(sum);
	}

}
