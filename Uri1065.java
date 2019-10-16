//URI Online Judge | 1065
//Even Between five Numbers
//Hedaet HR Rahman

package urisolution;

import java.util.Scanner;

public class Uri1065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, even = 0;
        
        for (int i = 0; i < 5; i++) {
            n = input.nextInt();
            if (n % 2 == 0) {
                even ++;
            }
        }
        System.out.printf("%d valores pares\n", even);
    }
}
