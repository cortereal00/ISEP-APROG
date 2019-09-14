package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex3 {

        public static void main(String args[]) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Introduza os valores de a, b e c, sucessivamente:");

                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();

                if (isTrianguloValido(a, b, c)) {
                        System.out.println("ab = " + calcularGrau(a, b, c));
                        System.out.println("ac = " + calcularGrau(a, c, b));
                        System.out.println("bc = " + calcularGrau(b, c, a));
                } else {
                        System.out.println("O triangulo é inválido!");
                }

                scanner.close();
        }

        public static int calcularGrau(int a, int b, int c) {
                return (int) (Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2D * a * b))) + 0.5D);
        }

        public static boolean isTrianguloValido(int a, int b, int c) {
                return a + b > c && a + c > b && b + c > a;
        }
}
