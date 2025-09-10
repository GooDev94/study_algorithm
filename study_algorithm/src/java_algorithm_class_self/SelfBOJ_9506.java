package java_algorithm_class_self;

import java.util.ArrayList;
import java.util.Scanner;

public class SelfBOJ_9506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			int n = sc.nextInt();
			int factor = 1;
			ArrayList<Integer> arr = new ArrayList<>();		
			
			
			if(n == -1) break;	//-1 일 경우 while 끝내기
			
			//주어진 수에 대한 약수 구하기
			while(n > factor) {
				if(n%factor == 0) arr.add(factor);
				factor++;
				
			}
			
			int tot = 0;		//해당 수를 제외한 약수들의 합
			String text = "";
			for(int i=0; i<arr.size(); i++) {
				tot = tot+arr.get(i);
				text += arr.get(i) + " + ";		//해당하는 텍스트를 같이 만듦
			}
	
			
			//마지막에 추가로 붙은 " + " 를 제거해야 함
			text = text.substring(0, text.lastIndexOf(" + "));
			if(tot == n) {
				System.out.println(n + " = " + text);
			}else {
				System.out.println(n + " is NOT perfect.");
			}
			
		}

		
	}

}
