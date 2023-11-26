import java.util.Scanner;

public class q4999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner  = new Scanner(System.in);
		// 문자열 2개를 입력받는다.
		
		String str1 = scanner.nextLine();
		String str2= scanner.nextLine();
		
		// 그리고 문자열의 길이를 서로 비교한다.
		if(str1.length() >= str2.length())
		{
			System.out.println("go");
		}else {
			System.out.println("no");
		}
		
		
	}

}
