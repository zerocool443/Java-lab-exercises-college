1:

public static void main(String args[])
{
Scanner scn = new Scanner(System.in);
String str;
System.out.println("Enter your string");
str = scn.next();
StringBuffer str2 = new StringBuffer(str);
int l = str.length();
str2.append('|');
for(int i =0; i< str.length();i++)
    {
        str2.append(str2.charAt(l--));
    }
 System.out.print(str2 );
 }


2:  

package javaapplication1;
import java.util.Scanner;
import java.lang.StringBuffer;
public class JavaApplication1 {

    public static void main(String[] args) {
    String str;
    char ch;
    Scanner scn = new Scanner(System.in);
    str = scn.next();
    StringBuffer str2 = new StringBuffer(str);
    str.toUpperCase();
    StringBuffer str3 = new StringBuffer("");
    for(int i=0;i<str.length();i++)
               {
                    if(str2.charAt(i)!='A'&&str2.charAt(i)!='E'&&str2.charAt(i)!='I'&&str2.charAt(i)!='O'&&str2.charAt(i)!='U')
                    { ch=str2.charAt(i);
                      ch +=1;
                      str3.append(ch);
                    }
                     else
                     str3.append(str2.charAt(i));
                
                 }
    
    System.out.println(str3.toString());
    }
}


3:


package javaapplication1;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.Arrays;
public class JavaApplication1 {

        static String[] funfun(String S1, String S2)
        {
        String result[] = new String[100];
        StringBuffer  str1 = new StringBuffer(S1) , str2 =new StringBuffer(S2);
        for(int i=0;i<str1.length();i+=2)
        {
        str1.insert(i,str2);
        i=str2.length()-1;
        }
        result[0]=str2.toString();
        StringBuffer str3 = new StringBuffer(S1) , str4 =new StringBuffer(S2);
        int lastIndex = 0;
        int count = 0;
        while ((lastIndex = S1.indexOf(S2, lastIndex)) != -1)
     {
        lastIndex++;
        count++;
     }
        if(count>1)
        {
        str3.insert(lastIndex,str4.reverse());
        str2.delete(lastIndex + str4.length()+1, lastIndex + 2*str4.length());
        result[1]=str3.toString();
        }
        else
        result[1]=S1+S2;
        StringBuffer str5 = new StringBuffer(S1) , str6 =new StringBuffer(S2); 
        lastIndex = 0;
        count = 0;
        while ((lastIndex = S1.lastIndexOf(S2, lastIndex)) != -1)
     {
        lastIndex++;
        count++;
     } 
        if(count>1)
        {
        str2.delete(lastIndex + str4.length()+1, lastIndex + 2*str4.length());
        result[2]=str3.toString();
        }
        else
        result[2]=S1;
        
        String temp1=null , temp2=null ;
        
        if(S2.length()%2>0)
           temp1= S2.substring(0,((S2.length()+1)/2));
         else
           temp2= S2.substring(((S2.length()+1)/2),S2.length());
       
       StringBuffer str7 = new StringBuffer(S1);
       str7.insert(0,temp1);
       str7.insert(str7.length(),temp2);
       result[2]=str7.toString();
       
       StringBuffer str8 = new StringBuffer(S1);
       int flag=0;
       char j;
       for(int g=0;g<str8.length();g++)
       {
       j=str8.charAt(g);
       for(int g1=0;g1<S2.length();g1++)
                    {
                    if(S2.charAt(g1)==j)
                        flag=1;
                    }
       if(flag==1)
        str8.replace(g,g,"*");
       }
       result[4]=str8.toString();
       return(result);
       }
    
    public static void main(String[] args) {
    
    Scanner scn3 = new Scanner(System.in);
    String A , B;
    System.out.print("Enter String S1 and S2");
    A=scn3.next();
    B=scn3.next();
    
    String []output = new String[200];
    output= funfun(A,B);
     System.out.println(Arrays.toString(output));
    }
    
   
}







4:


package javaapplication1;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.Arrays;
public class JavaApplication1 {

    static boolean validateusername(String S)
    {
      
    if((S.length()>=11)&&(S.substring(S.length()-3,S.length())=="_job"))
      return(true);  
   else
        return(false);
    }
    public static void main(String[] args) {
    
    String username;
    Scanner scn = new Scanner(System.in);
    username = scn.next();
    if(validateusername(username))
        System.out.print("INPUT VALIDATED ");
    else
        System.out.print("INPUT INVALID");
    
    }
    
   
}






5:

package javaapplication1;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.Arrays;
public class JavaApplication1 {
   
   public static void main(String[] args) {
   Scanner scn = new Scanner(System.in); 
   String number ;
   number = scn.next();
   StringBuffer  str =  new StringBuffer(number);
   StringBuffer  str2 =  new StringBuffer("");
   
   for(int i=0;i<str.length()-1;i++)
   {
   str2.append(str.charAt(i+1)-str.charAt(i));
   }
    System.out.print(str2);
    }






6:


package javaapplication1;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.Arrays;
public class JavaApplication1 {
  void  static changestring(String S,char c)
       {
       switch(c)
               {
                   case 'A':
                   {
                   S=S+S;
                   }
                   case 'B':
                   {
                   StringBuffer buff = new StringBuffer(S);
                       for(int i=0;i<S.length();i+=2)
                       {
                       buff.replace(i,i,"*");
                       }
                   S=buff.toString();
                   }
                   case 'C':
                   {
                   StringBuffer buff2 = new StringBuffer(S);
                   char ch;
                   String ans="";
                   for(int a=0;a<buff2.length();a++)
                        {
                        ch=buff2.charAt(a);
                        if(ch!=' ')
                        { ans = ans + ch;
                        buff2= buff2.replace(ch,' '); 
                        }
                   S=ans;
                   }
                   case 'D':
                   {
                   S=S.toUpperCase();
                   }
                   break;
                 }
       }
       public static void main(String[] args) {
  
  Scanner scn = new Scanner(System.in);
  String str;
  str= scn.next();
  char choice;
  System.out.println("A: Add the String to itself\n" +
        "B: Replace alternate positions with *\n" +
        "C: Remove duplicate characters in the String\n" +
        "D: Change alternate characters to upper case");
   choice=scn.next().charAt(0);
          switch(choice)
                  {
                  case 'A':
                   changestring(str,'A');
                   break;
                   
                   case 'B':
                   changestring(str,'B');
                   break;
                   
                   case 'C':
                   changestring(str,'C');
                   break;
                   case 'D':
                   changestring(str,'C');
                   break;
                   
                  }
          System.out.print(str);
          }
   
    
   
}





7:


import java.util.Scanner;
import java.io.*;

class Application1
{

public static void main(String args[])
    {
    String input;
    Scanner scn = new Scanner(System.in);
    input =scn.next();
    StringBuffer buff = new StringBuffer(input);
    int flag=0;
    
    for(int i=0;i<buff.length()-1;i++)
        {
        if(buff.charAt(i)>buff.charAt(i+1))
        flag=1;
        }
    if(flag==0)
       System.out.print("YES");
    else
        System.out.print("NO");
        }

}



8:

import java.util.Scanner;
public class JavaApplication2 {

     static boolean  ValidateCode(String s)       {
            int u=0;
            int l=0;
            int k=0;
            if(s.length()!=6)
                return false;
            if(!s.startsWith("cod"))
                return false;
            if((Character.isLowerCase(s.charAt(0))))
                return false;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(!Character.isUpperCase(ch))
                    l++;
                if(!Character.isLowerCase(ch))
                    u++;
                if(!Character.isAlphabetic(ch)&&!Character.isDigit(ch))
                    return false;
            }
                for(int i=0;i<s.length();i++)
                {
                    if(Character.isDigit(s.charAt(i)))
                        k++;
                }
                if(k==0)
                    return false;
                if(u<l)
                    return false;
            return true;    
            }
            
      
     
     
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
          System.out.println("Enter string");
       String input=in.next();
       
       System.out.println(ValidateCode(input));

    
}   
}