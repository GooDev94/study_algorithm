package study_programmers_algorithm;

public class Programmers_120903 {
	/*
	 * 코딩테스트 연습 > 코딩테스트 입문 > 배열의 유사도
	 * 
	 * */
	public static void main(String[] args) {
		String[] s1 = {"n", "omg"};
		String[] s2 = {"m", "dot"};
		
		System.out.println(solution(s1, s2));

	}
	
	public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        /* 1. 이중 for문을 index를 사용하여 구현
        for(int i=0; i<s1.length; i++) {
        	for(int j=0; j<s2.length; j++) {
        		if(s1[i].equals(s2[j])) answer++;
        	}
        }
        */
        
        //2. 향상된 for문으로 진행
        for(String str1 : s1) {
        	for(String str2 : s2) {
        		if(str1.equals(str2)) {
        			answer++;
        			break;
        		}
        	}
        }
        
        /*
          Set<String> set = new HashSet<>(Arrays.asList(s1));
          return (int)Arrays.stream(s2).filter(set::contains).count();
         * */
        return answer;
    }

}
