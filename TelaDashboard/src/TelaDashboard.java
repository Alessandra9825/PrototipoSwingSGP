import javax.swing.*;

public class TelaDashboard extends JFrame {
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane3;
    private JPanel contanier;

    public TelaDashboard()
    {
        setTitle("Dashboard");
        setSize(580,500);
        add(contanier);
        setLocationRelativeTo(null);
    }
}
