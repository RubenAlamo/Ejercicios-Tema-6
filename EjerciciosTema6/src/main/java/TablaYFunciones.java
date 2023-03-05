import java.util.Scanner;
public class TablaYFunciones {
    public static void main(String[] args) {
        int [][] tablaNueva = new int[10][10];
        crearTabla();
        mayorValor(tablaNueva);
    }
    public static void crearTabla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el limite minimo");
        int minimo = sc.nextInt();
        System.out.println("Introduce el limite maximo");
        int maximo = sc.nextInt();
        int[][] tabla = new int[10] [10];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int mayorValor(int[][] tablaNueva) {
        int mayor = tablaNueva[0][0];
        for (int i = 0; i < tablaNueva.length; i++) {
            for (int j = 0; j < tablaNueva[i].length; j++) {
                if (tablaNueva[i][j] > mayor) {
                    mayor = tablaNueva[i][j];
                }
            }
        }
        return mayor;
    }
}
