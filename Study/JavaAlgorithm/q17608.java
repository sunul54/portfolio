import java.util.Scanner;
import java.util.Stack;

public class q17608 {
	
	/* stack 메소드 
	 * 
	 * push   : 값을 입력받는다. (스택을 쌓는다.)
	 * pop    : 값을 꺼낸다. (꺼내면서 값을 확인한다.)
	 * peek   : 값을 확인한다. (꺼내는거 아님)
	 * size   : 스택의 사이즈를 확인
	 * empty  : 스택이 비어있는지 확인
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Stack stack = new Stack();
		
		// 1. 입력값 n을 입력 받는다.
		//scanner.nextInt();				// 엔터를 무시!!
		String nString = scanner.nextLine();		// 엔터까지 입력받음.
		int N = Integer.parseInt(nString);  // 문자열 nString을 정수형으로 형변환
		
		for(int i = 0 ; i < N; i++) {
			// 2. N만큼 숫자들을 입력받는다.
			String hString = scanner.nextLine();
			int h = Integer.parseInt(hString);
			
			// 3. 입력 받은 것들을 스택에 저장한다.
			stack.push(h);
		}
		
		int max = 0;		// h의 최소값보다 작게 설정한다.
		int cnt = 0;		// count 값  막대기의 개수를 의미
		
		// Stack이 비어있는가?
		// empty-> 빈, 비어있음
		// size가 0인가?
		// 만약에 size가 0이면, true, size가 0이 아니라면, false
		// ! :  false -> true, true -> false
		while(!stack.empty())
		{
			// 4. 스택을 꺼내면서, 스택 요소와 max 값을 비교하고 max 값보다 크면 cnt-> cnt + 1
			// 작다면 무시
			
			int h = (int)stack.pop();   // Object -> int (형변환) 명시적 형변환
										// Object -> short
										// Object -> long
			
			if(max < h)
			{
				cnt++;
				max = h;
			}
		}
		System.out.println(cnt);
		
	}

}
