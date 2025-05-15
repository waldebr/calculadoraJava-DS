package principal1;

// EntradaSaidaDados1.java (If you must use it)
import javax.swing.JOptionPane;

public class EntradaSaidaDados1 {

    public String entradaDados(String mensagemEntrada) {
        return JOptionPane.showInputDialog(null, mensagemEntrada);
    }

    public void saidaDados(String mensagemSaida) {
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}