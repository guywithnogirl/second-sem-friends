// Parent class
class Animal {
  void sound() {
    System.out.println("Animal makes a sound");
  }
}

// Child class overriding the sound() method
class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("Dog barks");
  }
}

public class program5 {
  public static void main(String[] args) {
    Animal myAnimal = new Animal(); // Parent object
    Animal myDog = new Dog(); // Child object referenced by parent type

    myAnimal.sound(); // Calls parent class method
    myDog.sound(); // Calls overridden method in Dog class
  }
}
