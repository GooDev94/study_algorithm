package study_bronze_algorithm.section6_bronze4;

import java.util.Scanner;

public class Day12_24263 {

	public static void main(String[] args) {
		//시간 복잡ㅈ도에 대한 문제임
		//1차원 for문의 시간 복잡도 : 0(N) 1차원임 
		// 0(N) => 1 때문에 최고 차항은 항상 1임
		/*
		 * 둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 
		 * 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
		 * 
		 * =>1차원 for문에서 나올 수 있는 최고 차항은 1이기 때문에 해당 조건은 무조건 1임
		 * */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
		System.out.println(1);
	}

}
