import java.io.IOException;

public class ComparadorCaracter {
    public static void main(String[] args) throws IOException {
        char car1, car2;
        System.out.println("Introduce una letra");
        car1=(char)System.in.read();
        System.in.read();
        System.out.println("Introduce otra letra");
        car2=(char)System.in.read();
        if (car1==car2){
            System.out.println("Los caracteres son iguales");
        }
        else{
            System.out.println("Los caracteres son distintos");
        }
    }
}
