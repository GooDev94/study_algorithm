package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_4999 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String j = br.readLine();
		String doc = br.readLine();

		String jLen = j.substring(0, j.length()-1);
		String docLen = doc.substring(0, doc.length()-1);
		
		if(jLen.length() >= docLen.length()) System.out.println("go");
		else System.out.println("no");

	}

}
