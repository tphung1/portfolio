package crypt.entities;

public class Portfolio {

    private int portfolioID;
    private int userID;
    private String cryptoName;
    private double holding;
    private double balance;
    private double quantity;
    private double price;

    public int getPortfolioID() {
        return portfolioID;
    }

    public void setPortfolioID(int portfolioID) {
        this.portfolioID = portfolioID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getCryptoName() {
        return cryptoName;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public double getHolding() {
        return holding;
    }

    public void setHolding(double holding) {
        this.holding = holding;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
