package java_algorithm_class_self;

import java.util.ArrayList;
import java.util.Scanner;

public class SelfBOJ_2581_2while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int tot = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		
		while(m<=n) {
			int factor = 2;	
			while(factor<=m) {
				if(factor == m) {
					tot += m;
					arr.add(m);
					m++;
					
					break;
				}
				if(m%factor == 0) {
					m++;
					break;
				}else {
					factor++;
				}
				
			}
			
		}
		
		if(arr.isEmpty()) {
			System.out.println(-1);
		}else {
			System.out.println(tot);
			System.out.println(arr.get(0));

		}
		
	}

}
