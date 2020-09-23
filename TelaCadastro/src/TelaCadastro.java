import javax.swing.*;

public class TelaCadastro extends  JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField4;
    private JButton contaCorrenteButton;
    private JButton cartãoDeCreditoButton;
    private JTextField textField5;
    private JTabbedPane tabbedPane1;
    private JButton cadastrarButton;
    private JPanel contanier;
    private JButton cancelarButton;

    public TelaCadastro()
    {
        setTitle("Cadastro");
        setSize(550,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
