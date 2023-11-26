import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		// 1. N과 K값을 입력받는다.
		int N = scanner.nextInt();		// 7
		int K = scanner.nextInt();		// 3
		
		// 2. 큐를 1~N까지 초기화를 한다.
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++)
		{
			queue.add(i);		//1,2,3,4,5, ~~~ N
		}
		
		System.out.print("<");
		// 3. 큐의 개수가 0이 될 때까지 반복한다.
		int index = 0;
		while(queue.size() > 1)
		{
			//    3.1) index 개수를 센다. i++
			index++; 		//  4 ~
			if(index == K)		// k =3 , 
			{
//			    3.2) k랑 i값이 같으면, 출력하고
				System.out.print(queue.poll() + ", ");
				index =0;			// index 초기화 필요!
			}else {
//			    3.3) 그렇지 않으면, 뒤로 보낸다.
				int temp = queue.poll();		// 한개 빼고
				queue.add(temp);				// 추가한다.
			}
		}
		System.out.print(queue.poll());
		System.out.println(">");
		
	}
}
