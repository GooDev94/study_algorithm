package study_algorithm.data_structure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

	
public class Baekjun_12891 {

	static int myArr[];
	static int chkArr[];
	static int chkSecret;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int S = Integer.parseInt(st.nextToken());   //전체DNA문자열의 길이
		int P = Integer.parseInt(st.nextToken());	//부분문자열
		int result = 0;
		
		//비밀번호 체크 배열
		chkArr = new int[4];
		myArr = new int[4];
		
		//전체문자열
		char A[] = new char[S];
		
		chkSecret = 0;

		//A에 전체문자열 받기
		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<4; i++) {
			chkArr[i] = Integer.parseInt(st.nextToken());
			if(chkArr[i] == 0 ) {
				//chkArr가 0 이라는 것은 없어도 되는 문자라는 의미 = 이미 만족했다는 의미
				chkSecret++;
			}
		}
		
		for(int i=0; i<P; i++) { 	//부분문자열 처음 받을 때 세팅
			Add(A[i]);
		}
		
		if(chkSecret == 4) result++;
		
		//슬라이딩윈도우
		for(int i=P; i<S; i++) {
			//슬라이드윈도우의 맨 왼쪽 = j /슬라이드윈도우의 맨 오른쪽 = i  
			int j = i-P;
			Add(A[i]);
			Remove(A[j]);
			
			//한번 이동을 할 때마다 맞는 문자인지 확dls
			if(chkSecret == 4) result++;
		}
		
		System.out.println(result);
		
		bf.close();
	}

	private static void Remove(char c) {
		switch(c) {
			case 'A':
				if(myArr[0] == chkArr[0]) chkSecret--;
				myArr[0]--;	
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
				if(myArr[3] == chkArr[3]) chkSecret--;
				myArr[3]--;
				break;
		}
	
		
	}

	private static void Add(char c) {
		switch(c) {
			case 'A':
				myArr[0]++;	//첫번째 인덱스 늘려주기
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
