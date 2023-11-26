import java.util.*;
public class q1302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		// 1. N을 입력받는다.
		
		// 엔터값도 같이 입력받기때문에 nextLine을 사용함
		String NString = scanner.nextLine();
		
		int N = Integer.parseInt(NString);
		
		HashMap<String, Integer> map = new HashMap();
		
		// 2. N개 개수만큼 문자열을 입력받는다.
		/// 핵심!!! 
		for(int i = 0; i < N ; i++)
		{
			String key = scanner.nextLine();

			if(map.containsKey(key))
			{
				// 2-1 만약에 Dictionary에 키값이 있으면, + 1
				map.put(key, map.get(key)+ 1);
			}else {
				// 2-2 없으면, 초기화를 1로해준다.
				map.put(key, 1);
			}
		}
		//====================================================
		/*
		for(String key : map.keySet())
		{
			System.out.println(key +" : " + map.get(key));
		}*/
		
		boolean isFirst = true;
		int max = 0;		// 벨류의 최대값
		String answer = "" ;
		// 3. Dictionary를 순회한다.
		for(String key : map.keySet())
		{
			// 3-1. 밸류값의 최대를 구하고, 최대값보다 새로운 값이 클경우에는
			//      키값을 비교하고, 사전순으로 빨리나오는걸 선택한다.
			if(isFirst)
			{
				max = map.get(key);
				answer= key;
				isFirst= false;
			}else {
				// 저번주에 배웠던, 삽입정렬 (Insert Sort)의 개념이 나옴.
				// 현재 key의 밸류가 더 클경우에는 바로 많이 팔린 책이라는 뜻이니까, 
				// 많이 팔린 책의 이름으로 교체
				if(max < map.get(key))
				{
					max = map.get(key);
					answer= key;
				}else if(max == map.get(key))
				{
					// 많이 팔린 책이 2개가 있을때
					// 이름이 사전순으로 빠른걸 교체한다.
					if(answer.compareTo(key) > 0)
					{
						answer = key;
					}
				}
			}
		}
		// 4. 사전순으로 빨리나오는 키값을 출력한다.
		System.out.println(answer);
		
	}

}
