package Rr;

import java.util.Scanner;


public class Main {
	static int thread;

	public static void main(String[] args) {
		System.out.println("program started");
		System.out.println("Enter your thread no.");
		System.out.println(" thread no. should be as 1,2,4,8,16,32");
		Scanner sc =new Scanner(System.in);
		 thread =sc.nextInt();
		 Thread1 t =new Thread1();
		 t.printOutput();
		 System.out.println("program ran sucessfully");
		 sc.close();
		 
  }
}
