package sec05;

public class SplitExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String board = " 1, �ڹ� �н�, ���� Ÿ�� String�� �����մϴ�. , ��ö��";
		//������ �������� ���ڿ��� �и�
		String[] tks = board.split(",");


		//�ε����� �о����
		System.out.println("��ȣ : "+ tks[0]);
		System.out.println("���� : "+ tks[1]);
		System.out.println("���� : "+ tks[2]);
		System.out.println("�̸� : "+ tks[3]);
		System.out.println("+++++++++++++++");
		System.out.println();
		
		int i;
		for(i=0; i< tks.length; i++ ) {
			System.out.println(i+":"+tks[i]);	
		}
	}

}