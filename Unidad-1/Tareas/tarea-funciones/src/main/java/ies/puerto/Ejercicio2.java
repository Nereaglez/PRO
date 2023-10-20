package ies.puerto;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Funcion para calculqr el area del circulo
     * @param radio del circulo
     * @return resultado
     */
    public double areaCirculo(int radio) {
        double resultado = 0;
        resultado = (radio*radio)*Math.PI;
        return resultado;
    }
}