// Abstract class
abstract class Shape {
  // Abstract method (no body)
  abstract void draw();

  // Non-abstract method
  void display() {
    System.out.println("This is a shape.");
  }
}

// Subclass implementing the abstract method
class Circle extends Shape {
  @Override
  void draw() {
    System.out.println("Drawing a Circle");
  }
}

public class program6 {
  public static void main(String[] args) {
    Shape obj = new Circle(); // Upcasting
    obj.display(); // Calls concrete method
    obj.draw(); // Calls implemented abstract method
  }
}
