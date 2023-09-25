package ies.puerto;

import java.util.Scanner;

/**
 * Clase que realiza ele ejrcicio numero 1 de las tareas
 */
public class Main {
    public static void main(String[] args) {

        int valorA;
        int valorB;

        Scanner lectura = new Scanner(System.in);

        //Bloque 2: verifica si los valores son iguales

        do {
            //Bloque 1: Pide por pantalla valor y asigna valor

            System.out.println("Ingrese el valor de la variante A: ");
            valorA = lectura.nextInt();
            System.out.println("Valor de la variable A:" + valorA);

            System.out.println("Ingrese el valor de la variante B: ");
            valorB = lectura.nextInt();
            System.out.println("Valor de la variable B:" + valorB);

        } while (valorA == valorB);
        {
            if (valorA == valorB) ;
            {
                System.out.printf("Los valores introducidos son iguales");
            }

            //Bloque 3: verifica si A > B

            // Muestra por pantalla el valor mayor
        }

    }
}