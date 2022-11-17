import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        final int TAMANIO=sc.nextInt();
        int lista []=new int[TAMANIO];
        int suma=0;
        for (int i=0;i<lista.length; i++){
            lista[i]=(int)Math.floor(Math.random()*10);
            System.out.println("El valor es= "+lista[i]);
            suma+=lista[i];
            System.out.println("la posición es= " +(i+1));
        }
        System.out.println("la suma es: "+ suma);
    }
}
