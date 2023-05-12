package study_algorithm;

import java.util.Scanner;

public class Baekjun_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int subScore = sc.nextInt();
//        int[] scoreArr = new int[subScore];
//        for(int i=0; i<subScore; i++){
//            scoreArr[i] = sc.nextInt();
//        }

        long sum = 0;
        long max = 0;

        for(int i=0; i<subScore; i++){
            int temp = sc.nextInt();
            if(temp > max) max = temp;
            sum = sum + temp;
//            if(scoreArr[i] > max) max = scoreArr[i];
//            sum = sum + scoreArr[i];
        }

        //100.0 으로 하면 double형임 (소수점으로 나옴)
        System.out.println(sum*100.0/max/subScore);
        //변환 점수의 평균을 구하는 식 (점수가 A, B , C) => (A+B+C)*100/M/3

        //1. 점수를 1차원 배열에 저장
        //2. 배열을 탐색하여 최고 점수와 점수의 총합을 구한다
        //3. 총합 *100/최고점수/과목의수

	}

}
