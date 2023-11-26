import java.util.Scanner;

public class q8393 {

	public static void main(String[] args) {
		
		// 1~n까지 구하고 싶으면, 
		// 1~n-1인 상태에서 +n 을 하면됨.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// n==3  가정
		int sum = 0;  // temp 변수 (임시 변수) 
		for(int i=1; i<= n; i++) { 
			sum = sum + i;
		}
		
		// i = 1
		// 1<=3  =>true
		// sum = 0 + 1 = 1
		// i = i + 1 => i++  , i= 2
		// 2 <=3  => true
		// sum = 1(이전상태) + 2(i 값) = 3
		// i++, i = 3
		// 3 <= 3 => true
		// sum = 3(이전상태) + 3(i 값) = 6
		
		System.out.println(sum);
		
	}

}
