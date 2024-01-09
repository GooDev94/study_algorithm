package study_bronze_algorithm.section6_bronze4;

import java.util.Scanner;

public class Day14_11945 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		//nextLine() : enter를 치기 전까지 쓴 문자열을 모두 리턴 하는 것
		//N M을 입력한 후에 밑으로 한칸 내려간 후 입력값을 찾지 않고 N M 뒤에 있는 값을 찾음을 알 수 있음
		//때문에 다음 줄을 찾을 수 있도록 입력

		//그런데 런타임에러가 발생하여 질문 게시판을 봤더니 개행으로 끝나지 않는 데이터가 있는 것 같다고함
		//데이터가 개행으로 끝나지 않을 경우 nextLine()을 쓰는게 무의미 함
		//sc.nextLine();
		
		//그러나 이렇게 될 경우 M이 0일 경우에는 문제가 발생할 수 있음
		//그래서 M 조건문을 추가함
		if(M>0) {
			for(int i=0; i<N; i++) {
				//개행문자가 없는 데이터도 있는 것으로 보여서 nextLine 대신 next로 진행
				char[] text = sc.next().toCharArray();
				for(int j=M-1; j>=0; j--) {
					System.out.print(text[j]);
					
				}
				System.out.println();
			}			
			
		}
		
	}

}
