package hackerrank.algorithm;
import java.io.*;
import java.util.Scanner;
public class FourMultiple {
public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = Integer.parseInt(scanner.nextLine()); 
    
        
        for(int i =0; i< numberOfRows; i++){
            boolean isFound = false;
            long value = calc(Integer.parseInt(scanner.nextLine()));
            deduceResult(value);
        }
        
}
    
    
    private static long calc( int n ) {
          long factor5;
          long factor2;
          long j;
          long a;
          long b;
          long i;

          /* trivial case 0 result is 0 */
          if( n==0 ) return 0;

          /* find the number of factors 2 and 5 in n */
          for( a=n, factor5=0; a%5==0; a/=5, factor5++ ); 
          for( a=n, factor2=0; a%2==0; a/=2, factor2++ );

          /* result is r=b*a where a=2^(j+2)*5^j */
          j=factor5;
          if( j < factor2-2 ) j=factor2-2;

          for( a=4,i=0; i<j; i++, a*=10 );

          /* generate b in 1, 11, 111, ... until solution found */ 
          for( b=1; (a*b)%n!=0; b=10*b+1 );
          return a*b;
        }
    
    private static void deduceResult(long value){
        String deduce = String.valueOf(value);
        int a=0;
        int b=0;
        
        for(int i=0; i<deduce.length();i++){
            if(deduce.charAt(i)=='4')
                a++;
        else
            b++;
    }
        System.out.println(((2*a)+b));
    }
}