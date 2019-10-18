
package urisolution;

import java.util.Scanner;


public class Uri1113 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int x, y;
       
       do {
           x = input.nextInt();
           y = input.nextInt();
            if (x > y) {
                System.out.print("Decrescente\n");  
                
            }else if (x < y) {
                System.out.print("Crescente\n");
            }
            
        }while(x != y);
    }
    
}
