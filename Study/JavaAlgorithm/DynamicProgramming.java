import java.util.*;
public class DynamicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 피보나치 수열
		// 1,1, 2, 3, 5, 8, 13 ....
		
		Scanner scan = new Scanner(System.in);
		
		int index = scan.nextInt();
		long[] f = new long[101];
		
		// 1. 초기값 설정
		f[0] = 0;
		f[1] = 1;
		
		// 2. 점화식을 찾고, 점화식을 for문으로 표현
		for(int i = 2; i<=100 ; i++)
		{
			f[i] = f[i-1] + f[i-2];
		}
		
		System.out.println(f[index]);
	}

}
