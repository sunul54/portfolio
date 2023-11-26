import java.util.*;
public class q1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner  = new Scanner(System.in);
		// 1. N을 입력받는다.
		String NString = scanner.nextLine();
		
		int N = Integer.parseInt(NString);
		// 2. N개의 문자열 배열을 만든다.
		
		String[] arrays = new String[N];
		
		// 3. N번만큼 문자열을 입력받는다.
		for(int i = 0; i < N ; i++)
		{
			arrays[i] = scanner.nextLine();
		}
	
		// 4. 사용자 정의 정렬함수를 만들고
		// 길이가 짧은 것부터
		// 길이가 같으면 사전 순으로
		// 규칙대로 정렬한다.
		Arrays.sort(arrays, new Comparator<String>() {
			
			// Compare 함수
			// 반환형 : int
			
			// 양수, 0, 음수
			// + 면 자리를 s1, s2의 자리를 바꾸기
			// 0, 음수 자리를 바꾸지 않기
			@Override 
			public int compare(String s1, String s2)
			{
				// 길이가 같지 않으면, 길이가 짧은 것부터 비교
				if(s1.length() != s2.length())
				{
					// s1.length() :길이
					
					// s1.length() - s2.length()   => s1.길이 - s2.길이
					// s1 : iada  , s2 : sdasdsa
					// s1 : 4, s2 : 7
					// s1-s2 = -3 : 음수
				
					
					// s1 : dsadasdas,  s2 : ida
					// 첫번째 ida, 두번째 dsadasdas
					// s1.length : 9  , s2.length :3 
					// s1.length - s2.length
					// 9 -3 : 양수
					return s1.length() - s2.length();
				}else {
					// 길이가 같으면, 사전 순으로
					// compareTo 함수를 사용하면 자동으로 사전순으로 출력
					return s1.compareTo(s2);
				}
			}
		});
		
		System.out.println(arrays[0]);
		// 5. 정렬된것들을 그대로 출력한다.
		for(int i = 1 ; i < arrays.length ;i++)
		{
			if(!arrays[i-1].equals(arrays[i]))
				System.out.println(arrays[i]);
		}
		// 중복된것이 있으면 출력하면 안된다.
	}

}
