package Class10;

public class Calculator {

	
	//정적멤버 : 정적필드 + 정적 메소드
	//정적 필드
	static double pi = 3.14159;
	
	//정적 메소드
	static int puls(int x, int y) {
		return x + y ;
	}
	
	static int minus(int x, int y) {
		return x - y ;
	}
	
	//인스턴스 메소드
    int multiply(int x, int y) {
    	return x * y;
    }
}
