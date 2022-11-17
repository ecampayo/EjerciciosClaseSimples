import java.util.Scanner;

public class ArrayFunciones {
    public static void main(String[] args) {
        final int TAMANIO=10;
        int num[]=new int [TAMANIO];
        rellenarArray(num);
        mostrarArray(num);
    }
    public static void rellenarArray(int lista[]){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<lista.length;i++){
            System.out.println("Introduce un número");
            String texto=sc.next();
            lista[i] = Integer.parseInt(texto);
        }
    }
    public static void mostrarArray(int lista[]){
        for(int i=0; i<lista.length; i++){
            System.out.println("El índice "+i+"contiene el valor "+lista[i] );
        }
    }

}
