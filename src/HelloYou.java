// Import library to use Scanner object
import java.util.Scanner;

// Class to get to know the user
public class HelloYou {

	// Create a class variable of a Scanner object to allow user input to console
	static Scanner scanner = new Scanner(System.in);
	// Static class varuiable to hold a String array for user info
	static String[] userVars;
	static String[] details;

	// Method to say farewell to user
	public static void exitApplication() {
		// Message to say farewell to the user
		System.out.println("\nThank you for using the SQA Greeting Application");
		// Exit the system
		System.exit(0);
}

// This is a method or function (Components that make up this method form a method signature)
    public static String[] requestUserInfo(String name, String... details) {
	    // Create an array of Strings type objects to hold values for user, size is based on supplied arguments
	    userVars = new String[details.length];
	    // Greet the user
	    System.out.println("I am excited to learn more about you " + name + "!");
	    // Perform a loop for the amount of iterations equal to the length of supplied items
	    for (int i = 0; i < details.length; i++) {
		// For each iteration ask the user for details
		    System.out.println("Can I get your " + details[i] + ", please? ");
		    // Capture user input in relative varaible within array
		    userVars[i] = scanner.nextLine();
	    }
	    // return the String array of supplied details
	    return details;	
    }

    public static void main(String[] args) {
	    // Declare local variables
	    String name;
	    // Output a welcome message to the user
	    System.out.println("Hello, and welcome to SQA Selenium Boot Camp");
        // Request the user's name
	    System.out.println("Could I please get your name? ");
	    // Set the captured name to a local String variable, name
	    name = scanner.nextLine();
	    //Call method to get user input and set it to a variable which holds an array of strings
	    details = requestUserInfo(name, "age","city of residence", "favorite color", "current mood");
	    // Output the information to the user
	    outputUserDetails(name);
	    // Call method which gives a farewell to the user and exits the system
	    exitApplication();
    } 

    public static void outputUserDetails(String name) {
	    // Begin outputting user gathered details such as their name
	    System.out.println("\nWell " + name + ", it seems I have learned enough about you.");
	    // Iterate through user details backwords, each iteration echos a detail
	    for (int i = userVars.length - 1; i > 0; i--) {
		    // Echo detail gathered of user info and requested details to console
		    System.out.println("Your " + details[i] + " is " + userVars[i] + ".");
	    }
    }
}