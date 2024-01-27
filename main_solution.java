// Practicum 1 - (The Import Statement in Java) Solution

public class Main {
  
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.println("What is your name? ");
    String name = input.next();
    System.out.println("Hi " + name);
  }
}
