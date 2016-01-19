package com.uip.clase1;

/**
 * Created by david on 1/19/16.
 * Construir un programa en Java que sume los números pares del 1 al 100
 */
public class prog2 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int total = 0;
        for(int i = start; i<= end; i++) {
            if(i%2 == 0) {
                total += i;
            }
        }
        System.out.println("La suma de los números pares entre " + start + " y " + end + " es " + total);
    }
}
