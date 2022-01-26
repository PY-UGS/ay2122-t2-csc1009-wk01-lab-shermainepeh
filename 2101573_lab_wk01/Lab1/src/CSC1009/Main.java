package CSC1009;

import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args)
    {
        /* Example 1 */
        System.out.println("Hello, I am Shermaine!");

        /* Example 3 */
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Module Code: ");

        String moduleCode = userInput.nextLine();  // Read user input
        switch(moduleCode)
        {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structure and Algorithm");
                break;
            case "CSC1009":
                System.out.println("Object Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            default:
                System.out.println("Unknown Module");
                break;
        }

        /* Example 4 */
        System.out.println("Value of x : ");
        for(int x = 102; x > 65; x--)
        {
            if(x % 2 == 1)
            {
                System.out.print(x + "\t");
            }
        }
    }
}