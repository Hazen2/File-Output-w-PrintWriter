import java.util.Scanner; // Import the Scanner class.
import java.io.*;   // Import the PrintWriter class for file input.

/**
 * This simple program will write open a file, write data to it,
 * and close the file.
 */

public class fileWrite
{
  public static void main(String[] args) throws IOException
  {
 
    String filename; // User will enter a name for the file.
    String friend;   // User will enter a name for a friend.
    int friendsNum;  // How many friends the user has.
    Scanner keyboard = new Scanner(System.in);
    int counter;     // For loop counter variable
    
    // Prompt user for how many friends he has.
    System.out.println("How many friends do you have?");
    friendsNum = keyboard.nextInt();
    
    // Consume the remaining line.
    keyboard.nextLine();
    
    // Prompt for filename.
    System.out.println("What is the name of the file you would like to create?");    
    filename = keyboard.nextLine();
    
    // Create a PrintWriter object based on the user inputted filename
    // and OPEN the file.
    PrintWriter outputFile = new PrintWriter(filename);
    
    // Begin FOR loop and prompt the user for friend names.
    for (counter = 1; counter <= friendsNum; counter++)
    {
      // Consume the remaining line and ask the user what's the friend's name.
      // keyboard.nextLine();      
      System.out.println("Enter the name for friend number " + counter + ".");
      friend = keyboard.nextLine();
      
      // Print friend's name into the file.
      outputFile.println(friend);      
    }
    
    // Close the file.
    outputFile.close();
    
  }
}
