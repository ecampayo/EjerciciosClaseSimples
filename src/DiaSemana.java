import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        int dia;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el dia de la semana");
        dia=sc.nextInt();
        switch (dia){
            case 1:
                System.out.println("El lunes es laboral");
                break;
            case 2:
                System.out.println("El martes es laboral");
                break;
            case 3:
                System.out.println("El miércoles es laboral");
                break;
            case 4:
                System.out.println("El jueves es laboral");
                break;
            case 5:
                System.out.println("El viernes es laboral");
                break;
            case 6:
                System.out.println("El sábado es festivo");
                break;
            case 7:
                System.out.println("El domingo es festivo");
                break;
            default:
                System.out.println("El valor introducido es incorrecto");
        }
    }
}
