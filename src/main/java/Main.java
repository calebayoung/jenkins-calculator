import java.util.Scanner;

class Main {

  public static void main (String[] args) {
    Calculator calc = new Calculator();
    // Read in input
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    // Parse input
    String[] inputArr = input.split(" ");
    // Perform action
    if (inputArr[0].equals("add")) {
      int result = calc.add(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2]));
      System.out.println(result);
    } else if (inputArr[0].equals("subtract")) {
      int result = calc.subtract(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2]));
      System.out.println(result);
    } else if (inputArr[0].equals("multiply")) {
      int result = calc.multiply(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2]));
      System.out.println(result);
    } else if (inputArr[0].equals("divide")) {
      int result = calc.divide(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2]));
      System.out.println(result);
    } else if (inputArr[0].equals("fibonacciNumberFinder")) {
      int result = calc.fibonacciNumberFinder(Integer.parseInt(inputArr[1]));
      System.out.println(result);
    } else if (inputArr[0].equals("intToBinaryNumber")) {
      String result = calc.intToBinaryNumber(Integer.parseInt(inputArr[1]));
      System.out.println(result);
    } else {
      System.out.println("Unrecognized action");
    }
  }
}