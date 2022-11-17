import java.util.Scanner;

public class Circunferncia {
    public static void main (String [] args){
        double radio;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia");
        radio=sc.nextDouble();
        calcularArea(radio);
        calcularLongitud(radio);
    }
    public static void calcularArea (double r){
        double area;
        area=Math.PI*Math.pow(r,2);
        System.out.println("El área de la circunferencia es: "+ area);
    }
    public static void calcularLongitud (double r){
        double longitud;
        longitud=2*Math.PI*r;
        System.out.println("La longitud de la circunferencia es: "+ longitud);
    }
}
