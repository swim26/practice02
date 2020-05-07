package com.javaex.practice;
import java.util.Scanner;
public class Ex09 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		a=sc.nextInt();
		System.out.print("두번째 숫자: ");
		b=sc.nextInt();
		if (a<b) {
		   if(a%2==1) {
			  System.out.println(a+" 는(은)"+b+" 의 약수입니다.");
		  }	
		   else {
			  System.out.println(a+" 는(은)"+b+" 의 약수가 아닙니다.");
		  }
		  }
		else if (a>b) {
			if(b%2==1) {
			  System.out.println(b+" 는(은)"+a+" 의 약수입니다.");
		  }	
		    else{
			  System.out.println(b+" 는(은)"+a+" 의 약수가 아닙니다.");
		  }
		  }		
	    sc.close();
	}

}
