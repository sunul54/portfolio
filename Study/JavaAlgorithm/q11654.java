import java.util.Scanner;

public class q11654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 문자열 하나만 입력받는다.
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		// 2. 문자열의 문자 하나에서 아스키코드값을 출력한다.
		System.out.println((int)str.charAt(0)); 		//(int)char char -> int
														//(char) int   int -> char
		
	}

}
