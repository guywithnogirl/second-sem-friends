// First interface
interface A {
  void messageA();
}

// Second interface
interface B {
  void messageB();
}

// Class implementing both interfaces (Multiple Inheritance)
class MultipleInheritanceExample implements A, B {
  @Override
  public void messageA() {
    System.out.println("Message from Interface A");
  }

  @Override
  public void messageB() {
    System.out.println("Message from Interface B");
  }
}

public class program9 {
  public static void main(String[] args) {
    MultipleInheritanceExample obj = new MultipleInheritanceExample();

    obj.messageA();
    obj.messageB();
  }
}
