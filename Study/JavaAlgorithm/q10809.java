import java.util.Scanner;

public class q10809 {

	public static void main(String[] args) {
		
		// 1. 문자를 받는다.
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		
		// 2. 문자의 알파벳 위치를 담고있는 배열을 선언한다.  (처음부터 -1로 설정)
		int[] alpha = new int[26];   // 'a'~'z' 
		
		for(int i = 0 ; i < alpha.length; i++)
		{
			alpha[i] = -1;			//Why?
		}
		
		// 3. 받은 문자열을 각 문자를 보면서, 몇번 인덱스인지 기록한다. (2번에 선언한 배열안에)
		
		for(int i = 0 ; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			// 초기값 (-1인 경우에 인덱스값을 넣어준다.)
			if(alpha[ch-'a'] == -1) {
				alpha[ch -'a'] = i;	
			}
									// ch - 'a'  (인덱스 )= 정수!!
									// 컴퓨터는 문자를 숫자로 저장한다. (유니코드, 아스키코드)
									// 'a' = 65 , 'b' = 66, 'c' = 67
									// 만약에 ch가 'a'라면, 'a' - 'a' = 65 - 65 = 0
									// 만약 ch가 'b'라면, 'b' - 'a' = 66 - 65 = 1
			 						// 만약 ch가 'c'라면? 'c' - 'a' = 67 - 65 = 2
		}
		
		// 4. 2번에서 선언한 배열을 띄워쓰기 하면서 출력한다. (정답)
		for(int i = 0 ; i < alpha.length ;i++)
		{
			System.out.print(alpha[i] + " ");
		}
	}

}
