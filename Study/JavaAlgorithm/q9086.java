import java.util.Scanner;

public class q9086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 테스트 케이스의 수를 입력받는다.
		Scanner scanner =new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		// T만큼 반복
		for(int i = 0 ; i < T; i++)
		{
			// 2. 테스트 케이스의 수만큼 문자열을 입력받는다.
			String str = scanner.next();
			
			// 3. 문자열의 첫번째 문자와 마지막 문자를 출력한다.
			String answer = str.charAt(0) +"";
			answer += str.charAt(str.length()-1);
			System.out.println(answer);		// 아스키코드 	
		}	
	}
}
