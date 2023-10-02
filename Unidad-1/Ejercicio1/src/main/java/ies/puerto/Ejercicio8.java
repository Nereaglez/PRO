package ies.puerto;


import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita
 * calcular Promedio de Notas; finaliza
 * cuando N = 0
 */

public class Ejercicio8 {

    public static void main(String[] args) {
        //Definir variables
        Scanner scanner = new Scanner(System.in);
        int N;
        double Acumula = 0;

        System.out.print("Ingrese la cantidad de notas que desea evaluar: ");
        N = scanner.nextInt();

        //Calculo

        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = scanner.nextDouble();
            Acumula += nota;
        }


        double promedio = Acumula / N;
        System.out.println("El promedio de las notas es: " + promedio);

        //Monstrar resultado en pantalla

    }
}