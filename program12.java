class TableThread extends Thread {
  int num;

  TableThread(int num) {
    this.num = num;
  }

  @Override
  public void run() {
    System.out.println("Multiplication Table of " + num + ":");
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + (num * i));
      try {
        Thread.sleep(300); // Slow down for visibility
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
    System.out.println("End of Table " + num + "\n");
  }
}

public class program12 {
  public static void main(String[] args) {
    TableThread t1 = new TableThread(5); // Table of 5
    TableThread t2 = new TableThread(7); // Table of 7
    TableThread t3 = new TableThread(9); // Table of 9

    // Assigning different priorities
    t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
    t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
    t3.setPriority(Thread.MAX_PRIORITY); // Priority 10
    // Starting the threads
    t1.start();
    t2.start();
    t3.start();
  }
}
