import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double operando1, operando2, resultado=0;
        System.out.println("Escribe el primer operando");
        operando1=sc.nextDouble();
        System.out.println("Escribe el operador");
       String operacion=sc.next();
        System.out.println("Escribe el segundo operando");
        operando2=sc.nextDouble();
        switch (operacion){
            case "+":
                resultado=operando1+operando2;
                break;
            case "-":
                resultado=operando1-operando2;
                break;
            case "*":
                resultado=operando1*operando2;
                break;
            case "/":
                resultado=operando1/operando2;
                break;
            case "%":
                resultado=operando1%operando2;
                break;
            case "^":
                resultado=(int)Math.pow(operando1,operando2);
                break;
            default:
                System.out.println("Error: no ha introducido un valor correcto");
        }
        System.out.println(operando1+" "+operacion+" "+operando2+" = "+resultado);
    }
}
