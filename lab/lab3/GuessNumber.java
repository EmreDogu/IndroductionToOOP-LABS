import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) throws IOException {	
		Scanner reader = new Scanner(System.in); //Creates an object to read user input
		Random rand = new Random(); //Creates an object from Random class
		int number =rand.nextInt(100); //generates a number between 0 and 99
		
		
		System.out.println("Hi! I'm thinking of a number between 0 and 99.");
		System.out.print("Can you guess it: ");
		
		int guess = reader.nextInt(); //Read the user input
        
        boolean flag = true;
    
        int attempts = 0;
        
        do {
            System.out.print("Type -1 to quit or guess another: ");
            guess = reader.nextInt();
            if (guess == number)
                System.out.println("Congratulations! You win after " + attempts + " attempts!");
            else if (guess == -1)
                System.out.println("Sorry, the number was " + number);    
            else{
                attempts+=1; 
                System.out.println("Sorry!");
                if (guess > number)
                    System.out.println("Mine ise less than your guess.");
                else
                    System.out.println("Mine ise greater than your guess."); 
            } 
        }while (number != guess && guess != -1); 
		reader.close(); //Close the resource before exiting
	}
	
	
}
