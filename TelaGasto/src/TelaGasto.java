import javax.swing.*;

public class TelaGasto extends JFrame{
    private JTextField textField2;
    private JButton cadrastarButton;
    private JTextField textField1;
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JPanel contanier;
    private JButton cancelarButton;

    public TelaGasto()
    {
        setTitle("Despesa");
        setSize(580,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
