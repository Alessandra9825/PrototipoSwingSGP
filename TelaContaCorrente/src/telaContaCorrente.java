import javax.swing.*;

public class telaContaCorrente extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JComboBox comboBox1;
    private JButton cadrastarButton;
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JPanel contanier;
    private JButton cancelarButton;

    public telaContaCorrente()
    {
        setTitle("Conta Corrente");
        setSize(580,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
