package self_study_algorithm.bronze3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze3_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
				
		int[] arr = {a, b, c};
		
		//Arrays.sort() 을 사용하여 배열을 정렬하고 그 중 두 번재의 데이터를 가져옴
		Arrays.sort(arr);
		System.out.println(arr[1]);

	}

}
