package com.ejercicios.ejercicio4;

public class SmartDevice{
    //Propiedades
    String marca;
    String modelo;
    String fabricante;
     // M.Constructor vacio
    public SmartDevice() {

    }
    //metodo constructor
    public SmartDevice(String marca, String modelo, String fabricante) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public static class SmartPhone extends SmartDevice {
        int ram;
        String sistema;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String marca, String modelo, String fabricante, int ram, String sistema) {
            super(marca, modelo, fabricante);
            this.ram = ram;
            this.sistema = sistema;

        }

        @Override
        public String toString() {
            return "marca=" + marca +
                    ", modelo=" + modelo +
                    ", fabricante=" + fabricante +
                    ", ram=" + ram +
                    ", sistema=" + sistema;
        }
    }

    public static class SmartWatch extends SmartDevice {
        String cronometro;

        public SmartWatch() {
            super();
        }

        public SmartWatch(String marca, String modelo, String fabricante, String cronometro) {
            super(marca, modelo, fabricante);
            this.cronometro = cronometro;
        }

        @Override
        public String toString() {
            return "marca=" + marca +
                    ", modelo=" + modelo +
                    ", fabricante=" + fabricante +
                    ", cronometro=" + cronometro;
        }
    }

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Samsung", "S", "EmpresaM",
                4, "Android");

        SmartWatch smartWatch = new SmartWatch("Apple", "Ultra", "EmpresaX",
                "digital");

        System.out.println("El smartphone es: " + smartPhone + "\nEl smartwatch es: " + smartWatch);

    }

}
