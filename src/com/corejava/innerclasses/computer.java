package com.corejava.innerclasses;

public class computer {
    private String model;
    private String brand;
    
    private OperatingSystem os;

    static class USB{
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void display(){
            System.out.println("USB Type " + type);
        }
    }

    public computer(String model, String brand, String osName) {
        this.model = model;
        this.brand = brand;
        this.os = new OperatingSystem(osName);

    }

    public OperatingSystem getOs() {
        return os;
    }

    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model");
        }
    }
}
