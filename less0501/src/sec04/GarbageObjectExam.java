package sec04;

public class GarbageObjectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hobby = "여행"; 
		// 힙영역에 "여행"이라는 객체가 생성되고 주소가 hobby에 할당
		hobby = null; // 여행에 해당하는 String 객체가 쓰레기가 됨

		String bestCar = "스포티지";
		String worstCar = bestCar; 
		// bestCar에 저장된 "스포티지" 객체 번지를 worstCar에 대입
	
		bestCar = null; //"스포티지" 객체는 쓰레기 수집기가 아님.
		System.out.println(bestCar);
	}

}
