package sec08;

import java.util.Calendar;

public class EnumClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Week today = null;
		//컴퓨터에 있는 날짜 요일 시간을 얻으려면  java.utill.Calendar를 이용
		//java.util.GregorianCalendar
		//enum(열거타입)은 대문자로 쓴다. 복합단어의 경우 스네이크 표기법을 이용 ex) YEAR_MONTH
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); //연
		int month = now.get((Calendar.MONTH) + 1); //월
		int day = now.get(Calendar.DAY_OF_MONTH); //일
        int week = now.get(Calendar.DAY_OF_WEEK);//요일 (1~7)
        int hour = now.get(Calendar.HOUR);// 시간
		int minute = now.get(Calendar.MINUTE); //분
        int second = now.get(Calendar.SECOND); //초
        
        
        
        System.out.println(
        		"현재: "+year+"년"+month+"월"+day+"일"+week+"요일"+hour+"시"+minute+"분"+second+"초"
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
        	System.out.println("일요일에는 축구를 봅니다.");
        }else if(today == Week.WEDNESDAY) {
        	System.out.println("자바공부를 댑따 합니다.");
        }else {
        	System.out.println("다른 요일에도 자바 공부만 합니다.");
        }
        
        
        
        
	}

}
