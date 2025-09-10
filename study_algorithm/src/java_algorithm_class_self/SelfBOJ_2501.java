package java_algorithm_class_self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SelfBOJ_2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		int factor=1;
		ArrayList<Integer> factors = new ArrayList<>();
		while(p >= factor) {
			//약수들 집합
			if(p%factor == 0) {
				factors.add(factor);
			}
			factor++;
		}

		//sort를 해도 되고 안해도 상관은 없음
		//어차피 1부터 커진 숫자로 진행할 것이기 때문에 오름차순임
		Collections.sort(factors);
		
		if(factors.size() < q) {
			System.out.println(0);
		}else {
			System.out.println(factors.get(q-1));
		}
	
	}

}
