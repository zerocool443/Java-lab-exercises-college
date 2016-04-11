1: 


class Ship
{
    String name;
    String year;
    Ship()
   {
        name="TITANIC";
        year="1990";
    }
    public void display()
    {
        System.out.println("Name of the ship is : "+name);
        System.out.println("The ship was built in : "+year);
    }
};

class CruiseShip extends Ship
{
int max_pass;
CruiseShip()
        {
            max_pass=100;
        }
public void display()

    {

        System.out.println("Name of the ship is : "+name);

        System.out.println("Maximum passengers it can carry is : "+max_pass);

    }

};

class CargoShip extends Ship

 {
    int max_cap;
    CargoShip()
    {
        max_cap=2000;
    } 
    public void display()
    {
        System.out.println("Name of the ship is : "+name);
        System.out.println("Maximum capacity in tonnes is : "+max_cap);
    }
};
public class JavaApplication13 {
    public static void main(String[] args) {
        Ship obj1=new Ship();
        Ship obj2=new CruiseShip();
        Ship obj3=new CargoShip();

        obj1.display();
        obj2.display();
        obj3.display();
       }
}




2:





import java.util.Scanner;


class StringValue

{

    public void readString()

    {

     Scanner in=new Scanner(System.in);

     in.next();

    }

};

class IntegerValue

{

    public void readInteger()

    {

     Scanner in=new Scanner(System.in);

     in.nextInt();

    }

};

class DoubleValue

{

    public void readDouble()

    {

     Scanner in=new Scanner(System.in);

     in.nextDouble();

    }

};

public class JavaApplication14 {

  

    public static void main(String[] args) {

       

        StringValue obj=new StringValue();

        IntegerValue obj1=new IntegerValue();

        DoubleValue obj2=new DoubleValue();

        obj.readString();

        obj1.readInteger();

        obj2.readDouble();

    }

    
}