import java.io.IOException;

public class ComparadorMinusculas {
    public static void main(String[] args) throws IOException {
        char car1, car2;
        System.out.println("Introduce un caracter");
        car1=(char)System.in.read();
        System.in.read();
        System.out.println("Introduce el segundo caracter");
        car2=(char)System.in.read();
        if (Character.isLowerCase(car1) && Character.isLowerCase(car2)){
            System.out.println("Los dos caracteres son minuscula");

            } else{
        System.out.println("Los dos caracteres no son minuscula");}
    }
}
