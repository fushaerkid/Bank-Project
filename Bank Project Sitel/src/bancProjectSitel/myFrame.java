package bancProjectSitel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class myFrame extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 200;
    private JLabel label;
    private JLabel passwordLabel;
    private JPasswordField password;
    private JTextField username;
    private JPanel panel;
    private JButton logInButton;
    private JTextField textField;
    private JButton cancelButton;
    private JLabel nameLabel;
    private Banc b;
    

    public myFrame(Banc b) {
        this.b = b;
        setProperties();
        init();
        setUI();
    }

    private void setProperties() {
        setTitle("Virtual data bank");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void init() {
        panel = new JPanel();
        label = new JLabel("Username");
        username = new JTextField(10);
        password = new JPasswordField(10);
        textField = new JTextField(10);
        logInButton = new JButton("Login");
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean found = false;
                for (Account acc : b.getAccounts()) {
                    if (acc.getUsername().equals(username.getText())
                            && acc.getPassword().equals(password.getText())) {
                        myFrame2 frame = new myFrame2(acc);
                        frame.setVisible(true);
                        found = true;
                    }
                }
                if (!found) {
                    System.err.println("Te dhena te gabuara");
                }
            }
        });
        cancelButton = new JButton("Cancel");
        passwordLabel = new JLabel("Password");
        nameLabel = new JLabel("Shkruani emrin");
    }

    private void setUI() {
        panel.add(label);
        panel.add(username);
        panel.add(passwordLabel);
        panel.add(password);
        panel.add(nameLabel);
        panel.add(textField);
        panel.add(logInButton);
        panel.add(cancelButton);
        
        add(panel);
    }
}
