package sec08;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���̰� 3�� �迭�� ����
		String[] oldStrArr = {"Java", "Javascript", "mysql"};
		
		//���̰� 5�� �迭�� ���� ����
		String[] newStrArr = new String[5];
		
		//���̰� 3�� �迭�� �׸��� 5�� �迭�� ����
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for(int i =0 ; i< newStrArr.length; i++) {
			System.out.print(newStrArr[i]+",");
		}
		System.out.println();
		for(String str : newStrArr) {
			System.out.print(str+", ");
		}
		
		
	}

}
