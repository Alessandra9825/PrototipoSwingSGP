import javax.swing.*;

public class TelaCadastrarPostIt extends JFrame {
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton cadrastarButton;
    private JTextField textField1;
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JTextField textField3;
    private JPanel contanier;

    public TelaCadastrarPostIt()
    {
        setTitle("Cadastro");
        setSize(550,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
