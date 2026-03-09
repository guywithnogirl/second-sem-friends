public class program4 {
  // Method to add two integers
  int add(int a, int b) {
    return a + b;
  }

  // Method to add three integers
  int add(int a, int b, int c) {
    return a + b + c;
  }
  // Method to add two double values
  double add(double a, double b) {
    return a + b;
  }

  public static void main(String[] args) {
    program4 obj = new program4();

    System.out.println("Addition of two integers: " + obj.add(10, 20));
    System.out.println("Addition of three integers: " + obj.add(5, 10, 15));
    System.out.println("Addition of two doubles: " + obj.add(4.5, 3.2));
  }
}
