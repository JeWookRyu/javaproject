package sec08;

public class AdvancedForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] scores = { 95,71,35,69,77,88,15};
		
		//�� �迭�� ��ü ���� ���� for���� �̿��Ͽ� ���϶�.
		//�׸��� ��յ� ���϶�.
		
		int Sum = 0;
		for(int str : scores) {
			Sum += str; // ==> Sum = Sum + str �� ����
		}
		System.out.println("���� ����: "+Sum);
		
		//���
		
		double avg = (double)Sum / scores.length;
		System.out.println("���� ���: "+avg);
		
		
	}

}
