
package urisolution;

import java.util.Scanner;


public class Uri1099 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, x, y;
        
        
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            int odd = 0;
            x = input.nextInt();
            y = input.nextInt();
            
            if (x > y) {
                for (int j = x - 1; j > y; j--) {
                    if (j % 2 != 0) {
                        odd += j;
                    }
                }
 
            }
            else if (x < y) {
                for (int j = x + 1; j < y; j++) {
                    if (j % 2 != 0) {
                        odd += j;
                    }
                }
 
            }
            else
                odd = 0;
            System.out.printf( odd + "\n");
        }
        
        
           
    }
}
