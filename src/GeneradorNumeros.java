public class GeneradorNumeros {
    public static void main(String[] args) {
        final int FILAS=4;
        final int COLUMNAS=5;
        int [][] numero=new int[FILAS] [COLUMNAS];
        System.out.println("Generación de 20 dígitos aleatorios y sumatorio");
        rellenarMatriz(numero, FILAS, COLUMNAS);
        mostrarMatrizySuma(numero,FILAS, COLUMNAS);

    }
    public static void rellenarMatriz(int [][] lista, int fil, int col){
        for (int i=0; i<fil;i++){
            for (int j=0; j<col; j++){
                lista[i][j]=(int)(Math.random()*100);
            }
        }
    }
    public static void mostrarMatrizySuma(int [][] lista, int fil, int col){
        int suma=0;
        for (int i=0; i<fil;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(lista[i][j]+"\t");
                suma+=lista[i][j];
            }
        }
        System.out.println(suma);
    }
}
