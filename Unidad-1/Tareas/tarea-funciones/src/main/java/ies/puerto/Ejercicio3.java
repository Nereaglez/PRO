package ies.puerto;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Funcion para calcular el area de un cuadrado
     * @param a lado de un cuadrado
     * @return resultado
     */
    public int areaCuadrado(int a) {
        int resultado = 0;
        resultado = (a*a);
        return resultado;
    }

    /**
     * Funcion para calcular el area de un rectangulo
     * @param a lado de un rectangulo
     * @param b lado de un rectangulo
     * @return resultado
     */
    public int areaRectangulo(int a, int b) {
        int resultado = 0;
        resultado = (a*b);
        return resultado;
    }
}