package Class10;

public class CalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정적 멤버 : 클래스에 소속되어 있지않기때문에 어디서든 선언없이 사용가능
		double result1 = 10 * 10 * Calculator.pi;
		System.out.println("반지름이 10인 원의 원주율은 " + result1 +"입니다.");
		
		int result2 = Calculator.puls(10, 5);
		System.out.println("10 + 5 = "+result2);
		
		int result3 = Calculator.minus(10, 5);
		System.out.println("10 - 5 = "+result3);
		//------------------------------------------------
		
		//인스턴스 멤버 : 클래스에 소속된 멤버이기때문에 생성자 선언을 해줘야한다.
		Calculator cal = new Calculator();
		int result4 = cal.multiply(10,5);
		System.out.println("10 * 5 = "+result4);
        //------------------------------------------------

	}

}
