package sec08;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
///////////6번///////////////
		int[][]array1 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array1.length); // 3;
		System.out.println(array1[2].length); // 5;;
///////////7번///////////////	
		int[]array2 = {1, 5, 3, 8, 2 };
		int max = array2[0];
		for(int i=0; i<array2.length; i++) {
			if(array2[i] > max) {
				max = array2[i];
			}
		};
		System.out.println("최대값은 "+max);
///////////8번///////////////
		int[][]array3 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum =0 ;
		int count = 0;
		for(int i = 0;  i<array3.length; i++) {
			for(int x=0; x<array3[i].length; x++) {
				sum += array3[i][x];
				count++;
			}
		}
		double avg = (double) sum/count;
		System.out.println("전체 합: "+sum);
		System.out.println("전체평균: "+avg);
		
		
///////////9번///////////////
		Scanner sc = new Scanner(System.in);
		
		boolean r = true;
		int studentNumber = 0;
		int[] scores = null;
		
		while(r) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------------");
		    System.out.println("선택> ");
		    
		    int selectNo = Integer.parseInt(sc.nextLine());
		    
		    switch(selectNo) {
		    case 1:
		    	System.out.println("학생 수를 입력하세요: ");
		        studentNumber =  Integer.parseInt(sc.nextLine()); 
		        scores = new int[studentNumber]; //학생수 만큼의 점수 배열을 만들어 놓는다.
		        
		    	break;
		    	
		    case 2:
		    	for(int i=0; i<scores.length; i++) {
		    		scores[i] = Integer.parseInt(sc.nextLine());
		    	}
		    	
		    	break;
		    	
		    case 3:
		    	for(int i=0; i<scores.length; i++) {
		    		System.out.print(scores[i]+",");
		    	}
		    	System.out.println("입력된 점수 :"+ Arrays.toString(scores)); 
		    	break;
		    	
		    case 4:
		    	int max1 =0;
		    	int sum1 =0;
		    	double avg1 = 0.0;
		    	for(int i=0; i<scores.length; i++) {
		    		max1 = (max1< scores[i]) ? scores[i]: max1;
		    		sum1 += scores[i];
		    	}
		    	
		    	avg1 = (double) sum1 / studentNumber;
		    	System.out.println("최고 점수 : "+ max1 +"점");
		    	System.out.println("평균 점수 : "+ avg1 +"점");
		    	
		    	break;
		    	
		    case 5:
		    	r = false;
		    	break;
		    	default:
		    		r = false;
		    }
		}
		System.out.println("************************");
		System.out.println("프로그램이 종료 되었습니다.");
		System.out.println("************************");
		
		
	   
	   
	}

}
