package sec08;

public class MainStringArgsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if(args.length != 4) {
			System.out.println("�Ű������� ���� �����ϰų� �����ϴ�.");
			System.exit(0); //���α׷� ��������
		}
		String snum1 = args[0];
		String snum2 = args[1];
		String snum3 = args[2];
		String snum4 = args[3];
		
		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		int num3 = Integer.parseInt(snum3);
		int num4 = Integer.parseInt(snum4);
		
		
		int result = num1+num2+num3+num4;
		
		System.out.println("4���� ���� ����: "+result);
		System.out.println("4���� ���� �����: "+result/args.length);
		
	}

}
