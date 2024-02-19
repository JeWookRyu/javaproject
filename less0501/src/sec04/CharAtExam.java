package sec04;

import java.util.Scanner;

public class CharAtExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("생년월일 과 주민등록 첫 째 자리를 -없이 입려하세요.");
			String gender = sc.nextLine();
			
			if(gender.length() == 7) {
				char s = gender.charAt(6);
				switch(s) {
				case '1' : case '3':
					System.out.println("당신은 남자 입니다.");
					break;
				case '2' : case '4':
					System.out.println("당신은 여자 입니다.");
					break;
				}
				break;
				}
				
		}
		
	}

}
