package self_study_algorithm.bronze2;

import java.util.Scanner;

public class Bronze2_1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//색의 값은 인덱스로 처리 가능
		//곱의 경우 10의 n승으로 처리 => 여기서 n은 값임
		String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		
		String[] inputArr = new String[3];
		for(int i=0; i<inputArr.length; i++) {
			inputArr[i] = sc.nextLine();
		}
		
		// 맞긴했으나 엄청 오래 걸림 244ms
		String output = "";
		double value = 0;
		
		char[] arr = new char[3];
		for(int j=0; j<inputArr.length; j++) {
			for(int i=0; i<color.length; i++) {			
				if(inputArr[j].equals(color[i])) {
					if(j==(inputArr.length-1)) {
						value = Integer.parseInt(output)*Math.pow(10, i);
					}else {
						output += i;
					}
					

				}
			}
		}
		 				
		System.out.println((long)value);
		
		/* 이런 방법 참고
		 
		 
        long result = ((Arrays.asList(color).indexOf(Res1) * 10) + Arrays.asList(color).indexOf(Res2));
             result *= Math.pow(10, Arrays.asList(color).indexOf(ResMul));

        System.out.println(result);
        
        
		*/
	}

}
