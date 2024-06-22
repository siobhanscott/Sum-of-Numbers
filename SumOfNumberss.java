import java.util.Scanner;

/**
 *
 * @author Siobhan Scott
 */
public class SumOfNumberss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //Create a new Scanner class
        
        int n;          // declare variables
        int sum = 0;
        
        
        System.out.println("Enter a positive integer value");
        int integer = input.nextInt(); //input user to enter a positive integer value
        
        
        if(!(integer > 0)){
        System.out.print("Error. Enter a positive integer value ");
        }
        
        for (n = 1; n <= integer; n++ )
        { //variable n is equal to one. n is less than or equal to the users integer. The "++" operator increases variable n by 1.
        
           sum += n; // this can also be written as sum = sum + num which will add the previous value to the current one 
        }
        
        System.out.println("The sum of numbers 1 - " +integer+ " is: " + sum);  //This will print out the sum when the loop is finished.
    }
    
}

