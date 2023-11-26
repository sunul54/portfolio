
public class JavaGrammar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 명시적 형변환
		// int, char, short, long, flaot, double ,byte
		// 정수
		// byte : 1 byte   => 2^0
		// short : 2 byte  => 2^1
		// char : 1 byte (아스키코드 C , C++), 2byte (JAVA, C#: 유니코드)
		// int : 4 byte
		// long : 8 byte
		
		// float : 4 byte  (소수)
		// double : 8 byte (소수)
		
		
		// JAVA, C#, python  
		
		// C , C++ 
		short a = 100;
		int b = (int)a;
		
		int bb = 10000000;
		short c = (short)bb;			//  int : 4byte (20억)  ->  short : 2byte (65535)  크기 변함.!!
		
		//System.out.println(c);			// 형변환은 , 크기가 작은거에서 큰거로는 가능, 큰거에서 작은거로는 불가능하다!
		
		
		// 2. a++, ++a, --a, a--
		
		int d = 1;
		System.out.println(d);
		System.out.println(d++);			// d를 출력하고, d에 +1 더해라.  d = 2
		System.out.println(d);
		
		System.out.println(++d);			// d에 +1을 더해라, 그리고 d를 출력해라. d = 3
		System.out.println(d--);			// d를 출력하고, d에 -1 빼는거. d = 2
		System.out.println(d);
		
		System.out.println(--d);			// d에 -1을 빼라 그리고 d를 출력해라. d =1
		
	}

}
