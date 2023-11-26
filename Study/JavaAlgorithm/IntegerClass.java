import java.util.Scanner;

public class IntegerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String Nums= scanner.nextLine();		// 문자열로 데이터를 받음 "1234"
		
		int num = Integer.parseInt(Nums);		//   1234
		
		System.out.println(num + 1);			// 1234 + 1 => 1235
		
		System.out.println(Nums + 1);			// "1234" + 1 => "1234" + "1" => "12341"
	}

}
