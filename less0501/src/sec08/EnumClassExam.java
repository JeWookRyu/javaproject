package sec08;

import java.util.Calendar;

public class EnumClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Week today = null;
		//��ǻ�Ϳ� �ִ� ��¥ ���� �ð��� ��������  java.utill.Calendar�� �̿�
		//java.util.GregorianCalendar
		//enum(����Ÿ��)�� �빮�ڷ� ����. ���մܾ��� ��� ������ũ ǥ����� �̿� ex) YEAR_MONTH
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); //��
		int month = now.get((Calendar.MONTH) + 1); //��
		int day = now.get(Calendar.DAY_OF_MONTH); //��
        int week = now.get(Calendar.DAY_OF_WEEK);//���� (1~7)
        int hour = now.get(Calendar.HOUR);// �ð�
		int minute = now.get(Calendar.MINUTE); //��
        int second = now.get(Calendar.SECOND); //��
        
        
        
        System.out.println(
        		"����: "+year+"��"+month+"��"+day+"��"+week+"����"+hour+"��"+minute+"��"+second+"��"
        		);
        ///////////////////////////////////////////
        
        
        switch(week) {
        case 1 :
        	today = Week.SUNDAY;
        	break;
        	
        case 2 :
        	today = Week.MONDAY;
        	break;
        	
        case 3 :
        	today = Week.TUESDAY;
        	break;	
        	
        case 4 :
        	today = Week.WEDNESDAY;
        	break;	
        
        case 5 :
        	today = Week.THURSDAY;
        	break;
        	
        case 6 :
        	today = Week.FRIDAY;
        	break;
        	
        case 7 :
        	today = Week.SATURDAY;
        	break;
        }
        
        if(today == Week.SUNDAY) {
        	System.out.println("�Ͽ��Ͽ��� �౸�� ���ϴ�.");
        }else if(today == Week.WEDNESDAY) {
        	System.out.println("�ڹٰ��θ� ��� �մϴ�.");
        }else {
        	System.out.println("�ٸ� ���Ͽ��� �ڹ� ���θ� �մϴ�.");
        }
        
        
        
        
	}

}
