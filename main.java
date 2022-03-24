
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class main
{
    // instance variables - replace the example below with your own
    
    public static void main(String args[]){
        
        Scanner Myscanner = new Scanner(System.in);
        
        
        
        
        
        
        
    }
    
    private int x;

    /**
     * Constructor for objects of class main
     */
    public main()
    {
        // initialise instance variables
        
        Scanner Myscanner = new Scanner(System.in);
       
        final int  height= 171;
        
        int Height[] = new int[height];
        
        
        /*Height[0]= 155;
        Height[1]= 160;
        Height[2]= 165;
        Height[3]= 170;
        Height[4]= 175;*/
        
        
        //int lines = 5;
        
         
        
        
        
        for (int i = 165;i<height;i++ ) {
            
            System.out.print(i);
            System.out.println();
            System.out.println("What is you Height!");
            
            Height[i] = Integer. parseInt(Myscanner.nextLine());
             
                 
                 
                 
                
            //Height[i] = Integer. parseInt(Myscanner.nextLine());
            
            
         //   System.out.print("pls enter your height");
            
           // String answer = Myscanner .nextLine();
            
        
        
   
        }
    }
}

    

