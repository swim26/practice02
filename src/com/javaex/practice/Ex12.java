package com.javaex.practice;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String symbol;
		int a, b;
		float Result;
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		symbol=sc.nextLine();
		System.out.print("숫자1: ");
		a=sc.nextInt();
		System.out.print("숫자2: ");
		b=sc.nextInt();
		if(a==0) {
		    System.out.println("계산할 수 없습니다.");
		}
		else if(b==0) {
			System.out.println("계산할 수 없습니다.");
   		}
		else {
		switch(symbol) {
		case("+"):
			Result=a+b;
			System.out.println("결과는: "+Result);
		break;
		case("-"):
			Result=a-b;
			System.out.println("결과는: "+Result);
		break;
		case("*"):
			Result=a*b;
			System.out.println("결과는: "+Result);
		break;
		case("/"):
			Result=a/b;
			System.out.println("결과는: "+Result);
		break;
		case("%"):
			Result=a+b;
			System.out.println("결과는: "+Result);
		break;		
		default:
		    System.out.println("계산할 수 없습니다.");
		break;
		}
		}		
	    sc.close();
	}
}
