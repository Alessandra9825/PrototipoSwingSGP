import javax.swing.*;

public class TelaPainel extends JFrame{
    private JButton detalharButton;
    private JButton inserirButton;
    private JButton finançasButton;
    private JButton calendárioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane3;
    private JTabbedPane tabbedPane4;
    private JPanel contanier;

    public TelaPainel()
    {
        setTitle("Seja Bem-Vindo");
        setSize(360,300);
        add(contanier);
        setLocationRelativeTo(null);
    }
}
