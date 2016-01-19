package com.uip.clase1;

/**
 * Created by david on 1/19/16.
 * Construir un programa en java que sume los números del 1 al 100
 */
public class prog1 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int total = 0;

        for (int i = start; i <= end; i++) {
            total += i;
        }

        System.out.println("La suma de los numeros del " + start + " al " + end + " es " + total);
    }
}
