package sec04;

import java.util.Scanner;

public class GenderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//970612-1
		System.out.println("�ֹι�ȣ�� ���� ���ڸ������� �Է��ϼ���.");
		String Gender = sc.nextLine();
		
		char b = Gender.charAt(7);
		
		if( b%2 == 0 ) {
			System.out.println("������ ���� �Դϴ�.");
		}else {
			System.out.println("������ ���� �Դϴ�.");
		}
		
	   
	}

}
