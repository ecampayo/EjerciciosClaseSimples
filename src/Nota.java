import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        int nota;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un valor entero del 0 al 10");
        nota=sc.nextInt();
        switch (nota){
            case 0,1,2,3,4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Introduce un valor válido del 0 al 10");

        }
    }
}
