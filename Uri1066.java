
package urisolution;

import java.util.Scanner;
public class Uri1066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, even = 0, odd = 0, positive = 0, negative = 0;
        
        for (int i = 0; i < 5; i++) {
            n = input.nextInt();
            if (n % 2 == 0) {
                even ++;
            }
            if (n % 2 != 0) {
                odd ++;
            }
            if (n >= 0) {
               positive ++; 
            }
            if (n < 0) {
              negative ++;  
            }
        }
        System.out.printf("%d valor(es) par(es)\n", odd);
        System.out.printf("%d valor(es) impar(es)\n", even);
        System.out.printf("%d valor(es) positivo(s)\n", positive);
        System.out.printf("%d valor(es) negativo(s)\n", negative);
        
    }
}
