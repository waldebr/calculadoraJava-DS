/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author dti
 */
    public class ConversorNumeros1 {

    public int stringToInt(String numero) {
        try {
            return Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public double stringToDouble(String numero) {
        try {
            return Double.parseDouble(numero);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public String intToString(int numero) {
        return Integer.toString(numero);
    }

    public String doubleToString(double numero) {
        return Double.toString(numero);
    }
}

