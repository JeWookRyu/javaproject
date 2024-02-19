package Class08;

public class ArrMethod {
	
	//필드 생략

	//생성자 생략(기본 생성자)
	
	//메소드
	int sum(int[] arrs){
		int sum = 0;
		
		for(int i=0; i< arrs.length; i++) {
			sum += arrs[i];
		}
		return sum;
	}
	
	//가변길이 매개변수를 이용하는 메소드
	int sum2(int ... arrs) {
        int sum = 0;
		
		for(int i=0; i< arrs.length; i++) {
			sum += arrs[i];
		}
		
		return sum;
	}
}
