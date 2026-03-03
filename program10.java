public class program10 {
  public static void main(String[] args) {
    try {
      // Arithmetic Exception (Division by Zero)
      int a = 10, b = 0;
      int result = a / b;
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception Caught: " + e.getMessage());
    }

    try {
      // Array Index Out of Bound Exception
      int[] arr = { 1, 2, 3 };
      System.out.println(arr[5]); // Invalid index
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Out of Bounds Exception Caught: " + e.getMessage());
    }

    System.out.println("Program executed successfully.");
  }
}
