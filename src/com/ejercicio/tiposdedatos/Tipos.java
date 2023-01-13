package com.ejercicio.tiposdedatos;

public class Tipos {
    public static void main(String[] args) {
        // 1. numericos

        // 1.1 enteros
        byte variable1 = 7;// 1 byte
        System.out.println(variable1);
        short variable2 = 12; // 2 byte
        System.out.println(variable2);
        int variable3 = 50; // 4 byte
        System.out.println(variable3);
        long variable4 = 200400500l; // 8 byte
        System.out.println(variable4);

        // 1.2 decimales
        float variable5 = 5.6f;
        System.out.println(variable5);
        double variable6 = 10.5d;
        System.out.println(variable6);

        // 2. booleano
        boolean variable7 = false;
        System.out.println(variable7);
        boolean variable8 = true;
        System.out.println(variable8);
        // 3. texto

        // 3.1 caracter
        char variable9 = 'b';
        System.out.println(variable9);

        // cadenas de texto
        String variable10 = "Casas Muertas de Miguel Otero Silva";
        System.out.println(variable10);

        // 4. tipos envoltorio
        Integer numero = null;
        System.out.println(numero);
        Long numero2 = 40L;
        System.out.println(numero2);
    }
}
