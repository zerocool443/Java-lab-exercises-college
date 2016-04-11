package JavaApplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.LineNumberReader;
import java.io.BufferedReader;


public class JavaApplication1 
    {

    public static void main(String args[]) throws FileNotFoundException, IOException 
                {
             File yo = new File("C:\\Users\\Akash\\Desktop\\a.data");
         int lines =0;
         int chars=0;
         
   
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Akash\\Desktop\\a.data")))
        {
            
            while (reader.readLine() != null) lines++;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Akash\\Desktop\\a.data"))) 
        {
            
            while (reader.read() != -1) chars++;
        }
        System.out.println("Lines "+lines);
                
        System.out.println("Characters "+chars);
        String text;
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Akash\\Desktop\\a.data"))) 
        {
            text=reader.readLine();
            int counter =1 ;
            while (lines!=0)
            {    
                System.out.println( (counter++)+ ": "+text);
                text=reader.readLine();
            lines--;
            }
            
        
        
                }

                }
}


