public class Objective7Lab4 {
  public static void main(String[] args) {
  int counter = 0;
  int stack = 0;

    while(counter <= 20) {
      stack = counter + stack;

      counter++;
    }
    System.out.println(stack);
  }
}
