import java.util.Scanner;

public class Farenheit {
    public static void main (String [] args){
        double grados;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduce los grados centígrados");
        grados=sr.nextDouble();
        calcularGrados(grados);
    }
    public static void calcularGrados (double g){
        double resultado;
        resultado=(32 +(9*g/5));
        System.out.println("Tus grados Farenheit son: "+ resultado);

    }
}
