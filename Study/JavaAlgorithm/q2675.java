import java.util.*;

public class q2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//1. 테스트케이스 입력받는다.
		String TString = scanner.nextLine();
		int T = Integer.parseInt(TString);
		
		// 2. 테스트케이스 만큼 반복하면서 알고리즘(처리)을 처리하면된다. 
		for(int t = 0 ; t < T ; t++) {
			// 3. 1개의 문자열을 입력받는다. ex) 3 ABC
			String line = scanner.nextLine();
			/// 띄어쓰기를 기준으로 단어를 나눈다. ex) "3", "ABC"
			String[] words = line.split(" "); 
			// 4. N을 입력을 받는다.
			// 앞의 문자를 Integer 타입으로 바꾼다. Ex) "3" =>3
			int N = Integer.parseInt(words[0]);		
			// 5. 문자열을 입력받는다.
			String str = words[1];
			
			// 6. N 만큼 문자열의 각 문자 한개를 반복해서 출력하면됨.
			// 문자열을 한바퀴 도는 for
			for(int i = 0 ; i < str.length(); i++)
			{
				String temp = "";
				// 문자를 반복하는 for
				for(int n = 0; n < N ; n++)
				{
					// n번 만큼 문자를 출력하면됨. 
					temp = temp +str.charAt(i);
				}
				System.out.print(temp);
			}

			System.out.println();
		}
	}

}
