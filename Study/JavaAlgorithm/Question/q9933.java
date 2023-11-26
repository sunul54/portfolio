package Question;

import java.util.*;
public class q9933 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 입력값을 Dictionary에 넣는다. <String, Integer>
		
		// Hashmap(Java) == Dictionary(Python) 
		HashMap<String, Integer> map = new HashMap();
		
		String NString = scanner.nextLine();
		int N = Integer.parseInt(NString);
		
		for(int i = 0 ; i < N ; i++)
		{
			String key = scanner.nextLine();
			map.put(key, 1);
		}
		
		// 2. Dictionary 값을 1차 순회한다.(for) 
		// 향상된 for문 
		for(String key : map.keySet()) {
			// 2-1. 키값을 뒤집는다. las => sal
			
			// temp 변수
			String reverse = "";
			for(int i = key.length() - 1 ; i >= 0; i--)
			{
				reverse += key.charAt(i);
			}
			
			// 2-2. 만약에 뒤집은 값이 Dictionary에 있으면, 비밀번호 길이와 가운데 글자를 출력하고 마친다.
			
			// 거꾸로 된 문자열이 Dictionary에 있으면,
			if(map.containsKey(reverse))
			{
				// 비밀번호의 길이를 출력한다
				// 가운데 글자를 출력한다.
				// 5 => 2   0 1 2 3 4    5 / 2 => 2.5 => 2?   int!  (int)2.5 = >2
				// 7 => 3   0 1 2 3 4 5 6   7 /3 => 3.5  =>3?
				// 길이 / 2 => 가운데의 인덱스
				
				// 2.5 => (int) => 2
				// 3.5 => (int) => 3
				System.out.println(key.length() + " " + key.charAt(key.length() /2));
				break;
			}
		}
	}

}
