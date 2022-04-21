package Day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//
		//relational operator
		System.out.println("enter the number 3");
		int a,b,c;
		
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 if(a>b&&a>c) {
			 System.out.println(a+"the greatest number");
		 }
		 else if(b>a&&b>c) {
			 
			 System.out.println(b+"the greatest number");
		 }
		 else {
			 System.out.println(c+ "the greatest number");
		 }
		
		
		
		
}
}