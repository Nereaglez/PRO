package ies.puerto;

/**
 * * Escribe un programa en Java que imprima el patrón siguiente:
 *
 * 1
 *
 * 2 3
 *
 * 4 5 6
 *
 * 7 8 9 10
 *
 * */

public class Ejercicio1 {

    public static void main(String[] args) {

            int n = 1;
            int filas = 4; // En este caso son 4 filas, se pueden cambiar si lo deseas.

            for (int i = 1; i <= filas; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(n + " ");
                    n++;
                }
                System.out.println();
            }
        }
    }




