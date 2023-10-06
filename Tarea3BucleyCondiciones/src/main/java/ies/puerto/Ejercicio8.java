package ies.puerto;
import java.util.Scanner;
/**
 * Encontrar y mostrar todos los números perfectos
 * en un rango dado utilizando un bucle for. Solicita
 * el límite por teclado.
 */
public class Ejercicio8 {

    public static void main(String[] args) {

            Scanner lecture = new Scanner(System.in);

            System.out.print("Ingresa el límite superior del rango: ");
            int limiteSuperior = lecture.nextInt();

            System.out.println("Números perfectos en el rango de 1 a " + limiteSuperior + ":");

            for (int num = 2; num <= limiteSuperior; num++) {
                if (esnumeroperfecto(num)) {
                    System.out.println(num);
                }
            }

            lecture.close();
        }

        // Para verificar si un número es perfecto
        public static boolean esnumeroperfecto(int num) {
            int sumaDivisores = 1; // Inicializamos con 1.
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    sumaDivisores += i;
                    if (i != num / i) {
                        sumaDivisores += num / i;
                    }
                }
            }

            return sumaDivisores == num;
        }
    }





