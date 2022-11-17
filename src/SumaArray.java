import java.util.Scanner;

public class SumaArray {
    public static void main(String[] args) {
        final int TAMANIO=5;
        int lista[]=new int[TAMANIO];
        int resultado=0;
        int valor;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<lista.length;i++){
            System.out.println("Introduce un número");
            valor=sc.nextInt();
            lista[i]=valor;
            resultado+=lista[i];
        }
        System.out.println("El resultado de la suma es "+resultado);
    }
}
