package sec06;

public class ArrayCreateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�迭�� ����� ���ÿ� ����
		String[] season = {"String","Summer","Fall","Winter"};
		
		season[1] = "����";
		for(int i=0; i< season.length; i++) {
			System.out.println(season[i]);
		}
		
		int[] scores = {83,95,75};
		//for���� �̿��Ͽ� ���հ� ����� ���϶�.
		int x;
		int sum=0;
		for( x=0; x< scores.length; x++) {

			sum += scores[x];
		}
		System.out.println("����: "+sum);
		
		double avg =(double)sum / scores.length;
		System.out.println("���: "+avg);
		
		
		
	}

}
