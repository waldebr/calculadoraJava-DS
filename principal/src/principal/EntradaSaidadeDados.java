/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
    import javax.swing.JOptionPane;
 * @author dti
 */
public class EntradaSaidadeDados {



    public String entradaDados(String mensagemEntrada) {
        return JOptionPane.showInputDialog(null, mensagemEntrada);
    }

    public void saídaDados(String mensagemSaida) {
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }

    // corrigindo acento no método
    public void saidaDados(String mensagemSaida) {
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}


