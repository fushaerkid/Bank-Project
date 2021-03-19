package bancProjectSitel;

import java.awt.Frame;

public class FinalTest {

    public static void main(String[] args) {
        Account a = new Account("Sitel", "Erkid", "erkid", 10.4);
        Banc b = new Banc("erkid", 741);
        b.addAccount(a);
        myFrame frame = new myFrame(b);
        frame.setVisible(true);
    }

}
