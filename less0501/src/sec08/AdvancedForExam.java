package sec08;

public class AdvancedForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] scores = { 95,71,35,69,77,88,15};
		
		//이 배열의 전체 합을 향상된 for문을 이용하여 구하라.
		//그리고 평균도 구하라.
		
		int Sum = 0;
		for(int str : scores) {
			Sum += str; // ==> Sum = Sum + str 과 같다
		}
		System.out.println("점수 총합: "+Sum);
		
		//평균
		
		double avg = (double)Sum / scores.length;
		System.out.println("점수 평균: "+avg);
		
		
	}

}
