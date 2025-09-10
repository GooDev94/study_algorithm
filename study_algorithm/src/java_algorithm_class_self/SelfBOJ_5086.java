package java_algorithm_class_self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelfBOJ_5086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//주어진 반복문의 시작과 끝이 없기 때문에 무한으로 진행
		while(true) {
			//띄어쓰기로 구분
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			//둘다 0일 경우 반복문 종료
			if(a == 0 && b == 0) {
				break;
			}
			
			//들다 아닐 경우에는 나머지가 발생하기 때문에 neither
			if(a >= b) {
				if(a%b == 0) {
					System.out.println("multiple");
				}else {
					System.out.println("neither");
				}
				
			}else {
				if(b%a == 0) {
					System.out.println("factor");
				}else {
					System.out.println("neither");
				}
				
			}
		}
		

	}

}
