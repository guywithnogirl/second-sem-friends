import java.util.Arrays;
import java.util.Collections;
class DescendingSort {
  public static void main(String[] args) {
    // Sample array
    Integer[] arr = {10, 5, 20, 7, 3, 15};

    // Sorting in descending order
    Arrays.sort(arr, Collections.reverseOrder());

    // Displaying the result
    System.out.println("Array in Descending Order:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
