-+package java3;
import java.util.*;
public class q1158q {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);


        Queue Q = new LinkedList();

        int N = scan.nextInt();
        int K = scan.nextInt();

        for(int i = 1; i <= N; i++)
        {
            Q.add(i);
        }
        int count = 0;
        while(!Q.isEmpty())
        {
            int num = (int)Q.poll();
            
            // if 들어감
            // count =2 
            
            if(count == K)
            {
                count = 0;
                System.out.println(num);

            }else {
            	Q.add(num);
            	count++;   
            }

        }
    }

}