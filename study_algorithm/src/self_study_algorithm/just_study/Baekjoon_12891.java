package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Baekjoon_12891 {
	//함수에서 쓰기 위해 전역으로 선언
	static int[] myArr;
	static int[] chkArr;
	static int chkSecret;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int result = 0;
		
		
		chkArr = new int[4]; //체크 배열 (구성문자 4개)
		myArr = new int[4];  //현재 상태 배열
		char[] a = new char[s];    //전체문자열
		chkSecret = 0;	//현재 4개 중 몇 개가 비밀번호의 요건에 만족하는가
		
		a = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());	//그 다음 줄 
		
		for(int i=0; i<4; i++) {
			chkArr[i] = Integer.parseInt(st.nextToken());
			if(chkArr[i] == 0) {
				//0일 경우에는 신경쓰지 않아도 되는 문자열
				chkSecret++;	//0일 경우에는 이미 만족이 되었기 때문에 ++;
			}
		}
		
		for(int i=0; i<p; i++) {	//부분 문자열 처음 받을 때 세팅
			//넣어주는 Add 함수 생성 
			Add(a[i]);
		}
		
		if(chkSecret == 4) result++;
		
		//슬라이딩 윈도우 (끝에서 부터 시작함)
		for(int i=p; i<s; i++) {
			int j = i-p;
			Add(a[i]);
			Remove(a[j]);
			
			if(chkSecret == 4) result++;
		}
		
		System.out.println(result);
		br.close();
	}

	private static void Remove(char c) {
		switch(c) {
		case 'A':
			if(myArr[0] == chkArr[0]) chkSecret--;
			myArr[0]--;	//배열에서 제거 
			break;
		case 'C':
			if(myArr[1] == chkArr[1]) chkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if(myArr[2] == chkArr[2]) chkSecret--;
			myArr[2]--;
			break;
		case 'T':
			myArr[3]--;
			if(myArr[3] == chkArr[3]) chkSecret--;
			break;
	}
		
	}

	private static void Add(char c) {
		switch(c) {
			case 'A':
				myArr[0]++;
				if(myArr[0] == chkArr[0]) chkSecret++;
				break;
			case 'C':
				myArr[1]++;
				if(myArr[1] == chkArr[1]) chkSecret++;
				break;
			case 'G':
				myArr[2]++;
				if(myArr[2] == chkArr[2]) chkSecret++;
				break;
			case 'T':
				myArr[3]++;
				if(myArr[3] == chkArr[3]) chkSecret++;
				break;
		}
		
	}

}
