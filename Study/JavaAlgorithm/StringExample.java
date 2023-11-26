
public class StringExample {

	public static void main(java.lang.String[] args) {
		// String 클래스 (문자열 클래스) , char[] = byte[] 
		String str; 		// str이라는 문자열을 선언 
		String str2 = "abc";		// str2 ="abc" 문자열 선언
									// str2   char[] values = new char[4];
									// values[0] = 'a'
									// values[1] = 'b'
									// values[2] = 'c'
									// values[3] = '\0'
		
		String str3 = "d2fea";		// char[] values = new char[6];
									// values[0] = 'd'
									// values[1] = '2'
									// values[2] = 'f'
									// values[3] = 'e'
									// values[4] = 'a'
									// values[5] ='\0' = 0(아스키코드, 유니코드)
		
		// (values[1] ='2')  == (values[1] = 2)
		
		// 자바 String 클래스!
		// String 클래스 특징
		
		// 1. String 문자열 대입 쉽다.
		String str4 = "dddwdw";   
		
		// 2. String 문자열 클래스에서 제공하는 메소드들이 유용하다.
		String str5 = "안녕 하세요.";
		
		// 문자열 분리
		String[] stringSplit = str5.split(" ");
		
		// stringSplit[0] = "안녕"
		// stringSplit[1] = "하세요."
		for(int i = 0 ; i< stringSplit.length ; i++)
		{
			System.out.println(stringSplit[i]);
		}
		
		// 문자열에서 문자 찾기
		String str6 = "Hong Yeong Ju";   //value[0] ='H' , value[1] = 'o' , value[2] ='n' 
											// value[3] = 'g' , value[4] = ' ', value[5] = 'Y'
		int charIndex = str6.indexOf('Y');
		System.out.println(charIndex);
		
		
		// 문자열 덧셈
		String str7 = "안녕";
		String str8 = "하세요.";
		String addString = str7 + str8;
		System.out.println(addString);			
		
		// 문자열 공백 삭제
		String str9 = "                       ㅇㅇ                       ";
		System.out.println(str9.trim());
		System.out.println(str9);
		
	}

}
