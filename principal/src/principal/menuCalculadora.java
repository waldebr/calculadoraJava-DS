/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;



public class menuCalculadora {
    Calculadora calculadora = new Calculadora();
    ConversorNumeros1 conversor = new ConversorNumeros1();
    EntradaSaidadeDados io = new EntradaSaidadeDados();
    String opcao = "";

    public void executarMenuPrincipal() {
        do {
            opcao = io.entradaDados(
                "Menu da Calculadora:\n" +
                "1 - Somar\n" +
                "2 - Subtrair\n" +
                "3 - Multiplicar\n" +
                "4 - Dividir\n" +
                "0 - Sair\n" +
                "Escolha uma opção:"
            );
            avaliarOpcaoEscolhida();
        } while (!opcao.equals("0"));
    }

    public void avaliarOpcaoEscolhida() {
        double num1 = 0, num2 = 0, resultado = 0;
        String entrada1, entrada2, mensagem = "";

        if (!opcao.equals("0")) {
            entrada1 = io.entradaDados("Digite o primeiro número:");
            entrada2 = io.entradaDados("Digite o segundo número:");

            num1 = conversor.stringToDouble(entrada1);
            num2 = conversor.stringToDouble(entrada2);

            calculadora.setNumero01(num1);
            calculadora.setNumero02(num2);

            switch (opcao) {
                case "1":
                    resultado = calculadora.somar();
                    mensagem = "Resultado da Soma: " + resultado;
                    break;
                case "2":
                    resultado = calculadora.subtrair();
                    mensagem = "Resultado da Subtração: " + resultado;
                    break;
                case "3":
                    resultado = calculadora.multiplicar();
                    mensagem = "Resultado da Multiplicação: " + resultado;
                    break;
                case "4":
                    resultado = calculadora.dividir();
                    mensagem = "Resultado da Divisão: " + resultado;
                    break;
                default:
                    mensagem = "Opção inválida!";
            }

            io.saidaDados(mensagem);
        } else {
            io.saidaDados("Encerrando a calculadora.");
        }
    }
}



