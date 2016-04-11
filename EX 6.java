1:


package  javaapplication15;

import java.util.Scanner;

abstract class BasicShape 
{
double area;

 abstract void calcArea();

}


class circle extends BasicShape 
{
long centrex , centrey ;
double radius;

circle(long a ,long b)
    {
    centrex =a;
    centrey =b;
     }
void getcentreX ()
{
 Scanner scn = new Scanner(System.in);  
    centrex = scn.nextLong();
}

void getcentreY ()
{
    Scanner scn = new Scanner(System.in);
 centrey = scn.nextLong();
        
}
void calcArea()
          
{
            area = 3.14*centrex*centrey;
            }

   }

class rectangle extends BasicShape 
    {
    
    long width , length ;

    rectangle(long a , long b)
    {
    length =a ;
    width =b;
    }
      void getwidth()
        {
           Scanner scn = new Scanner(System.in);
            width = scn.nextLong();
            
        }
void getlength()
    {
        Scanner scn = new Scanner(System.in);
       length = scn.nextLong();
  
    }
    
    void calcArea()
            { area = length*width;
            }

   
    

}

public class JavaApplication15
    {
public static void main(String args[])
        {
        BasicShape obj1= new circle(45,12);
        BasicShape obj2 = new rectangle(10,2); 
        
        obj1.calcArea();
        System.out.println(obj1.area);
        obj2.calcArea();
        System.out.println(obj1.area);
        
        }


}




2:


package javaapplication15;


interface TVstation
{
 String satelliteName=null;
 String cableTVName=null;
 double signalFrequency=0;
abstract void show();

}
class programme 
{
String programename ,sponser ;
programme()
       {
      programename = "";
    sponser = "";
   }

programme(String A , String B)
       {
      programename = A;
        sponser = B;
   }
void display()
        { System.out.println(programename + sponser);
        }
}

class broadcast extends programme implements TVstation 
{


public void show()
{
System.out.println(satelliteName+cableTVName+signalFrequency);
}
}
public class NewClass {
    
public static void main(String args[])
    {
    broadcast obj =  new broadcast();
    obj.show();
    obj.display();
    }

}
