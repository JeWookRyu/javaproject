package sec05;

public class SplitExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String board = " 1, 자바 학습, 참조 타입 String을 공부합니다. , 김철수";
		//쉼포를 기준으로 문자열을 분리
		String[] tks = board.split(",");


		//인덱스로 읽어오기
		System.out.println("번호 : "+ tks[0]);
		System.out.println("제목 : "+ tks[1]);
		System.out.println("내용 : "+ tks[2]);
		System.out.println("이름 : "+ tks[3]);
		System.out.println("+++++++++++++++");
		System.out.println();
		
		int i;
		for(i=0; i< tks.length; i++ ) {
			System.out.println(i+":"+tks[i]);	
		}
	}

}
