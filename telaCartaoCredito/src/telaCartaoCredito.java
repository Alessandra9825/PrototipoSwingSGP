import javax.swing.*;

public class telaCartaoCredito extends JFrame {
    private JPanel contanier;
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton cadastrarButton;
    private JButton cancelarButton;

    public telaCartaoCredito()
    {
        setTitle("Cartão Crédito");
        setSize(580,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
