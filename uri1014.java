/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urisolution;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class uri1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int x;
        float y, result;
        
        x = input.nextInt();
        y = input.nextFloat();
        
        result = x / y;
        System.out.printf("%.3f km/l\n", result);
    }
    
}
