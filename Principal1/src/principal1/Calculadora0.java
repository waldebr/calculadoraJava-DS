/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal1;

/**
 *
 * @author waldemar
 */
public class Calculadora0 {
    

    private double numero01;
    private double numero02;
    private double resultado;

    public double somar(double num1, double num2) {
        numero01 = num1;
        numero02 = num2;
        resultado = numero01 + numero02;
        return resultado;
    }

    public double subtrair(double num1, double num2) {
        numero01 = num1;
        numero02 = num2;
        resultado = numero01 - numero02;
        return resultado;
    }

    public double multiplicar(double num1, double num2) {
        numero01 = num1;
        numero02 = num2;
        resultado = numero01 * numero02;
        return resultado;
    }

    public double dividir(double num1, double num2) {
        numero01 = num1;
        numero02 = num2;
        resultado = numero01 / numero02;
        return resultado;
    }
}

