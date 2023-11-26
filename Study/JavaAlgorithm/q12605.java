import java.util.*;

public class q12605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scanner = new Scanner(System.in);
		// 1. N을 입력받는다.
		
		//int n = scanner.nextInt();					// 띄워쓰기를 기준으로해서 입력받음.
		String NString = scanner.nextLine();		// 엔터기준으로해서 1개의 줄을 입력받아요.
		
		int N = Integer.parseInt(NString);			// NString이라는 문자열을 Integer 타입으로 변환 int
													// "1234" -> int타입으로 1234 변환
		for(int i = 1 ; i <= N; i++)
		{
			// 2. 문장을 입력받는다.
			String str = scanner.nextLine();
			// 3. 한 문장에 있는 단어를 분리한다. (Split)
			String[] words = str.split(" ");
			
			Stack st = new Stack();
			for(int j = 0 ; j < words.length ; j++)
			{
				// 4. 분리한 단어를 순서대로 스택에 넣는다.
				st.push(words[j]);
			}
			String temp = "Case #" + i+": ";		// 아무것도 없는 빈 문자열 만듬
			// 5. 스택을 꺼내면서 문장을 재조립한다.
			int size = st.size();
			for(int j = 0; j < size ; j++)
			{
				temp = temp + st.pop() + " ";
			}		
			// 6. 재조립한 문장을 출력한다.
			System.out.println(temp);
		}
	}
}
