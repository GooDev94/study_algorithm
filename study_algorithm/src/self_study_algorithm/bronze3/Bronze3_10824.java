package self_study_algorithm.bronze3;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze3_10824 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		String c = st.nextToken();
		String d = st.nextToken();
//		별생각 없이 제일 큰 걸로 해버렸으나 long으로 해도 됨
//		BigInteger first = new BigInteger(a+b);
//		BigInteger second = new BigInteger(c+d);
		
		long ab = Long.parseLong(a+b);
		long cd = Long.parseLong(c+d);
		System.out.println(ab+cd);
	}

}
