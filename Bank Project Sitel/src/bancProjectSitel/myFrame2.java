package bancProjectSitel;

import javax.swing.*;

public class myFrame2 extends JFrame {

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;
    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JButton withdrawButton;
    private JButton depositButton;
    private Account acc;

    public myFrame2(Account acc) {
        this.acc = acc;
        setProperties();
        init();
        setUI();
    }

    public void setProperties() {
        setTitle("Welcome" + acc.getName());
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init() {
        panel = new JPanel();
        label = new JLabel("Miresevini " + acc.getName());
        textField = new JTextField("Zgjidni operacionin qe deshironi te kryeni");
        withdrawButton = new JButton("Withdraw");
        depositButton = new JButton("Deposit");

    }

    public void setUI() {
        panel.add(label);
        panel.add(textField);
        panel.add(withdrawButton);
        panel.add(depositButton);
        add(panel);
    }

}
