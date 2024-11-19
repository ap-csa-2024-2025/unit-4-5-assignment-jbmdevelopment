import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("code", 3);
    // Make sure to test your methods here
  }

  public static void printNTimes(String word, int N)
  {
    // #1
    for(int i = 0; i < word.length(); i++) {
        String letter = word.substring(i, i + 1);
        for(int f = 0; f < N; f++) {
            System.out.print(letter);
        }
    }
    // #2
    System.out.println("");
    printNums();
    System.out.println("");
    uprightNumberTriangle(5);
    uprightNumberTriangle(6);
    // code solution here
  }

  public static void printNums()
  {
        for(int start = 10; start > 0; start--) {
      
      for(int times = 0; times < start; times++) {
          System.out.print(" " + start); // add a space (use start instead of times).
      }
      System.out.println("");
    }
    // code solution here
  }

  public static void uprightNumberTriangle(int N)
  {
    for(int start = 1; start <= N; start++) {
        for(int t = 0; t < start; t++) {
            System.out.print(" " + (t + 1));
        }
        System.out.println("");
    }
    // DONT RUN THIS
   // for(int i = N; i > 0; N--) {
       // for(int b = 0; b < i; b++) {
        //    System.out.print(" " + b);
       // }
    //}
    // code solution here
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
