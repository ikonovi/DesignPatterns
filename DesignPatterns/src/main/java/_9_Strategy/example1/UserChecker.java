package _9_Strategy.example1;

import _9_Strategy.example1.AuthStrategy;

public class UserChecker {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean check(AuthStrategy authStrategy) {
        return authStrategy.checkLogin(name, password);
    }
    
}
