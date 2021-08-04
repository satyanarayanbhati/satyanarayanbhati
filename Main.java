import java.util.Scanner;

 

public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
        Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number: ");  
       String reverse = ""; 
       String num = sc.nextLine(); 
       int length = num.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + num.charAt(i);  
      if (num.equals(reverse))  
         System.out.println("The entered input " +num +" is a palindrome.");  
      else  
         System.out.println("The entered input " +num +"  isn't a palindrome."); 
         

      }

 

            //function to printPattern

       public void printPattern() {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the number Star: "); 
     
        int rows = sc.nextInt();
     
        for (int i= rows-1; i>=0 ; i--)
        {
        for (int j=0; j<=i; j++)
        {
        System.out.print("*" + " ");
        }
        System.out.println();
        }
        
             

      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
            int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number to check Prime Number:");
	int num=scan.nextInt();
     for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");

        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}