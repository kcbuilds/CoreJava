package com.corejava.Exceptions;

public class LowBalanceException extends Exception{

    public LowBalanceException() {
        super("Exception: Insufficient Balance!");
    }

}
