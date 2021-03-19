package bancProjectSitel;

public class Account implements Comparable<Account> {

    private String username;
    private String password;
    private String name;
    private static int lastId = 1;
    private int id = 0;
    private double amount;

    public Account(String username, String password, String name, double amount) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.id = lastId++;
        this.amount = amount;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public static int getLastId() {
        return lastId;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Account) {
            Account a = (Account) (o);
            return id == a.id;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Username " + username + "name " + name + " id " + id + " amount " + amount;
    }

    @Override
    public int compareTo(Account a) {
        return name.compareTo(a.name);

    }

    public void deposit(double funds) {
        amount = amount + funds;
    }

    public void withdrawFunds(double funds) {
        if (amount >= funds) {
            amount = amount - funds;
        } else {
            System.out.println("Ti nuk ke fonde te mjaftueshme per te terhequr");
        }
    }

    public void transfer(Account a, double funds) {
        a.amount = a.amount + funds;
    }

}
