package com.corejava.innerclasses.practicesQes;

import com.corejava.oops.Inheritance.Test;

public class test {
    public static void main(String[] args) {

        // Anonymous inner class implementing Alert
        Alert alert = new Alert() {
            @Override
            public void send() {
                System.out.println("Alert sent: Low Battery!");
            }
        };

        alert.send();
    }
}

