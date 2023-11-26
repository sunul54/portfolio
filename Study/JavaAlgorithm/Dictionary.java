import java.util.HashMap;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap();
		HashMap<Integer, String> map2 = new HashMap();
		HashMap<Float, Integer> map3 = new HashMap();
		
		//HashMap<NewClass, Integer> map4 = new HashMap();
		
		// 이름 - 점수
		// 키 - 밸류
		// 키는 딱 1개만 유일하다.
		// 키값은 딱 유일한 1개만 존재한다. <-
		map.put("영주", 10);
		map.put("영주", 20);
		map.put("선율", 100);
		map.put("선율", 110);
		
		System.out.println("영주의 점수: " + map.get("영주"));
		System.out.println("선율의 점수: " + map.get("선율"));
		
		// containsKey(키값)  => 키값이 테이블에 있으면, true, 없으면 False
		if(map.containsKey("영주"))
		{
			System.out.println("영주가 HashTable에 있습니다.");
		}
		
		if(!map.containsKey("철수"))
		{
			System.out.println("철수가 테이블에 없습니다.");
		}
		
		System.out.println("테이블의 개수는 총 " + map.size() + "개 입니다.");
		
	}

}
