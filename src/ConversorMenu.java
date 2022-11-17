import java.util.Scanner;

public class ConversorMenu {
    public static void main (String [] args){
        int menu;
        Scanner sc=new Scanner(System.in);
        double pesetas, euros;
        System.out.println("Si quieres convertir a euros pulsa 1 si quieres pesetas pulsa 2");
        menu=sc.nextInt();
        if (menu==1){
            System.out.println("Introduce las pesetas a convertir");
            pesetas=sc.nextDouble();
            euros=pesetas/166.386;
            System.out.println("El total de euros son: "+euros+"€");
        }
        else{
            System.out.println("Introduce los euros a convertir");
            euros=sc.nextDouble();
            pesetas=euros*166.386;
            System.out.println("El total de pesetas son: "+pesetas+"pts");
        }
    }
}
