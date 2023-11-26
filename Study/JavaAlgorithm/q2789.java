import java.util.Scanner;

public class q2789 {

	  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);

	        String input = scanner.nextLine();
	        String com = "CAMBRIDGE";
	        for(int i = 0; i < input.length(); i++ )
	        {
	        	// flag 기법을 사용해요!
	        	// flag 변수를 선언 및 초기화!
	        	boolean flag = true;
	            for(int j = 0; j < com.length(); j++) {
	                if(input.charAt(i) == com.charAt(j)) {
	                	// 여기에 flag 변수를 수정합니다.
	                	flag = false;
	                }
	            }
	            
	            // if문을 사용해서, flag가 설정이 되면, 출력할 수 있도록합니다.
	            // 만약 flag가 설정이 되지 않으면 출력을 하지 않으면 되겠죠!
	            if(flag)
	            {
	            	System.out.print(input.charAt(i)); // 엔터가 들어가는데.. 없에는 방법은?
	            }
	        }

	    }
}
