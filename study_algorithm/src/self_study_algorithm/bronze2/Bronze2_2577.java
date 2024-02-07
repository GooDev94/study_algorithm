package self_study_algorithm.bronze2;

import java.util.Scanner;

public class Bronze2_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		char[] text = String.valueOf(a*b*c).toCharArray();

		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<text.length; j++) {		
				//그냥 if(text[j] == i) 로 비교를 할 때는 비교가 제대로 진행되지 않음
				//그래서 text[j]가 char 형이기 때문에 숫자로 형변환을 하여 i와 비교함
				if(Character.getNumericValue(text[j]) == i) {
					arr[i]++;
				}
			}
			System.out.println(arr[i]);
		}
		
	}

}
