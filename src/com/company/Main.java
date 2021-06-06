package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        for (int i = 0; ; i++) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                e.printStackTrace();

                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                    break;
                }catch (LimitException limitException){
                    limitException.printStackTrace();
                }
            }
        }
    }
}