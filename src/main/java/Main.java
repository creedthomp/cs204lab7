import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    System.out.println("Welcome to the Calculator! Enter commands:");

    while (true) {  // Keep looping until the user types "exit"
      System.out.print("> ");
      String input = scanner.nextLine();
      String[] tokens = input.split(" ");

      if (tokens.length < 2) {
        System.out.println("Invalid command. Please enter a valid operation.");
        continue;
      }

      String command = tokens[0];

      try {
        switch (command) {
          case "add":
            if (tokens.length == 3) {
              int a = Integer.parseInt(tokens[1]);
              int b = Integer.parseInt(tokens[2]);
              System.out.println(calculator.add(a, b));
            } else {
              System.out.println("Usage: add <num1> <num2>");
            }
            break;

          case "subtract":
            if (tokens.length == 3) {
              int a = Integer.parseInt(tokens[1]);
              int b = Integer.parseInt(tokens[2]);
              System.out.println(calculator.subtract(a, b));
            } else {
              System.out.println("Usage: subtract <num1> <num2>");
            }
            break;

          case "multiply":
            if (tokens.length == 3) {
              int a = Integer.parseInt(tokens[1]);
              int b = Integer.parseInt(tokens[2]);
              System.out.println(calculator.multiply(a, b));
            } else {
              System.out.println("Usage: multiply <num1> <num2>");
            }
            break;

          case "divide":
            if (tokens.length == 3) {
              int a = Integer.parseInt(tokens[1]);
              int b = Integer.parseInt(tokens[2]);
              if (b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
              } else {
                System.out.println(calculator.divide(a, b));
              }
            } else {
              System.out.println("Usage: divide <num1> <num2>");
            }
            break;

          case "fibonacci":
            if (tokens.length == 2) {
              int n = Integer.parseInt(tokens[1]);
              System.out.println(calculator.fibonacciNumberFinder(n));
            } else {
              System.out.println("Usage: fibonacci <num>");
            }
            break;

          case "binary":
            if (tokens.length == 2) {
              int number = Integer.parseInt(tokens[1]);
              System.out.println(calculator.intToBinaryNumber(number));
            } else {
              System.out.println("Usage: binary <num>");
            }
            break;

          case "exit":
            System.out.println("Exiting...");
            scanner.close();
            return;

          default:
            System.out.println("Unknown command. Try: add, subtract, multiply, divide, fibonacci, binary, exit.");
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid number format. Please enter valid integers.");
      }
    }

    // scanner.close(); // We should not close it until after the loop ends.
  }
}



//import java.util.Scanner;
//
//public class Main {
//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    Calculator calculator = new Calculator();
//
//    System.out.println("Welcome to the Calculator! Enter commands:");
//
//    while (scanner.hasNextLine()) {
//      String input = scanner.nextLine();
//      String[] tokens = input.split(" ");
//
//      if (tokens.length < 2) {
//        System.out.println("Invalid command. Please enter a valid operation.");
//        continue;
//      }
//
//      String command = tokens[0];
//
//      try {
//        switch (command) {
//          case "add":
//            if (tokens.length == 3) {
//              int a = Integer.parseInt(tokens[1]);
//              int b = Integer.parseInt(tokens[2]);
//              System.out.println(calculator.add(a, b));
//            } else {
//              System.out.println("Usage: add <num1> <num2>");
//            }
//            break;
//
//          case "subtract":
//            if (tokens.length == 3) {
//              int a = Integer.parseInt(tokens[1]);
//              int b = Integer.parseInt(tokens[2]);
//              System.out.println(calculator.subtract(a, b));
//            } else {
//              System.out.println("Usage: subtract <num1> <num2>");
//            }
//            break;
//
//          case "multiply":
//            if (tokens.length == 3) {
//              int a = Integer.parseInt(tokens[1]);
//              int b = Integer.parseInt(tokens[2]);
//              System.out.println(calculator.multiply(a, b));
//            } else {
//              System.out.println("Usage: multiply <num1> <num2>");
//            }
//            break;
//
//          case "divide":
//            if (tokens.length == 3) {
//              int a = Integer.parseInt(tokens[1]);
//              int b = Integer.parseInt(tokens[2]);
//              if (b == 0) {
//                System.out.println("Error: Division by zero is not allowed.");
//              } else {
//                System.out.println(calculator.divide(a, b));
//              }
//            } else {
//              System.out.println("Usage: divide <num1> <num2>");
//            }
//            break;
//
//          case "fibonacci":
//            if (tokens.length == 2) {
//              int n = Integer.parseInt(tokens[1]);
//              System.out.println(calculator.fibonacciNumberFinder(n));
//            } else {
//              System.out.println("Usage: fibonacci <num>");
//            }
//            break;
//
//          case "binary":
//            if (tokens.length == 2) {
//              int number = Integer.parseInt(tokens[1]);
//              System.out.println(calculator.intToBinaryNumber(number));
//            } else {
//              System.out.println("Usage: binary <num>");
//            }
//            break;
//
//          case "exit":
//            System.out.println("Exiting...");
//            scanner.close();
//            return;
//
//          default:
//            System.out.println("Unknown command. Try: add, subtract, multiply, divide, fibonacci, binary, exit.");
//        }
//      } catch (NumberFormatException e) {
//        System.out.println("Invalid number format. Please enter valid integers.");
//      }
//    }
//
//    scanner.close();
//  }
//}
