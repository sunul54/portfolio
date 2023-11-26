import java.util.*;
public class q22 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        
        int N = scan.nextInt();  // nextInt()를 사용하면 Enter값을 입력을 받지 못합니다.
        						// 그래서, String 첫번째 입력을 받을 때 Enter값인 ""값이 입력이 되었어요.
        						// 그래서, scan.nextInt() 메소드를 한번 더 사용해서 enter값을 지워줘야합니다.

        scan.nextLine();
        HashMap<String,Integer> map = new HashMap();

        for(int i = 0; i < N; i++)
        {
            String temp = scan.nextLine();
            map.put(temp,1);
        }

        for(String key : map.keySet())
        {
            String revers ="";
            for(int i = key.length() - 1; i>=0;i--)
            {
                revers += key.charAt(i);
            }
            if(map.containsKey(revers))
            {
                System.out.println(revers.length() + " " +revers.charAt(revers.length()/2));
                break;
            }
        }



    }

}