import javax.swing.*;

public class telaDetalharPostIt extends JFrame{
    private JPanel contanier;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JTextField textField3;
    private JButton deletarButton;
    private JButton alterarButton;
    private JPanel container;
    private JButton cancelarButton;

    public telaDetalharPostIt()
    {
        setTitle("Post-it");
        setSize(580,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
