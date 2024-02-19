package sec04;

import java.util.Scanner;

public class GenderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//970612-1
		System.out.println("주민번호를 뒤의 한자리까지만 입력하세요.");
		String Gender = sc.nextLine();
		
		char b = Gender.charAt(7);
		
		if( b%2 == 0 ) {
			System.out.println("성별이 여성 입니다.");
		}else {
			System.out.println("성별이 남성 입니다.");
		}
		
	   
	}

}
