package sec08;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
///////////6��///////////////
		int[][]array1 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array1.length); // 3;
		System.out.println(array1[2].length); // 5;;
///////////7��///////////////	
		int[]array2 = {1, 5, 3, 8, 2 };
		int max = array2[0];
		for(int i=0; i<array2.length; i++) {
			if(array2[i] > max) {
				max = array2[i];
			}
		};
		System.out.println("�ִ밪�� "+max);
///////////8��///////////////
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
		System.out.println("��ü ��: "+sum);
		System.out.println("��ü���: "+avg);
		
		
///////////9��///////////////
		Scanner sc = new Scanner(System.in);
		
		boolean r = true;
		int studentNumber = 0;
		int[] scores = null;
		
		while(r) {
			System.out.println("------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("------------------------------------------------");
		    System.out.println("����> ");
		    
		    int selectNo = Integer.parseInt(sc.nextLine());
		    
		    switch(selectNo) {
		    case 1:
		    	System.out.println("�л� ���� �Է��ϼ���: ");
		        studentNumber =  Integer.parseInt(sc.nextLine()); 
		        scores = new int[studentNumber]; //�л��� ��ŭ�� ���� �迭�� ����� ���´�.
		        
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
		    	System.out.println("�Էµ� ���� :"+ Arrays.toString(scores)); 
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
		    	System.out.println("�ְ� ���� : "+ max1 +"��");
		    	System.out.println("��� ���� : "+ avg1 +"��");
		    	
		    	break;
		    	
		    case 5:
		    	r = false;
		    	break;
		    	default:
		    		r = false;
		    }
		}
		System.out.println("************************");
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		System.out.println("************************");
		
		
	   
	   
	}

}
