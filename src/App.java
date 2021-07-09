import java.io.*;

import extras.operaciones;

public class App {
    public static void main(String[] args) throws Exception {
        // Definición de Variables
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean control = false;
        operaciones op = new operaciones();
        String num1="", num2="";

        try {
            do {
                System.out.println("Que operación desea realizar? introduzca el operador o la palabra");
                System.out.println("suma(+), resta(-), multiplicación(*), division(/) o Salir('S')");
                System.out.print("\nAcción= ");
                String operador = br.readLine();

                switch (operador.toLowerCase()) {
                    case "suma":
                    case "+":
                        System.out.print("\nIntroduzca el primer valor =");
                        num1 = br.readLine();

                        System.out.print("\nIntroduzca el segundo valor =");
                        num2 = br.readLine();

                        op.suma(Double.parseDouble(num1), Double.parseDouble(num2));
                        break;
                    case "resta":
                    case "-":
                        System.out.print("\nIntroduzca el primer valor =");
                        num1 = br.readLine();

                        System.out.print("\nIntroduzca el segundo valor =");
                        num2 = br.readLine();

                        op.resta(Double.parseDouble(num1), Double.parseDouble(num2));
                        break;
                    case "multiplicación":
                    case "*":
                        System.out.print("\nIntroduzca el primer valor =");
                        num1 = br.readLine();

                        System.out.print("\nIntroduzca el segundo valor =");
                        num2 = br.readLine();

                        op.multiplicación(Double.parseDouble(num1), Double.parseDouble(num2));
                        break;
                    case "division":
                    case "/":
                        System.out.print("\nIntroduzca el primer valor =");
                        num1 = br.readLine();

                        System.out.print("\nIntroduzca el segundo valor =");
                        num2 = br.readLine();
                        
                        op.division(Double.parseDouble(num1), Double.parseDouble(num2));
                        break;
                    case "salir":
                    case "s":
                        control = true;
                        break;
                    default:
                        System.out.println("operador o acción invalidad");
                }
            } while (control == false);

        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }
}
