import java.io.* ;
import java.util.Scanner ;
import java.lang.Math;

        
        
public class quad 
{

    
    public static void main(String args[])
    {
int a , b, c;

Scanner scnr = new Scanner (System.in);
        
     a=scnr.nextInt();
     b=scnr.nextInt();
     c=scnr.nextInt();
     
     double d;
     d=(b*b)-4*(a*c);
     d=Math.sqrt(d);
     
     double r1,r2;
     
     r1= (int)((-b)+d)/2*a;
     r2= (int)((-b)-d)/2*a;
     
     System.out.println(r1 +" "+ r2);
     
     
     }
}
