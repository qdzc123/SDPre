import java.lang.Math;

public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third;
      first = 1 + (int)(Math.random() * 6);
      second = 1 + (int)(Math.random() * 6);
      third = 1 + (int)(Math.random() * 6);

      int total = first + second + third;

      System.out.println(first  + " + " + second + " + " + third + " = " + total);
  }
}
