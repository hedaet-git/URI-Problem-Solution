import java.util.*;

public class uri1074 {
 
    public static void main(String[] args){
 
         int N, i, x;
         Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         for( i = 1; i <= N; i++){
          x = sc.nextInt();
          if(x == 0){
           System.out.printf("NULL\n");
          }else if(x % 2 == 0){
           if(x > 0){
            System.out.printf("EVEN POSITIVE\n");
           }else{
            System.out.printf("EVEN NEGATIVE\n");
           }
        
          }else{
           if(x > 0){
            System.out.printf("ODD POSITIVE\n");
           }else{
            System.out.printf("ODD NEGATIVE\n");
           }
          }
        
         }
 
    }
 
}