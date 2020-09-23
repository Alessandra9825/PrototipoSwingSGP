import javax.swing.*;

public class TelaDetalharFinanca extends JFrame{
    private JTextField textField2;
    private JButton alterarButton;
    private JTextField textField1;
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JTextField textField3;
    private JButton deletarButton;
    private JTextField textField4;
    private JPanel contanier;
    private JButton cancelarButton;

    public TelaDetalharFinanca()
    {
        setTitle("Finança");
        setSize(580,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
