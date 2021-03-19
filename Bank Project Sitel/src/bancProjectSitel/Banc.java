package bancProjectSitel;

import java.util.ArrayList;

public class Banc {

    private String name;
    private int id;
    private ArrayList<Account> accounts;

    public Banc(String name, int id) {
        this.name = name;
        this.id = id;
        accounts = new ArrayList<>();

    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(Account a) {
        accounts.remove(a);
    }

    public void findName(Account a) {

    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

}
