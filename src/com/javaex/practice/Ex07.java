package com.javaex.practice;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		int c,d;
		System.out.print("첫번째 숫자: ");
		a=sc.nextInt();
		System.out.print("두번째 숫자: ");
		b=sc.nextInt();
		if (a>b) {
			c=a/b;
			d=a%b;
			System.out.println("몫: "+c);
			System.out.println("나머지: "+d);			
		}
		else if(a<b) {
			c=b/a;
			d=b%a;
			System.out.println("몫: "+c);
			System.out.println("나머지: "+d);			
		}
		else {
			c=a/b;
			d=b%a;
			System.out.println("몫: "+c);
			System.out.println("나머지: "+d);			
		}
	    sc.close();
	}
}
