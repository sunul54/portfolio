import java.util.Scanner;

public class q10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 11을 입력받는다. (n)을 입력받는다.
		// Scanner = 클래스, scanner = 객체!
		// new 메모리를 할당해라.
		// System.in => "매개변수"
		Scanner scanner = new Scanner(System.in);  // 동적할당  Scanner ??  10bytes
		
		int n = scanner.nextInt(); // nextInt() 메소드 = "함수"
		
		// 2. n개의 배열을 선언한다. 
		// int[] array : array라는 변수가 있는데, 그건 int형의 배열을 가리킨다.
		// new : 메모리를 할당해라.  메모리 (RAM) 32GB  =>
		// int[n] : int => 4byte  n : 11   => 44byte
		int[] array = new int[n];   // (메모리) 동적 할당 
		char[] array2 = new char[n];  // char => 2byte,  n : 11 , 11  자바에서는 2byte, C, C++ => 1byte
		short[] array3 = new short[n]; 		// short =>  2byte  n : 11, 총 byte? => 22byte
		
		// 3. n개의 배열에 두 번째 줄의 숫자들을 차례대로 입력한다.
		for(int i= 0; i < array.length; i++)
		{
			// array.length : length (필드) , array 객체의 변수  
			// length : 11 = n
			array[i] = scanner.nextInt();
		}
		
		// 4. v를 입력받고
		int v = scanner.nextInt();
		
		// 5. for문을 통해서 v랑 n의 배열 요소랑 같은지 확인 => 같다면 cnt 증가시킨다.
		int cnt = 0;
		
		for(int i = 0 ; i < array.length; i++)
		{
			if(array[i] == v)
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
