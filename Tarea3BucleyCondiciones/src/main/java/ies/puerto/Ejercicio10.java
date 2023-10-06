package ies.puerto;

import java.util.Scanner;
/**
 * Calcular la suma de todos los números pares entre 1 y un número
 * ingresado por el usuario utilizando un bucle do-while.
 */

public class Ejercicio10 {

        public static void main(String[] args) {
                Scanner lecture = new Scanner(System.in);

                System.out.print("Ingresa un número: ");
                int numero = lecture.nextInt();

                int sumaPares = 0;
                int i = 2; // Comenzamos desde el 2.

                do {
                        sumaPares += i;
                        i += 2; // Incrementamos en 2.
                } while (i <= numero);

                System.out.println("La suma de los números pares entre 1 y " + numero + " es: " + sumaPares);

                lecture.close();


        }

}







