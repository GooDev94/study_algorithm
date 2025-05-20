package java_algorithm_class;

import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//2. A의 값을 기준으로 if를 사용한다
		int[] a = new int[num];
		int[] b = new int[num];
		
		for(int i=0; i<num; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			if(a[i] == b[i]) System.out.println("D");
			else if(a[i] == 1 && b[i] == 3) System.out.println("A");
			else if(a[i] == 2 && b[i] == 1) System.out.println("A");
			else if(a[i] == 3 && b[i] == 2) System.out.println("A");
			else System.out.println("B");
		}
		

		/* 1. My Solution 
		 * String 과 switch 를 사용하여 진행
		sc.nextLine();
		
		String[] aStr = sc.nextLine().split(" ");
		String[] bStr = sc.nextLine().split(" ");
		
		String result = "D";
		for(int i=0; i<num; i++) {
			switch(aStr[i]) {
				case "1":
					if(bStr[i].equals("2")) result = "B";
					else if(bStr[i].equals("3")) result = "A";
					else result = "D"; 
					break;
				case "2":
					if(bStr[i].equals("1")) result = "A";
					else if(bStr[i].equals("3")) result = "B";
					else result = "D";
					break;
				case "3":
					if(bStr[i].equals("1")) result = "B";
					else if(bStr[i].equals("2")) result = "A";
					else result = "D";
					break;
			}
			System.out.println(result);
		}
		*/
		
	}

}
