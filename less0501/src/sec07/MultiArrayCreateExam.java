package sec07;

public class MultiArrayCreateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 2���� �迭 ����
		int[][] scores = {
				{15,25,35},
				{50,70,30,40,90}
		};		
		
		
		//�迭�� ����
		System.out.println("�迭�� ���̴�: "+scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		//ù ��° ���� �� ��° ������  ?
		
		System.out.println("ù ��° ���� �� ��° �л� ������: "+scores[0][2]);
		//�� ��° ���� �� ��° �л� ������ ?
		System.out.println("�� ��° ���� �� ��° �л� ������: "+scores[1][1]);
		//ù ��° ���� ��� ������ ?
		
		int fclassSum = 0;
		for(int i=0; i<scores[0].length; i++) {
			fclassSum += scores[0][i];
		}
		double fclassAvg = (double) fclassSum / scores[0].length;
		System.out.println("ù ��° ���� ��� ������: "+fclassAvg);
		//�� ��° ���� ��� ������ ?
		int tclassSum = 0;
		for(int i=0; i<scores[1].length; i++) {
			tclassSum += scores[1][i];
		}
		double tclassAvg = (double) tclassSum / scores[1].length;
		System.out.println("�� ��° ���� ��� ������: "+tclassAvg);
		
		//��ü ���?
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++){
			
			totalStudent += scores[i].length;
			for(int j= 0; j<scores[i].length; j++) {
				totalSum += scores[i][j];
			}
		}
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println(totalAvg);
	}

}
