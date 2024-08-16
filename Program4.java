import java.util.Scanner;

//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
public class Program4 {
    public static void main(String [] args) {
    Scanner myScanner = new Scanner(System.in);
    
    double number1 = 0.0;
    double number2 = 0.0;
    double number3 = 0.0;
    double number4 = 0.0;
    double sum = 0;
    double average = 0.00;
    
    
    
    System.out.println("Please enter the the first number: ");
    number1 = myScanner.nextInt();
    
    System.out.println("Please enter the the second number: ");
    number2 = myScanner.nextInt();
    
    System.out.println("Please enter the the third number: ");
    number3 = myScanner.nextInt();
    
    System.out.println("Please enter the the forth number: ");
    number4 = myScanner.nextInt();
    
    sum = number1 + number2 + number3 + number4;
    average = sum/4;
    
    System.out.println();
    System.out.println("The sum in: " + sum);
    System.out.println();
    System.out.println("The average of the four numbers is " + average);
    
    
    }
}


//Paste console output below:
/*
Please enter the the first number: 
475
Please enter the the second number: 
821
Please enter the the third number: 
369
Please enter the the forth number: 
562

The sum in: 2227.0

The average of the four numbers is 556.75
*/
