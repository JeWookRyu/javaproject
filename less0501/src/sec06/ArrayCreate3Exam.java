package sec06;

public class ArrayCreate3Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�迭 ����� ����
		int[] arr1 = new int[3];
		
		//�ʱⰪ�� ���õ�
		for(int i = 0; i< 3; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		System.out.println("++++++++++");
		arr1[0]= 20;
		arr1[1]= 40;
		for(int i = 0; i< 3; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		System.out.println("============");
		System.out.println();
		double[] arr2 = new double[3];
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+",");
		}
	System.out.println();
		System.out.println("++++++++++++");

		arr2[0] = 0.11;
		arr2[1] = 0.22;
	   
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+",");
		}
		
		String[] arr3 = new String[4];
		for(int i = 0; i<4; i++ ) {
			System.out.println(arr3[i]+ ",");
		}
		arr3[0] = "��";
		arr3[1] = "����";
		arr3[2] = "����";
		
		for(int i =0 ; i<4; i++) {
			System.out.println(arr3[i]);
		}
		
		
		
	}

}
