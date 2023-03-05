import java.util.Scanner;
public class EsElMayor {
    public static void main(String[] args) {
        primero();
        segundo();
    }
    public static void primero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número");
        double num2 = sc.nextDouble();
        if (num1 > num2) {
            System.out.println("El primer número es mayor " + num1);
        } else {
            System.out.println("El segundo número es mayor " + num2);
        }
    }
    public static void segundo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tercer número");
        double num3 = sc.nextDouble();
        System.out.println("Introduce el cuarto número");
        double num4 = sc.nextDouble();
        if (num3 > num4) {
            System.out.println(1);
        } else if (num3 < num4) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
