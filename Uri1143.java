
package urisolution;

import java.util.Scanner;


public class Uri1143 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = i, k = (j * i), l = (k * j); j == i; j++) {
                System.out.print(j + " " + k + " " + l +"\n");   
            }
        }
     
        
    }
    
}
