package Class08;

public class ArrExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 // 1���� 10���� ���� ������.
		
		ArrMethod array = new ArrMethod();
		
	 //	int[] arrs = {1,2,3,4,5,6,7,8,9,10};
		
		int rs = array.sum(new int[] {1,2,3,4,5,6,7,8,9,10});
		System.out.println("1���� 10������ ���� = "+rs);
		
		int rs2 = array.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("�������� �Ű����� ���:" + rs2);
	}

}
