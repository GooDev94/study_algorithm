package self_study_algorithm.bronze4;

import java.io.IOException;
import java.util.Scanner;

public class Bronze4_25640 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String mbti = sc.nextLine();
		int n =Integer.parseInt(sc.nextLine());
		int sum = 0;
		for(int i=0; i<n; i++) {
			if(mbti.equals(sc.next())) sum++;
		}
		
		System.out.println(sum);

	}

}
