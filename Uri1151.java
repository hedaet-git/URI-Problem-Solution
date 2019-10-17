package urisolution;

import java.util.Scanner;


public class Uri1151 {

	public static void main(String[] args) {
		int FirstNumber = 0, SecondNumber = 1, fibonacci, n; 
		 
	    Scanner input = new Scanner(System.in);
	    n = input.nextInt();
		 System.out.print(FirstNumber+" "+SecondNumber);  
		 for(int i = 2;i < n; ++i)  
		 {    
		  fibonacci = FirstNumber + SecondNumber;    
		  System.out.print(" " + fibonacci);    
		  FirstNumber = SecondNumber;    
		  SecondNumber = fibonacci;    
		 }    
		 System.out.print("\n");
	}
}

