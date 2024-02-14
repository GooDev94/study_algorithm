package self_study_algorithm.bronze2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze2_2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inputs = new int[8];
		for (int i = 0; i < inputs.length; i++) inputs[i] = sc.nextInt();
		sc.close();

		String output = "";
		for (int i = 0; i < inputs.length - 1; i++) {
			if (inputs[i] == inputs[i + 1] - 1) output = "ascending";
			else if (inputs[i] == inputs[i + 1] + 1) output = "descending";
			else {
				output = "mixed";
				break;
			}
		}
		System.out.println(output);
	}

}
