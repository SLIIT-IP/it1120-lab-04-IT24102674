import java.util.Scanner;

      public class IT24102674Lab4Q2 {
 
        public static void main(String[]args)

         {
            //Create an object called input to scanner class
              Scanner input = new Scanner(System.in);
 
            //Declare variables
             int exammarks;
             int submissionmarks;
             int exampercentage;
             int submissionpercentage;
             double finalmarks;

           //Take user inputs
             System.out.println("Please enter exam marks");
             exammarks = input.nextInt();

             System.out.println("Please enter lab submission marks");
             submissionmarks = input.nextInt();

             System.out.println("Please enter the percentage given for the exam");
              exampercentage = input.nextInt();

              System.out.println("Please enter the percentage given for the lab submission");
              submissionpercentage = input.nextInt();

               //calculations
                 finalmarks = (exammarks + submissionmarks) / 2;

                 System.out.println("Final exam marks is" + finalmarks);
         
               
              if(exammarks > 100)
               {
                 System.out.print("Invalid input for exam marks. Terminating program");
                }
              else
                  { 
                      System.out.println("The percentages must add up to 100. Terminating program");
                 }
         } 
}
            



         }
}
             