package self_study_algorithm.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bronze3_2935 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//최대 100자리의 숫자가 주어진다고 했으니 long보다 큰 BigInteger를 사용한다. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger a = new BigInteger(br.readLine());
        String op = br.readLine();
        BigInteger b = new BigInteger(br.readLine());
        
        if (op.equals("*")) {
            System.out.print(a.multiply(b));
        } else {
            System.out.print(a.add(b));
        }
	

	}

}
