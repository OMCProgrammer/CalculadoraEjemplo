package com.calculadora;

/**
 * Clase que representa una calculadora básica para realizar operaciones aritméticas.
 * Permite gestionar dos operandos y obtener el resultado de sumas, restas, 
 * multiplicaciones y divisiones.
 * * @author Tu Nombre
 * @version 1.0
 * @since 1.0
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {

    /** Primer valor numérico de la operación */
    private double operando1;
    
    /** Segundo valor numérico de la operación */
    private double operando2;
    
    /** Almacena el valor resultante de la última operación ejecutada */
    private double resultado;

    /**
     * Constructor por defecto para inicializar los atributos.
     */
    public CalculadoraEjemplo() {
        this.operando1 = 0;
        this.operando2 = 0;
        this.resultado = 0;
    }

    /**
     * Realiza la suma de los dos operandos.
     * * @param a Primer sumando.
     * @param b Segundo sumando.
     * @return La suma de a y b.
     */
    public double sumar(double a, double b) {
        this.operando1 = a;
        this.operando2 = b;
        this.resultado = a + b;
        return this.resultado;
    }

    /**
     * Realiza la resta entre dos números.
     * * @param a Minuendo.
     * @param b Sustraendo.
     * @return La diferencia entre a y b.
     */
    public double restar(double a, double b) {
        this.operando1 = a;
        this.operando2 = b;
        this.resultado = a - b;
        return this.resultado;
    }

    /**
     * Realiza la multiplicación de dos operandos.
     * * @param a Multiplicando.
     * @param b Multiplicador.
     * @return El producto de a por b.
     */
    public double multiplicar(double a, double b) {
        this.operando1 = a;
        this.operando2 = b;
        this.resultado = a * b;
        return this.resultado;
    }

    /**
     * Realiza la división del primer operando por el segundo.
     * Incluye una validación para evitar la división por cero.
     * * @param a Dividendo.
     * @param b Divisor (no debe ser 0).
     * @return El cociente resultante o 0 si el divisor es inválido.
     */
    public double dividir(double a, double b) {
        this.operando1 = a;
        this.operando2 = b;
        if (b != 0) {
            this.resultado = a / b;
        } else {
            System.out.println("Error: División por cero no permitida.");
            this.resultado = 0;
        }
        return this.resultado;
    }

    /**
     * Método principal para probar la funcionalidad de la clase.
     * * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        CalculadoraEjemplo miCalc = new CalculadoraEjemplo();

        System.out.println("Pruebas de Calculadora:");
        System.out.println("Suma (10 + 5): " + miCalc.sumar(10, 5));
        System.out.println("Resta (10 - 5): " + miCalc.restar(10, 5));
        System.out.println("Multiplicación (10 * 5): " + miCalc.multiplicar(10, 5));
        System.out.println("División (10 / 5): " + miCalc.dividir(10, 5));
        System.out.println("Prueba adicional: " + miCalc.sumar(50, 50));
        System.out.println("Prueba adicional 2: " + miCalc.sumar(500, 500));
    }
}