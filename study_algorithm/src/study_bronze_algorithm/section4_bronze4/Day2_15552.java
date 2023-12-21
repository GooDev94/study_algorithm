package study_bronze_algorithm.section4_bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Day2_15552 {

	public static void main(String[] args) throws IOException {
		//1. Scanner 사용
		/* 시간초과 발생
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
		*/
		
		//2. BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//readLine() String으로 리턴하기 때문에 int로 변형이 필요함
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			//띄어쓰기로 입력된 값에 대한 구분이 필요함
			StringTokenizer st = new StringTokenizer(br.readLine());
			//입력된 1번 값
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			//System.out.println은 한 번에 한 번씩 찍으면서 시간을 먹기 때문에 BufferedWriter 사용
			//System.out.println(a + b);
			
			//쌓아뒀다가 한 번에 출력하기 때문에 속도가 빠름
			//한줄 띄어쓰기를 해주지 않기 때문에 \n 개행문자 추가
			bw.write(a+b + "\n");
			
			
		}
		
		bw.flush();
		bw.close();
		
	}

}
