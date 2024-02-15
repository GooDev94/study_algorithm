package self_study_algorithm.bronze2;

import java.util.Scanner;

public class Bronze2_2902 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String txt = sc.next();
		char[] txtArr = txt.toCharArray();
		
		for(int i=0; i<txtArr.length; i++) {	
			//문제에 아스키코드에 대한 언급이 있어서 아스키코드로 코드를 작성해보았다.
			//65 = A, 90 = Z이기 때문에 그 사이에 있는 글자만 출력
			if(65 <= (int)txtArr[i]  && (int)txtArr[i] <= 90) {
				System.out.print(txtArr[i]);
			}
		}

	}

}
