
package urisolution;

import java.util.Scanner;


public class Uri1117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float first_number, total = 0, total2 = 0, media;
        
        while(total2 != 2){
            first_number = input.nextFloat();
            
            if (first_number >= 0 && first_number <= 10) {
                total += first_number;
                total2 += 1;
            }
            else
                System.out.printf("nota invalida\n");
    }
        
        media = (float) total / 2;
        System.out.printf("media = %.2f\n",media);
   } 
}
