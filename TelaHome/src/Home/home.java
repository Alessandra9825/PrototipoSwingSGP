package Home;

import javax.swing.*;

public class home extends  JFrame{
    private JButton finançasButton;
    private JButton calendarioButton;
    private JButton painelButton;
    private JButton dashboardButton;
    private JButton configuraçõesButton;
    private JPanel contanier;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;

    public home()
    {
        setTitle("Seja Bem-Vindo");
        setSize(550,500);
        add(contanier);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
