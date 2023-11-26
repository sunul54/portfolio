import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort {

	// public : 접근 제한자
	// static : 정적함수
	// 파라미터 : String[] arg
	// 반환형 : void 없다. (int, float, double, 배열, String, 클래스, 큐, 스택)
	// 모든 Language  (C#, C, C++, JAVA, Python, javascript)
	// Main함수  => 프로그램 시작점!!
	// 남의 코드를 분석 
	// Main부터 분석함!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[5];  // int 형 배열 5개
		
		array[0] = 10;
		array[1] = 5;
		array[2] = 3;
		array[3] = 9;
		array[4] = 8;
		
		System.out.println("before");
		// 함수 PrintArray()
		PrintArray(array);
		
		// 버블소트 사용
		BubbleSort(array);
		
		System.out.println("after");
		PrintArray(array);
		
		int[] array2 = new int[5];  // int 형 배열 5개
		
		array2[0] = 10;
		array2[1] = 5;
		array2[2] = 3;
		array2[3] = 9;
		array2[4] = 8;
		
		System.out.println("before");
		// 함수 PrintArray()
		PrintArray(array2);
		
		// 선택정렬사용
		SelectionSort(array2);
		
		System.out.println("after");
		PrintArray(array2);
		
		//////////////////////////////////////////////////////////
		int[] array3 = new int[5];  // int 형 배열 5개

		array3[0] = 10;
		array3[1] = 5;
		array3[2] = 3;
		array3[3] = 9;
		array3[4] = 8;


		System.out.println("before");
		PrintArray(array3);
		Arrays.sort(array3);
		System.out.println("after");
		PrintArray(array3);
		
		Integer[] array4 = new Integer[5];  // int 형 배열 5개

		array4[0] = 10;
		array4[1] = 5;
		array4[2] = 3;
		array4[3] = 9;
		array4[4] = 8;
		
		Arrays.sort(array4, Collections.reverseOrder());
		
		Arrays.sort(array4, new Comparator<Integer>() {
		    @Override
		    public int compare(Integer i1, Integer i2) {
		        return i2 - i1;
		    }
		});
		
	}
	

	
	// 리팩토링 다시 코드를 작성한다.
	private static void PrintArray(int[] array) {
		for(int i = 0 ; i < array.length; i++)
		{
			System.out.print(array[i] + " ");  // array[i] + " " <- 파라미터
		}
		System.out.println();
	}
	
	// 함수 정의 (메소드)
	// 메소드 = 함수
	// 함수이름 : BubbleSort()
	// 반환형 함수이름(파라미터)
	// 반환형 : 함수가 끝나고, 함수에서 값을 반환하는 자료형
	// void : 아무것도 없음.
	// int, float, double, short, char, String
	// int[], short[], double[], short[]
	// private : 접근 제한자, 클래스
	// static : 정적 함수,  
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
				if(array[i] < array[i+1])
				{
					// 두값을 변경하기 위해서는 temp라는 변수를 사용함
					int temp = array[i];
					array[i] = array[i+1];   
					array[i+1] = temp;		
				}
			}
		}
	}
	
	
	private static void SelectionSort(int[] array)
	{
		// 선택정렬 알고리즘을 만들거에요
		for(int i = 0 ; i < array.length - 1; i++)
		{
			// 현재 화살표의 인덱스
			int min = i;
			
			for(int j = i + 1 ; j <array.length ;j++)
			{
				// 최솟값의 데이터 > 비교 대상의 데이터
				// 이면 최솟값의 인덱스를 바꾼다.
				if(array[min] >array[j])
				{
					min = j;
				}
			}
			
			// 선택한 화살표 자리랑 비교대상군이랑 바꾸기
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
	

}
