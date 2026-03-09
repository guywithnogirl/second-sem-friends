public class program1 {
  public static void main(String[] args) {
    // Check if user provided an argument
    if (args.length == 0) {
      System.out.println("Please provide a number as a command-line argument.");
      return;
    }

    // Convert string argument to integer
    int num = Integer.parseInt(args[0]);
    long fact = 1;

    // Calculate factorial
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }

    // Display result
    System.out.println("Factorial of " + num + " is: " + fact);
  }
}
