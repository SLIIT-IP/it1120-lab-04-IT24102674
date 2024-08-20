import java.util.Scanner;
      
     public class IT24102674Lab4Q1 {
 
         public static void main(String[]args)
           {
              //Create an object called input to scanner class
               Scanner input = new Scanner(System.in);

             //Declare variables
              int number;

            //Take user inputs
              System.out.println("Enter a number : ");
number = input.nextInt();

             //Check
               if(number > 0)
               {
                 System.out.print("The number is : positive");
                }
                else if(number < 0)
                {
                  System.out.print("The number is : negative");
                 }
                 else
                 {
                   System.out.print("The number is : zero");
                 }
         }
  }
                  