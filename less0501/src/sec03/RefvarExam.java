package sec03;

public class RefvarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] arr1; // 배열변수 arr1 선언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3 }; //배열 [1,2,3]을 생성한 다음에 그 배열을 arr1에 넣음
		arr2 = new int[] {1, 2, 3 }; // 배열 [1,2,3]을 생성한 다음에 그 배열을 arr2에 넣음
		arr3 = arr2; // 배열변수 arr2 의 값을 arr3에 넣음 
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);

	}

}
