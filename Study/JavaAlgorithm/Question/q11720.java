package Question;

import java.io.Console;
import java.util.Scanner;

/// 패키지를 접근하기 위해서
// import 패키지명.클래스; => 패키지안에 있는 클래스을 사용한다.
// import 패키지명.*; => 패키지에 있는 모든 클래스를 다 사용한다.

public class q11720 {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		// 입력 값 2개 N, 숫자들, 출력값 :  숫자들의 합
		
		// N을 입력받는다.
		int N = scanner.nextInt();
		// 숫자들을 입력받는다.
		String nums = scanner.next();
		// n개 for문을 돌면서 각각 숫자들끼리 더한다.
		
		int sum = 0;		// temp 변수
		
		for(int i = 0 ; i < N ; i++)
		{											// char ch = 'A';  '' <- 문자(아스키코드, 유니코드)
			int num = nums.charAt(i) -'0';			// nums.chatAt(char)
													// ASCII, Unicode
			sum = sum + num;
		}
		
		// 결과를 출력한다.
		System.out.println(sum);
	}

}
