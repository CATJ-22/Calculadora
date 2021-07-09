import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    // objeto para escanear la clase
    Scanner input = new Scanner(System.in);

    // respuesta de operacion
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // respuesta de numeros ingresados
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // operacion suma
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // operacion resta
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // operacion multiplicacion
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // operacion division
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}