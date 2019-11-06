package Chap9;

import java.util.*;
/**
 * @Author Lan XiaoJun
 * @Date 2019/10/10 8:54
 * @Version 1.0
 **/
public class Account {
    private int id;  //账户号码
    private double balance;  //账户余额
    private double annualInterestRate; //当前利率
    Date dateCreated = new Date();
    public Account()
    {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }
    public Account(int id,int balance)
    {
        this.id = id;
        this.balance = balance;
    }
    public int getId()
    {
        return this.id;
    }
    public void steId(int id)
    {
        this.id = id;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate/100;
    }
    public Date DateCreated()
    {
        return this.dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return this.annualInterestRate/12;
    }
    public double getMonthlyInterest()
    {
        return balance*getMonthlyInterestRate();
    }
    public double withDraw(double count)
    {
        this.balance -= count;
        return this.balance;
    }
    public double deposit(double count)
    {
        this.balance += count;
        return this.balance;
    }
    public static void main(String[] args)
    {
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("余额：" + account.getBalance());
        System.out.println("月利息：" + account.getMonthlyInterest());
        System.out.println("开户日期："+account.DateCreated().toString());
    }
}
