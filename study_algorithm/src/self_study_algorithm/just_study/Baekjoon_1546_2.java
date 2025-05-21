package self_study_algorithm.just_study;
import java.util.Scanner;

public class Baekjoon_1546_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int tot = sc.nextInt();
        
        int max = 0;
        int sum = 0;
        for(int i=0; i<tot; i++) {
        	 int temp = sc.nextInt();
        	 //가장 큰 수 구하기
        	 if(temp > max) max = temp;
             sum = sum + temp;
        }
        

       System.out.print(sum*100.0/max/tot);
	}

}
