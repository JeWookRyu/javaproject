package sec06;

public class ArrayCreate2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�迭 ������ ����
		
		int[] scores;
		
		//�迭 ������ ������ �����غ��� ���� ,����, ���� ������ ����
		
		scores = new int[] {90, 95, 94};
		
		printScores(new int[]{67,66,80});
		
		
	}
	public static void printScores(int[] scores) {
	  for(int i = 0; i<3; i++) {
		  System.out.println("scores["+i+"]: "+scores[i]);
		  
	  }
	}

}
