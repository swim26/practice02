package com.javaex.practice;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long a; 
		float tax;
		System.out.println("수익을 입력해 주세요");
		System.out.print("금액: ");
		a=sc.nextLong();
		if (a>=0 && a<=1000) {
            tax=a*0.09f;	
    		System.out.println("소득세는 "+tax+" 입니다.");
		}		
		else if (a>1000 && a<=4000) {
            tax=1000*0.09f+0.18f*(a-1000);
    		System.out.println("소득세는 "+tax+" 입니다.");
		}		
		else if (a>4000 && a< 8000) {
            tax=1000*0.09f+3000*0.18f+0.27f*(a-4000);
    		System.out.println("소득세는 "+tax+" 입니다.");
		}
		else if (a>= 8000) {
            tax=1000*0.09f+3000*0.18f+4000*0.27f+0.36f*(a-8000);
    		System.out.println("소득세는 "+tax+" 입니다.");
		}		 
		else {
		System.out.println("잘못 입력했습니다.");
		}	
	    sc.close();
	}
}
