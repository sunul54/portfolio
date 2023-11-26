import java.util.*;
public class q2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		// 1. N 입력받는다.
		String NString = scanner.nextLine(); // 엔터값은 받지 않아짐.
		int N = Integer.parseInt(NString);
		
		// 2. N의 크기만큼 int 배열을 만든다.
		Integer[] array = new Integer[N];			// Integer <- 클래스
													// int 원시 자료형 
													// char, float, double, short
													// Character, Float, Double, Short
		
		//Character[] array2 = new Character[N];
		//Float[] array3 = new Float[N];
		// Double[] array4 = new Double[N];
		// Short[] array5 = new Short[n];
		for(int i = 0 ; i < N; i++)
		{
			String str = scanner.nextLine();
			int num = Integer.parseInt(str);
			
			array[i] = num;
		}
		
		// 3. 그걸 오름차순 정렬을 한다
		//BubbleSort(array);
		
		// 1. 기본적으로 사용
		//Arrays.sort(array);			// 기본 오름차순
		
		// 2. 내림차순으로 사용
		//Arrays.sort(array, Collections.reverseOrder());		// 내림차순

		
		// 사용자 정의로 정렬 함수 구현해서 사용
		/*
		Arrays.sort(array, new Comparator<Integer>() {
		    @Override
		    public int compare(Integer i1, Integer i2) {
		        return i2 - i1;			// 어떤식으로 정렬
		    }
		});
		*/
		
		// 선택정렬, 버블정렬
		
		// 4. 그걸 출력한다.
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
	}

	private static void BubbleSort(int[] array) {
		// 함수 내용
		// 버블 소트를 구현
		for(int j = 0; j <array.length-1  ;j++)
		{
			for(int i = 0; i < array.length - j - 1; i++)
			{
				// 오름차순
				// 왼쪽 > 오른쪽  -> 자리를 바꾼다
				// 내림차순
				// 왼쪽 < 오른쪽 
				if(array[i] > array[i+1])
				{
					// 두값을 변경하기 위해서는 temp라는 변수를 사용함
					int temp = array[i];
					array[i] = array[i+1];   
					array[i+1] = temp;		
				}
			}
		}
	}
	
}
