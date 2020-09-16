package Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    public Login()
    {
        setTitle("Seja Bem-Vindo");
        setSize(360,300);
        add(p_panel);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private JButton btn_login;
    private JPanel p_panel;
    private JTextField textField1;
    private JTextField textField2;


}
