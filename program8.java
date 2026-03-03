import java.util.Vector;

public class program8 {
  public static void main(String[] args) {
    // Creating a Vector
    Vector<Integer> vec = new Vector<>();
    // Adding elements
    vec.add(10);
    vec.add(20);
    vec.add(30);
    vec.add(40);

    System.out.println("Vector Elements: " + vec);
    // Insert element at specific position
    vec.add(2, 25);
    System.out.println("After inserting 25 at index 2: " + vec);
    // Accessing elements
    System.out.println("Element at index 3: " + vec.get(3));

    // Updating elements
    vec.set(1, 50);
    System.out.println("After updating index 1 to 50: " + vec);

    // Removing an element
    vec.remove(3);
    System.out.println("After removing element at index 3: " + vec);

    // Vector size and capacity
    System.out.println("Size: " + vec.size());
    System.out.println("Capacity: " + vec.capacity());
    // Searching an element
    System.out.println("Does vector contain 30? " + vec.contains(30));
    // Iterating through the vector
    System.out.print("Elements using loop: ");
    for (int n : vec) {
      System.out.print(n + " ");
    }
  }
}
