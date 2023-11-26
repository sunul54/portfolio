import java.util.Scanner;


public class q2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        int M = scanner.nextInt();
        boolean flag = false;
        for(int i = 0; i < M; i++) {
        	int sum = i;		// 생성자
        	
        	/*
            for(int j = i; j !=0 ; j = j/10) {
                sum += (j%10);
            }
            */
        	
        	sum += Calculate(i);  //216  + 6 + 1 + 2 +0
            
        	if(sum == M) {
                System.out.println(i);
                // flag! 기법
                flag = true;
                break;
            }
        }
        if(!flag)
        	System.out.println(0);

	}
	
	// 함수 , 재귀함수
	private static int Calculate(int num)  // num 0
	{
		if(num == 0)
			return 0;
		
		return (num % 10) + Calculate(num /10);   // 6 + 1 + 2 +0;
	}
}

