/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp1;
import java.util.Scanner;
/**
 *
 * @author RA1411008010276
 */


public class exp1_2 

{

    
    static void  get(int[] arr)
    {
    System.out.println("How many elements you want");
    Scanner scnr = new Scanner(System.in);
            int n;
            n=scnr.nextInt();
            for(int i=0;i<n;i++)
            arr[i]=scnr.nextInt();     
            
    }
    static void print(int[] arr)
    {
    for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    
    static void search(int[] arr,int variable)
    {
    for(int i=0;i<arr.length;i++)
        if(arr[i]==variable)
            System.out.println("FOUND AT"+(i+1)+"location");
    }
    
    static void sort(int[] arr)
    {
        int temp;
    for(int i=0;i<arr.length;i++)
        { for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                    {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }   
            }
    
        }
    }
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int[] A=new int[100] ;
    
    int choice;
    System.out.println("ENTER 1 TO enter elements \n ENTER 2 TO display elements \n ENTER 3 TO search element \n ENTER 4 TO sort elements \n ENTER 5 TO exit ");
        choice=scnr.nextInt();
        while((choice>0) &&(choice<5))
        
        {
        switch(choice)
        {
            case 1: get(A);
                break;
            case 2: print(A);
                break;
            case 3: 
            {int temp;
            System.out.println("Enter element to search");
            temp=scnr.nextInt();
            search(A,temp);
            }
            break;
            case 4: sort(A);
        } 
    
    System.out.println("ENTER 1 TO enter elements \n ENTER 2 TO display elements \n ENTER 3 TO search element \n ENTER 4 TO sort elements \n ENTER 5 TO exit ");
    choice=scnr.nextInt();
        }
    
    }
}


