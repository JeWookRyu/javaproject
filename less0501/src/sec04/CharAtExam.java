package sec04;

import java.util.Scanner;

public class CharAtExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("������� �� �ֹε�� ù ° �ڸ��� -���� �Է��ϼ���.");
			String gender = sc.nextLine();
			
			if(gender.length() == 7) {
				char s = gender.charAt(6);
				switch(s) {
				case '1' : case '3':
					System.out.println("����� ���� �Դϴ�.");
					break;
				case '2' : case '4':
					System.out.println("����� ���� �Դϴ�.");
					break;
				}
				break;
				}
				
		}
		
	}

}
