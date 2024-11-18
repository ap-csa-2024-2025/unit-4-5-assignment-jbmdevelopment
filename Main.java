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
    for(int i = 0; i < word.length(); i++) {
        String letter = word.substring(i, i + 1);
        for(int f = 0; f < N; f++) {
            System.out.print(letter);
        }
    }
    // code solution here
  }

  public static void printNums()
  {
    // code solution here
  }

  public static void uprightNumberTriangle(int N)
  {
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
