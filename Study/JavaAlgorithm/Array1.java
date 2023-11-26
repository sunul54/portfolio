
public class Array1 {

	public static void main(String[] args) {
		
		// 변수 
		// a,b,c,d,e가 같은 성격의 데이터라면?
		// 학교 성적에 관한 데이터
		// 사용하는 이유 1. 같은 성격의 데이터일 때 관리하기 편하기 위해서
//		int score_A = 1;
//		int score_B = 2;
//		int score_C = 3;
//		int score_D = 4;
//		int score_E = 5;
		
		// 사용하는 이유 2. 반복문 사용을 위해서
//		int [] scores = new int[5];
		
		
//		for(int i = 0 ; i < 5; i++)
//		{
//			scores[i] = i+1;
//			System.out.println(scores[i]);
//		}
		
		
		// char 1byte => -128~127
		// unsigned char 1byte => 0~255
		
		// 배열
		int[] array = new int[5];   //20byte
		// int형인 배열을 선언한다. 배열의 이름은 array
		// 배열을 선언했는데, 그것은 5개를 가지고 있다.
		// 자바는 주소기반, C언어, C++은 값기반, 주소기반
		
		
		array[0] = 1;   // 4 byte
		array[1] = 2;   // 4 byte
		array[2] = 3;   // 4 byte
		array[3] = 4;   // 4 byte
		array[4] = 5;   // 4 byte

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array = new int[4];
		
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			//array[i] = i* 2;
			System.out.println(array[i]);
		}
		
		////////////////////////////////
		
		// int !
		//char 2, long 8, short 2, float 4, double 8
		char[] chars = new char[5];  		// 5bytes
		long[] longs = new long[5];			// 40bytes
		short[] shorts = new short[5];		// 10bytes
		float[] floats = new float[5];		// 20bytes
		double[] doubles = new double[5];	// 40bytes
		
		// 유니코드 2byte => 0~65535  65 : a, 66 :b ~  (전세계 문자를 매칭)
		// ASCII  1byte => 0~255    65 :a 66: b,   (영어 알파벳)
		System.out.println("chars size : " + Character.BYTES * chars.length);
		System.out.println("chars size : " + Long.BYTES * longs.length);
		System.out.println("chars size : " + Short.BYTES * shorts.length);
		System.out.println("chars size : " + Float.BYTES * floats.length);
		System.out.println("chars size : " + Double.BYTES * doubles.length);
		
		
		// 배열 + 반복문
		int i = 0;
		while(true) {
			if(i >= 4) break;
			
			System.out.println(i++);
		}
				
	}

}
