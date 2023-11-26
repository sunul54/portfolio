import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stack(스택), Queue(큐), Deque(덱)
		
		// 스택
		Stack st = new Stack();
		// push : 데이터 저장  // pop : 저장된 데이터를 보면서 빼기 (반환)
		st.push(1);			// st라고 불리는 객체에 1을 저장
		st.push(2);			// st라고 불리는 객체에 2을 저장
		st.push(3);			// st라고 불리는 객체에 3을 저장
		st.push(4);			// st라고 불리는 객체에 4을 저장
		
		System.out.println(st.size());			// 현재 스택에 있는 데이터의 개수 = 4
		System.out.println(st.peek());			// 4
		
		System.out.println(st.pop());		// st라고 불리는 객체에서 저장된 데이터를 빼기 (반환)
		System.out.println(st.pop());		// st라고 불리는 객체에서 저장된 데이터를 빼기 (반환)
		System.out.println(st.pop());		// st라고 불리는 객체에서 저장된 데이터를 빼기 (반환)
		System.out.println(st.pop());		// st라고 불리는 객체에서 저장된 데이터를 빼기 (반환)
		
		
		//st.size();			// 현재 스택에 있는 데이터의 개수
		//st.peek();			// 현재 반환할 수 있는 데이터를 보기 (반환 X)
		
		Stack st2 = new Stack();
		st2.push("ddd");
		st2.push("문자열2");
		st2.push("문자열3");
		st2.push("문자열4");
		
		int temp = st2.size();
		
		for(int i =0 ; i< temp; i++)
		{
			System.out.println(st2.pop());
		}
		
		// 스택의 특징 LIFO (Last In First Out) => 마지막에 들어온게, 첫번째로 나온다.
	}

}
