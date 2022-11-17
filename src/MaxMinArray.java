import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numero=new int[10];
        int minimo=Integer.MAX_VALUE;
        int maximo=Integer.MIN_VALUE;
        int posicionMax=0;
        int posicionMin=0;
        System.out.println("Introduce los 10 numeros");
        for (int i=0;i<numero.length;i++){
            numero[i]=sc.nextInt();
            if(numero[i]<=minimo){
                minimo=numero[i];
                posicionMin=i+1;//Si es para usuario ya que la posición 0 no suele razonable. Iría del 1 al 10

            }
            if (numero[i]>=maximo){
                maximo=numero[i];
                posicionMax=i+1;
            }
        }
    }
}
