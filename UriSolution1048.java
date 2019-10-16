
package urisolution;

import java.util.Scanner;


public class UriSolution1048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salary, newSalary = 0, ExtraMoney = 0;
        int percent = 0;
        
        salary = input.nextFloat();
        
        if (salary >= 0 && salary <= 400.00) {
            percent = 15;
            newSalary = (float) (salary + (salary * (percent / 100.00)));
            ExtraMoney = (float) (salary * (percent / 100.00));
        }
        else if(salary <= 800.00){ //salary >= 400.01 && 
            percent = 12;
            newSalary = (float) (salary + (salary * (percent / 100.00)));
            ExtraMoney = (float) (salary * (percent / 100.00));
    }
        else if(salary <= 1200.00){//salary >= 800.01 && 
            percent = 10;
            newSalary = (float) (salary + (salary * (percent / 100.00)));
            ExtraMoney = (float) (salary * (percent / 100.00));
        }
        else if( salary <= 2000.00){//salary >= 1200.01 &&
            percent = 7;
            newSalary = (float) (salary + (salary * (percent / 100.00)));
            ExtraMoney = (float) (salary * (percent / 100.00));
        }
        else if(salary >= 1200.01){
            percent = 4;
            newSalary = (float) (salary + (salary * (percent / 100.00)));
            ExtraMoney = (float) (salary * (percent / 100.00));
        }
        
        System.out.printf("Novo salario: %.2f\n",newSalary);
		System.out.printf("Reajuste ganho: %.2f\n",ExtraMoney);
		System.out.print("Em percentual: "+percent+" %\n");

    }
}
