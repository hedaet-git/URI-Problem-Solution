
package urisolution;

import java.util.Scanner;

public class UriSolution1064 {
    public static void main(String[] args) {
        
        float num,total = 0,average = 0;
		int positive = 0;
		Scanner sc =new Scanner(System.in);
		for (int i = 1; i <= 6; i++) {
			num =sc.nextFloat();
			if (num > 0) {
				positive = positive + 1;
				total = total + num;
			}
		}
		average = total / positive;
		System.out.print(positive+" valores positivos\n");
		System.out.printf("%.1f\n",average);
    }
    
}
