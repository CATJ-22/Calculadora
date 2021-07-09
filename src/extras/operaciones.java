package extras;

public class operaciones {

    public void suma(double num1, double num2){
        double result = num1+num2;
        System.out.println((int)num1+" + "+(int)num2+" = "+(int)result+"\n");
    }

    public void resta(double num1, double num2){
        double result = num1-num2;
        System.out.println((int)num1+" - "+(int)num2+" = "+(int)result+"\n");
    }

    public void multiplicación(double num1, double num2){
        double result = num1*num2;
        System.out.println(num1+" * "+num2+" = "+result+"\n");
    }

    public void division(double num1, double num2){
        double result = num1/num2;
        System.out.println(num1+" / "+num2+" = "+result+"\n");
        if (Double.toString(result) == "Infinity") {
            System.out.println("no existe numero divisible entre 0 mas que el mismo\n");
        }
    }

}