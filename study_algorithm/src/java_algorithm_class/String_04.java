package java_algorithm_class;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class String_04 {

	/* 4. 단어 뒤집기
	 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int num = sc.nextInt();
		/* My solution
		for(int i=0; i<num; i++) {
			String str = sc.next();
			for(int j=(str.toCharArray().length-1); j>=0; j--) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		*/

		/* 2. StringBuilder, reverse 사용 - String을 사용하게 되면 새로은 객체를 만들어서 변경하기 때문에 객체가 자꾸 만들어지지만 
		//StringBuilder는 처음 만들어진 객체를 사용하기 때문에 메모리를 많이 먹지 않기 때문에 사용
		String[] str = new String[num];
		for(int i=0; i<num; i++) {
			str[i] = sc.next();
		}
		
		ArrayList<String> answer = new ArrayList<>();
		for(String x: str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		System.out.println(answer);
		*/
		
		//1 <-> 5 / 2 <-> 4 교환하는 방법 
		String[] str = new String[num];
		for(int i=0; i<num; i++) {
			str[i] = sc.next();
		}
		
		ArrayList<String> answer = new ArrayList<>();
		for(String x: str) {
			char[] s = x.toCharArray();
			int lt=0, rt=x.length()-1;		//첫 번째 인덱스 lt, 마지막 인덱스 rt
			System.out.println(rt);
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		System.out.println(answer);
}

}
