package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600,200); //// tamanho da janela
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); ///Centralizar na tela do Computador


        JButton botao = new JButton("Clicar");
        janela.add(botao);
        botao.addActionListener(e -> System.out.println("Evento ocorreu! "));



        janela.setVisible(true);




    }
}
