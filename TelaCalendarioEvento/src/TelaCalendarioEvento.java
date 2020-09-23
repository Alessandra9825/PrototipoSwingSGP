import javax.swing.*;

public class TelaCalendarioEvento extends JFrame {
    private JButton inserirButton;
    private JButton deletarButton;
    private JButton alterarButton;
    private JTextArea areaContendoOCalendarioTextArea;
    private JButton finançasButton;
    private JButton calendárioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JPanel contanier;

    public TelaCalendarioEvento()
    {
        setTitle("Post-it");
        setSize(580,500);
        add(contanier);
        setLocationRelativeTo(null);
    }
}
