import javax.swing.*;

public class telaGastoCredito extends  JFrame{
    private JTextField textField2;
    private JTextField textField1;
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JButton cadrastarButton;
    private JButton cancelarButton;
    private JPanel contanier;

    public telaGastoCredito()
    {
        setTitle("Despesa");
        setSize(580,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
