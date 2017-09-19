// Importing the Scanner class used for taking input from user
import java.util.Scanner;
public class HighestNumber {

	//main method of class Highest Number
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int intNum1, intNum2, intNum3; //Declare the variables of type integer
		 
		 //Print the message for user to enter the numbers
	     System.out.println("Enter three integers ");
	     
	     //initiate the scanner object to read the input from user
	     Scanner scanInput = new Scanner(System.in);
	 
	     intNum1 = scanInput.nextInt(); // Take the input from user of type integer for x
	     intNum2 = scanInput.nextInt(); // Take the input from user of type integer for y
	     intNum3 = scanInput.nextInt(); // Take the input from user of type integer for z
	 
	    //check if x greater than y and z then print x
	     if ( intNum1 >= intNum2 && intNum1 >= intNum3 )
	         System.out.println("Largest Number is :" + intNum1);
      	//check if x greater than x and z then print y
	      else if ( intNum2 >= intNum1 && intNum2 >= intNum3 )
	    	  System.out.println("Largest Number is :" + intNum2);
	     
	   //check if x greater than x and Y then print z
	      else if ( intNum3 >= intNum1 && intNum3 >= intNum2 )
	    	  System.out.println("Largest Number is :" + intNum3);

	     scanInput.close();
	}

}
