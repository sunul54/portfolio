import java.util.Scanner;

public class q27866 {
	public static void main(String[] args)
	{
		// 1. 문자를 받는다.
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		
		// 2. i 값을 받는다.
		int i  = scanner.nextInt();
		
		// 3. i값의 해당되는 문자를 출력한다.
		System.out.println(word.charAt(i)); 	//word[i]
												//value[0] ='S'
												//value[1] ='p'
												//value[2] ='r'
												//value[3] ='o'
												//value[4] ='u'
												//value[5] ='t'
												//value[6] ='\0'
	}
}
