package ies.puerto;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Funcion para calcular el area del triangulo
     * @param base del triangulo
     * @param altura del triangulo
     * @return resultado
     */
    public int areaTriangulo(int base, int altura) {
        int resultado = 0;
        resultado = (base*altura)/2;
        return resultado;
    }

}