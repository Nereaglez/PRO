package ies.puerto;
import java.util.Scanner;
/**
 *  Imprimir la tabla de multiplicar de un número ingresado
 *  por el usuario utilizando un bucle for. Solicita el valor
 *  de la tabla por teclado.
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = lecture.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        lecture.close();
    }
}



