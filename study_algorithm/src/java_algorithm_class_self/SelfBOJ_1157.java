package java_algorithm_class_self;

import java.util.Scanner;

public class SelfBOJ_1157 {

	//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next().toUpperCase();
		
		char[] alpha = new char[26];
		int[] count = new int[26];
		//1. 알파벳 배열을 만들고
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = (char) (i+65);
			count[i] = 0;
		}
		
		//2. 입력된 텍스트와 비교하여 카운트
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<alpha.length; j++) {
				if(str.charAt(i) == alpha[j]) {
					count[j]++;
					break;
				}
			}
		}
		
		//3. count 배열 중 가장 값이 큰 알파벳의 인덱스 구하기
		int tmp = 0;
		int max = 0;
		int idx = 0;		//최고값 index
		for(int i=0; i<alpha.length; i++) {
//			max = Math.max(count[tmp], count[i]);
//			if(max == count[i]) {
//				tmp = i;
//			};
			if(count[i] > max) {
				max = count[i];
				idx = i;
			}
		}
		
		int cnt = 0;
		for(int i=0; i<alpha.length; i++) {
			if(max == count[i]) {
				cnt++;
			}
		}
		
		if(cnt > 1) {
			System.out.println("?");
		}else {
			System.out.println(alpha[idx]);
		}
	}

}
