package com.corejava.innerclasses.practicesQes;

public interface Alert {
    void send();

    // Anonymous inner class implementing Alert
    public static void main(String[] args) {
        Alert alert = new Alert() {
            @Override
            public void send() {
                System.out.println("Alert sent: Low Battery!");
            }
        };

        alert.send();

    }
}
