
package urisolution;

import java.util.Scanner;


public class Uri1149 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, n, total = 0;
        int result = 0;
        a = input.nextInt();
        n = input.nextInt();
        
        //while((n = input.nextInt()) <= 0);
        while(n <= 0);
        
        for (int i = 1; i <= n; i++) {
            total += a;
            a ++;
        }
        System.out.print(total + "\n");
       
    }
    
}
