import java.util.Scanner;

public class DobleTriple {
    public static void main (String [] args){
        int num1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdueix un nombre");
        num1=sc.nextInt();
        System.out.println("El resultat del doble del número és: " +num1*2+ " y el triple és: "+ num1*3);
    }
}
