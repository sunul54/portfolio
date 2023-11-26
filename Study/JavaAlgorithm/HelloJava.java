import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		
		//C#  Console.WriteLine()  = System.out.println();
		
		/*
		 * 변수 int , char, long, short, float, double 
		 * if 문
		 * else
		 */
		
		int a = 5;
		float b = 5.0f;
		double c = 5.5;
		long d = 100000;
		short e = 1;
//		System.out.println("a : " + a + "b : " + b + "c : " + c + "d : " + d + "e : "+ e);
//
//        Scanner sc = new Scanner(System.in);
//		
//        System.out.print(sc.next()+ " ");  //print +line(엔터)
//        System.out.println(sc.next());
        
        if(a <= 5) {
        	System.out.println("True");
        }else {
        	System.out.println("False");
        }
	}

}
