import java.util.Scanner;

public class q2439 {

	public static void main(String[] args) {
		
		// n이 최대 출력 행의 개수라면
		// O(공백의 갯수) = n - (현재 행) 
		// *(별표의 갯수) = (현재 행)

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n ;i++) {
			
			for(int j = n - i - 1 ; j > 0 ;j--)
			{
				System.out.print(" ");
			}
				
			for(int j = 0; j <=i ;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
