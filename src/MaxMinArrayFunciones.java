import java.util.Scanner;

public class MaxMinArrayFunciones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numero=new int[10];
        int minimo=Integer.MAX_VALUE;
        int maximo=Integer.MIN_VALUE;
        int posicionMax=0;
        int posicionMin=0;
        int[] numero1=new int[10];
        int minimo1=Integer.MAX_VALUE;
        int maximo1=Integer.MIN_VALUE;
        int posicionMax1=0;
        int posicionMin1=0;
        rellenarycomparar(numero, posicionMin, posicionMax, minimo, maximo);
        rellenarycomparar(numero1, posicionMin1, posicionMax1, minimo1, maximo1);
    }
    public static void rellenarycomparar(int lista[], int posMin, int posMax, int min, int max ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce los 10 numeros");
        for (int i=0;i<lista.length;i++){
            lista[i]=sc.nextInt();
            if(lista[i]<=min){
                min=lista[i];
                posMin=i+1;//Si es para usuario ya que la posición 0 no suele razonable. Iría del 1 al 10

            }
            if (lista[i]>=max){
                max=lista[i];
                posMax=i+1;
            }
        }
    }
}
