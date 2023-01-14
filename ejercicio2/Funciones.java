package com.ejercicios.ejercicio2;

public class Funciones{
    public static void main(String[] args) {
        int precio = 10;//precio del producto
        float baseimponible= porcentaje(5,100);//porcentaje del Iva, a 5%
        float iva = precio * baseimponible;
        float resultado = precio + iva;

        System.out.println("total a pagar:"+resultado);}
    public static float porcentaje(float numero1, float numero2){
        return numero1 / numero2;
    }
}
