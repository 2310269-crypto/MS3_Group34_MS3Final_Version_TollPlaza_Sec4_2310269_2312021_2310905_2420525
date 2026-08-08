package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525.Accountant.ModelClass;

public class AccountantDashboard {

    private String userId;
    private String name;
    private String accountantId;
    private boolean loggedIn;

    public AccountantDashboard() {
        this.loggedIn = false;
    }

    public AccountantDashboard(String userId, String name, String accountantId) {
        this.userId = userId;
        this.name = name;
        this.accountantId = accountantId;
        this.loggedIn = true;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountantId() {
        return accountantId;
    }

    public void setAccountantId(String accountantId) {
        this.accountantId = accountantId;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getWelcomeMessage() {
        return "Welcome, " + name + " (" + accountantId + ")";
    }

    public void logout() {
        this.loggedIn = false;
    }

    @Override
    public String toString() {
        return "AccountantDashboard{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", accountantId='" + accountantId + '\'' +
                ", loggedIn=" + loggedIn +
                '}';
    }
}