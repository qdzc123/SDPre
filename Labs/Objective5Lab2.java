public class Objective5Lab2 {
  public static void main(String[] args) {
    String string1 = "Banana";
    String string2 = "Bacon";
    String string3 = "Banana";

    if(string1.equals(string2)) {
      System.out.println(string1 + " is equivalent to " + string2);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string2);
    }

    if(string1.equals(string1)) {
      System.out.println(string1 + " is equivalent to " + string1);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string1);
    }

  }
}
