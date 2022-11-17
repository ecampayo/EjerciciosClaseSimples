import java.util.Scanner;

public class MetreSegon {
    public static void main (String [] args){
        double velocidad;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la velocidad en km/h");
        velocidad=sc.nextDouble();
        calcularVelocidad(velocidad);
    }
    public static void calcularVelocidad (double v){
        double resultado;
        resultado=v*1000/3600;
        System.out.println("La velocidad introducida en m/s es: "+resultado+ " m/s");
    }
}
