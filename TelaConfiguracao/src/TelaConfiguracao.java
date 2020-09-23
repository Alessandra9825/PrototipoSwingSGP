import javax.swing.*;

public class TelaConfiguracao extends  JFrame {
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton salvarButton;
    private JTextField textField1;
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JTextField textField3;
    private JComboBox comboBox2;
    private JTextField textField4;
    private JButton pesquisarButton;
    private JPanel contanier;
    private JButton cancelarButton;

    public TelaConfiguracao()
    {
        setTitle("Configuração");
        setSize(580,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
