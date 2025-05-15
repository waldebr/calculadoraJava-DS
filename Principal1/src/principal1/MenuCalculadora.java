package principal1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class MenuCalculadora extends JFrame {

    private Calculadora0 calculadora;
    private ConversorNumeros1 conversor;
    private EntradaSaidaDados1 io; // If you must use it

    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JLabel lblResultado;
    private JButton btnSomar;
    private JButton btnSubtrair;
    private JButton btnMultiplicar;
    private JButton btnDividir;

    public MenuCalculadora() {
        calculadora = new Calculadora0();
        conversor = new ConversorNumeros1();
        io = new EntradaSaidaDados1(); // If you must use it

        setTitle("Calculadora Básica");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        initComponents();
    }

    private void initComponents() {
        JLabel lblNumero1 = new JLabel("Número 1:");
        txtNumero1 = new JTextField(10);
        JLabel lblNumero2 = new JLabel("Número 2:");
        txtNumero2 = new JTextField(10);
        btnSomar = new JButton("Somar");
        btnSubtrair = new JButton("Subtrair");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");
        lblResultado = new JLabel("Resultado:");

        add(lblNumero1);
        add(txtNumero1);
        add(lblNumero2);
        add(txtNumero2);
        add(btnSomar);
        add(btnSubtrair);
        add(btnMultiplicar);
        add(btnDividir);
        add(lblResultado);

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular('+');
            }
        });

        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular('-');
            }
        });

        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular('*');
            }
        });

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular('/');
            }
        });
    }

    private void calcular(char operacao) {
        try {
            double num1 = conversor.stringToDouble(txtNumero1.getText());
            double num2 = conversor.stringToDouble(txtNumero2.getText());
            double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = calculadora.somar(num1, num2);
                    break;
                case '-':
                    resultado = calculadora.subtrair(num1, num2);
                    break;
                case '*':
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = calculadora.dividir(num1, num2);
                    } else {
                        lblResultado.setText("Erro: Divisão por zero!");
                        return;
                    }
                    break;
            }

            DecimalFormat df = new DecimalFormat("#.#####"); // Format to 5 decimal places
            lblResultado.setText("Resultado: " + df.format(resultado));
            io.saidaDados("Resultado: " + df.format(resultado)); // If you must use io

        } catch (NumberFormatException ex) {
            lblResultado.setText("Entrada inválida!");
            io.saidaDados("Entrada inválida!"); // If you must use io
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuCalculadora().setVisible(true);
            }
        });
    }
}