1:

package javaapplication1;

import java.util.Scanner;
import java.lang.Exception;
import java.lang.Throwable;
public class JavaApplication1
{
static void  check() throws ArithmeticException
            {
            throw new ArithmeticException("TESTING EXPRESSION");
            }
public static void main(String args[])
    {
    
        try
        {
        int a=1;
        int b=0;
        int c=a/b;
               
        }
        catch(Exception e)
            {
            System.out.println(e);
            }
        try
            {
            Scanner scn = new Scanner(System.in);
            
                int age;
                System.out.println("Enter your age (>40)");
                age = scn.nextInt();
                if(age < 40)
                throw new Exception("not valid");
            }catch(Exception e)
            {
            System.out.print(e);
            }
     
    try
    {
    check();
    }catch(ArithmeticException e)
        {
    System.out.println(e);
    }
        
	finally{

		System.out.println("This is a final block");
	}
}

}







2:


package JavaApplication1;

import java.util.Scanner;
import java.lang.Exception;
import java.lang.Throwable;

public class JavaApplication1
{

    static void check()  throws ArithmeticException
    {
    Scanner scn = new Scanner(System.in);
        int internalMarks ,externalMarks;
        System.out.println("Enter your internal marks");
        internalMarks = scn.nextInt();
        System.out.println("Enter your external marks");
        externalMarks = scn.nextInt();
        
        if(internalMarks>30)
            throw new ArithmeticException("internal marks wrong"); 
    
        if(externalMarks>30)
            throw new ArithmeticException("external marks wrong");
    }
    
    public static void main(String args[])
        {
        try {
        
            check();
       
        }catch(ArithmeticException e)
            {
            System.out.println(e);
            }
        }
    
}