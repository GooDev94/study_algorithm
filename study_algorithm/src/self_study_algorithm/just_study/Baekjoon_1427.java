package self_study_algorithm.just_study;

import java.util.Scanner;

public class Baekjoon_1427 {
	/*
	 * BOJ_1427 [선택정렬] 소트인사이드 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		
		//int의 배열을 찾는다
		int[] numArr = new int[num.length()];
		for(int i=0; i<num.length(); i++) {
			numArr[i] = Integer.parseInt(num.substring(i,i+1));
		}

		for(int i=0; i<num.length(); i++) {
			//남은 값에서 최댓값을 찾는다
			int max = i;
			//앞을 제외한 다음 index부터 시작하기 때문에 시작값 i+1
			for(int j=i+1; j<num.length(); j++){
				//현재 범위에서 max 찾기 (큰 값이 앞으로 가야하기 때문에 현 시점 max보다 값이 큰 경우 max = j)
				if(numArr[j] > numArr[max]) {
					max = j;
				}
			}
			
			//max 값을 앞으로 보내줘야하기 때문에 순서 변경 (swap)
			if(numArr[i] < numArr[max]) {
				int tmp = numArr[i];
				numArr[i] = numArr[max];
				numArr[max] = tmp;
			}
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}

	}

}
