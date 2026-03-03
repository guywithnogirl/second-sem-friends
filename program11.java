// User-defined exception class
class PayOutOfBoundException extends Exception {
  public PayOutOfBoundException(String message) {
    super(message);
  }
}

public class program11 {
  // Method to validate pay
  static void checkPay(int pay) throws PayOutOfBoundException {
    if (pay < 1000 || pay > 50000) {
      throw new PayOutOfBoundException("Pay Out of Bound: " + pay);
    } else {
      System.out.println("Valid Pay: " + pay);
    }
  }

  public static void main(String[] args) {
    try {
      checkPay(60000); // Invalid pay → exception thrown
    } catch (PayOutOfBoundException e) {
      System.out.println("Exception Caught: " + e.getMessage());
    }

    System.out.println("Program executed successfully.");
  }
}
