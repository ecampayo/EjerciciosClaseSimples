import java.util.Scanner;

public class Areas {
    public static void main (String [] args){
       double base, altura, resultado;
       int menu;
       Scanner sc=new Scanner(System.in);
        System.out.println("1. Si quieres el área del cuadrado\n2. Si quieres el área del triángulo\n3. Si quieres el área del pentágono");
        menu=sc.nextInt();
        if (menu==1){
            System.out.println("Introduce un lado");
            base=sc.nextDouble();
            resultado=base*base;
            System.out.println("El área del cuadrado es: "+ resultado);
        } else if (menu == 2) {
            System.out.println("Introduce la base");
            base=sc.nextDouble();
            System.out.println("Introduce la altura");
            altura=sc.nextDouble();
            resultado=base*altura/2;
            System.out.println("El área del triangulo es: "+ resultado);
        }
        else{
            System.out.println("Introduce la base");
            base=sc.nextDouble();
            System.out.println("Introduce el apotema");
            altura=sc.nextDouble();
            resultado=(5*base*altura)/2;
            System.out.println("El área del pentágono es: "+ resultado);
        }
    }
}
