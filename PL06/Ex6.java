package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex6 {

        public static void main(String args[]) {
                
                Scanner scanner = new Scanner(System.in);

                System.out.println("Introduza o sólido:");

                String solid = scanner.nextLine();

                while (isSolido(solid)) {
                        System.out.printf("O volume do sólido é: %.2f u.v.", calcularVolume(solid, scanner));

                        solid = scanner.nextLine();
                }

                scanner.close();
        }
        
        private static boolean isSolido(String solid) {
                return solid.equalsIgnoreCase("esfera") || solid.equalsIgnoreCase("cilindro") || solid.equalsIgnoreCase("cone");
        }
        
        private static double calcularVolume(String solid, Scanner scanner) {
                if (solid.equalsIgnoreCase("esfera")) {
                        
                        System.out.println("Introduza o raio da esfera: ");
                        
                        return (4d / 3d) * Math.PI * Math.pow(scanner.nextDouble(), 3);
                        
                } else if (solid.equalsIgnoreCase("cilindro")) {
                        System.out.println("Introduza o raio da base do cilindro:");

                        double radius = scanner.nextDouble();

                        System.out.println("Introduza a altura do cilindro:");

                        double height = scanner.nextDouble();

                        return Math.PI * Math.pow(radius, 2) * height;
                        
                } else {
                        System.out.println("Introduza o raio da base do cilindro:");

                        double radius = scanner.nextDouble();

                        System.out.println("Introduza a altura do cilindro:");

                        double height = scanner.nextDouble();

                        return (1d / 3d) * Math.PI * Math.pow(radius, 2) * height;
                }
        }
}
