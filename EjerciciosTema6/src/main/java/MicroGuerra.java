import java.util.Scanner;

public class MicroGuerra {
    public static void main(String[] args) {
        int[][] tablero = new int[4][4];
        inicializarTablero(tablero);
        mostrarTablero(tablero);
        disparar(tablero);

    }
    public static void inicializarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }
    public static void mostrarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void introducirEnteroEntreLimites(){
        int entero = 0;
        if (entero < 0 || entero > 4) {
            System.out.println("numero en los limites");
        }

    }
    //funcion que le permite al usuario disparar eligiendo sus coordenadas de disparo
    public static void disparar(int[][] tablero) {
        int posicionBarcoX = (int) (Math.random() * 4);
        int posicionBarcoY = (int) (Math.random() * 4);
        boolean continuarJugando = true;
        Scanner teclado = new Scanner(System.in);
        while (continuarJugando) {
            System.out.print("Ingrese la fila (0-3) : ");
            int fila = teclado.nextInt();
            System.out.print("Ingrese la columna (0-3): ");
            int columna = teclado.nextInt();
            if (fila == posicionBarcoX && columna == posicionBarcoY) {
                System.out.println("Ganaste");
                continuarJugando = false;
            } else {
                if (fila < 0 || fila > 3 || columna < 0 || columna > 3) {
                    System.out.println("Oops, esa no es una posición válida. Intente nuevamente.");
                } else {
                    System.out.println("¡fallaste! Inténtalo de nuevo.");
                }
            }
        }
    }
}
