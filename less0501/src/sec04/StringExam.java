package sec04;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 ="홍길동";
		String name2 ="홍길동";
		
		String name3 = new String("홍길동");
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name2 == name3);
		
		System.out.println(name1.equals(name3));
		
		// equals 연산을 사용하면 오로지 객체만 비교함
		
		String str = null; // 힙영역이 존재 하지않음
		String str2 = ""; // 빈공간의 힙영역이 존재함
		System.out.println(str == str2);
	}

}
