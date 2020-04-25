package Chapter5.examples;
// Fig. 5.2: ForCounter.java
// Counter-controlled repetition with the for repetition statement.
//
// Java How to Program, 10th Ed. (Deitel) Page 154

public class ForCounter {

   public static void main(String[] args) {
      for (int counter = 1; counter <= 10; counter++)
         System.out.printf("%d  ", counter);

      System.out.println();
   }
}

/* Code execution

1  2  3  4  5  6  7  8  9  10

*/
