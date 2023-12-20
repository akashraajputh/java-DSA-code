package bank;

import java.util.Random;

class Account {
    String name;
    protected String email;
    private String password;

    // getter & setters
    public String getpassword() {
        // setpassword(randompass);
        return this.password;
    }

    private void setpassword(String pass) {
        this.password = pass;
    }

}

public class bank {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "akash";
        account1.email = "kmrakash350@gmail.com";
        // account1.password = "abcd";
        account1.setpassword("abc");
        System.out.println(account1.getpassword());
        System.out.println(account1.name);
        System.out.println(account1.email);
    }

}
