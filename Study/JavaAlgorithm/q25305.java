import java.util.*;

public class q25305 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		// 1. N값과 K값을 입력받는다.
		String NKString = scanner.nextLine();

		String[] NKStrings = NKString.split(" ");			//  띄어쓰기를 기준으로 문자를 분리
		int N = Integer.parseInt(NKStrings[0]);			// 왼쪽에 있는 문자를 Integer형으로 바꾸기
		int K = Integer.parseInt(NKStrings[1]);			// 오른쪽에 있는 문자를 Integer형으로 바꾸기
		
		// 2. 배열값을 입력받는다.
		int[] arrays = new int[N];  // N개의 배열을 만든다.
		
		String twoLine = scanner.nextLine();			// 두번째 라인을 입력받는다.
		
		String[] nums = twoLine.split(" ");			// 띄어쓰기를 기준으로 문자를 분리
		
		for(int i = 0 ; i < nums.length ;i++)
		{
			arrays[i] = Integer.parseInt(nums[i]);		// 각 문자인 숫자들을 Integer형으로 바꿔서 배열에 입력
		}
		
		// 3. 오름차순 정렬을 한다  
		Arrays.sort(arrays);
		
		// 4. 오른쪽에서 K번째 떨어진 것을 출력한다.
		System.out.println(arrays[arrays.length - K]);			// 맨 끝을 표현..
																// arrays.length -1
																// 맨 끝에서 K 
	}

}
