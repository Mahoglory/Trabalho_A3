package Trabalho;

import javax.swing.*;
import java.awt.*;

public class InterfaceRegistroMedico extends JFrame {

    public InterfaceRegistroMedico() {
        setTitle("Interface de Registro Médico");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel superior para busca
        JPanel painelSuperior = new JPanel(new FlowLayout());
        JLabel labelCpf = new JLabel("CPF");
        JTextField campoCpf = new JTextField(10);
        JLabel labelNome = new JLabel("NOME");
        JTextField campoNome = new JTextField(10);
        JButton botaoPesquisar = new JButton("PESQUISAR");

        painelSuperior.add(labelCpf);
        painelSuperior.add(campoCpf);
        painelSuperior.add(labelNome);
        painelSuperior.add(campoNome);
        painelSuperior.add(botaoPesquisar);

        add(painelSuperior, BorderLayout.NORTH);

        // Painel central para lista de exames
        JPanel painelCentral = new JPanel(new BorderLayout());

        JPanel painelExames = new JPanel(new GridLayout(0, 1));
        JLabel labelExames = new JLabel("EXAMES");
        painelExames.add(labelExames);

        JButton botaoExame1 = new JButton("EXEMPLO EXAME");
        JButton botaoExame2 = new JButton("EXEMPLO EXAME");
        JButton botaoExame3 = new JButton("EXEMPLO EXAME");

        painelExames.add(botaoExame1);
        painelExames.add(botaoExame2);
        painelExames.add(botaoExame3);

        painelCentral.add(painelExames, BorderLayout.CENTER);

        add(painelCentral, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfaceRegistroMedico();
            }
        });
    }
}
