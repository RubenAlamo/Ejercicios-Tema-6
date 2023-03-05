import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        char array[][] = new char[10][40];
        char [] caracteres = {' ', ' ', ' '};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = caracteres[(int) (Math.random() * caracteres.length)];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        visualizarObra(array);
        dibujarRectangulo();
        dibujarCaracter();

    }
    public static void visualizarObra(char[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void dibujarCaracter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el caracter que quieres que se dibuje: ");
        char caracter = sc.next().charAt(0);
        System.out.println("donde lo quieres dibujar posicion en coordenada I: ");
        int posicionI = sc.nextInt();
        System.out.println("donde lo quieres dibujar posicion en coordenada J: ");
        int posicionJ = sc.nextInt();
        char array[][] = new char[10][40];
        for(int i = posicionI; i < array.length; i++){
            for(int j = posicionJ; j < array[i].length; j++){
                array[i][j] = caracter;
            }
            System.out.println();
        }

    }
    public static void dibujarRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el principio del rectangulo en la tabla filas: ");
        int inicioFilas = sc.nextInt();
        System.out.println("Introduce el final del rectangulo en la tabla columnas: ");
        int inicioColumnas = sc.nextInt();
        System.out.println("Introduce el final del rectangulo en la tabla filas: ");
        int finFilas = sc.nextInt();
        System.out.println("Introduce el final del rectangulo en la tabla columnas: ");
        int finColumnas = sc.nextInt();
        System.out.println("Introduce el caracter que quieres que se dibuje: ");
        char caracter = sc.next().charAt(0);
        char array[][] = new char[10][40];
        for(int i = inicioFilas; i < finFilas ; i++){
            for(int j = inicioColumnas; j < finColumnas; j++){
                array[i][j] = caracter;
            }
            System.out.println();
        }
    }

}
