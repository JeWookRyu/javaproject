package sec06;

public class ArrayCreate2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//배열 변수만 선언
		
		int[] scores;
		
		//배열 변수에 점수를 대입해보자 국어 ,영어, 수학 점수를 대입
		
		scores = new int[] {90, 95, 94};
		
		printScores(new int[]{67,66,80});
		
		
	}
	public static void printScores(int[] scores) {
	  for(int i = 0; i<3; i++) {
		  System.out.println("scores["+i+"]: "+scores[i]);
		  
	  }
	}

}
