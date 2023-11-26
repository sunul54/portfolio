import java.util.*;

public class QueuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Queue = LinkedList
		Queue<Integer> q = new LinkedList<>();			// 객체지향 프로그래밍 <> <- 템플릿(template) 
														// Queue를 사용할 건데, 그 안에 Integer 형만 넣겠다.
		q.add(1);			// push랑 같은 의미 
		q.add(2);
		
		System.out.println(q.peek());			// 값을 꺼내지 않고, 값을 확인한다.   1
		System.out.println(q.poll());			// 값을 꺼내고 값을 확인한다.  (pop)  1
		System.out.println(q.size());			// 값의 사이즈를 확인한다.     1
		System.out.println(q.isEmpty());		// 큐가 비어있는지 확인한다.  False
		
		
		Queue<Short> q2 = new LinkedList<>();		// Queue를 사용할 건데, 그안에 Short 형만 넣겠다.
		q2.add((short)100);
		
		Queue<String> q3 = new LinkedList<>();		// Queue를 사용할 건데, 그안에 String 만 넣겠다.
		
		q3.add("100");			// 문자열 100
		
		
	}

}
