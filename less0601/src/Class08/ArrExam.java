package Class08;

public class ArrExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 // 1부터 10까지 더해 보세요.
		
		ArrMethod array = new ArrMethod();
		
	 //	int[] arrs = {1,2,3,4,5,6,7,8,9,10};
		
		int rs = array.sum(new int[] {1,2,3,4,5,6,7,8,9,10});
		System.out.println("1부터 10까지의 합은 = "+rs);
		
		int rs2 = array.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("가변길이 매개변수 출력:" + rs2);
	}

}
