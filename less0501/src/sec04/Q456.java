package sec04;

public class Q456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 74;
		int num2 = 36;
		
		System.out.println("4번 : "+(num1+num2));
		
		
		int num3 = 50;
		
		System.out.println("5번 : "+(int)(num3/3));
		
		System.out.println("7-1번 : "+(int)(-5+8*6));
		System.out.println("7-1번 : "+(int)((55+9)%9));
		System.out.println("7-1번 : "+(int)(20+3*5/8));
		System.out.println("7-1번 : "+(int)(5+15/3*2-8%3));
		
		
		
		
		int i;
		int j;
		for(i = 1; i<=9; i++) {
			System.out.println(i+"단을 출력합니다");
			for(j = 1; j<=9; j++){
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
		
		
		
		
		
	}

}
