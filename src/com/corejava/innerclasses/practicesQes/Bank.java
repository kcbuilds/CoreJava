package com.corejava.innerclasses.practicesQes;

public class Bank {
    class Account {
        void accountInfo() {
            System.out.println("Account Holder: Karan, Balance: $5000");
        }
    }

    static class Branch {
        void branchInfo(){
            System.out.println("Branch: Mumbai - Andheri");
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank.Account account = bank.new Account();
        account.accountInfo();

        Branch branch = new Branch();
        branch.branchInfo();
    }
}
