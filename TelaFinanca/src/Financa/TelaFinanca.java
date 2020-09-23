package Financa;

import javax.swing.*;

public class TelaFinanca extends JFrame{
    private JLabel lblValSaldo;
    private JButton btnAddReceita;
    private JButton btnAddGastos;
    private JButton btnAddGastosCartao;
    private JTable tblTransicoes;
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JButton detalharButton;
    private JPanel contanier;

    public TelaFinanca()
    {
        setTitle("Finança");
        setSize(580,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
