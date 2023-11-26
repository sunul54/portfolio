import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q2161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		// 1.  N 값을 입력받는다.
		int N = scanner.nextInt();
		
		// 2. 카드를 1~N까지 만든다.
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= N; i++)
		{
			q.add(i);			// (윗쪽)1, 2, 3, 4, 5, 6, 7, ~~ N (바닥쪽)
		}
		
		// 3. 카드가 1장 밖에 안남을때까지 반복한다.
		while(q.size() > 1) {
			// 3-1. 앞에 있는 카드를 출력하고 뺀다.  poll!
			System.out.print(q.poll()+ " ");
			// 3-2. 앞에있는 카드를 뒤에다 넣는다.
			
			// 앞에 있는 카드를 보려면??  
			int temp = q.poll();
			q.add(temp);			// 뒤쪽에 넣는다.
		}
		
		System.out.print(q.peek()); // 마지막 카드를 출력한다.
	}

}
