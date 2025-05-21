package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_1157 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		char[] charArr = st.toUpperCase().toCharArray();	//대문자로 변환하여 array
		
		char[] alphabet = new char[26];
		int[] alNo = new int[26];
		
		//알파벳 배열 생성
		char startChar = 'A';
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = startChar;
			startChar++;
		}
		
		
		//알파벳 배열과 입력된 배열 비교
		for(int i=0; i<charArr.length; i++) {
			for(int j=0; j<alphabet.length; j++) {
				if(charArr[i] == alphabet[j]) {
					
					alNo[j] += 1;
			
				}
			}
		}
		
		int max = alNo[0];
		int maxIndex = 0;
		for(int i=0; i<alNo.length; i++) {
			int tmp = alNo[i+1];
			
			if(alNo[i] >max ) {
				max = alNo[i];
				maxIndex = i;
			}
		}
	}

}
