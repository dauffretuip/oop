package com.uip.clase1;

/**
 * Created by david on 1/19/16.
 * Construir un programa en Java que sume los números de 1 al n, siendo n un número introducido por teclado mayor que 0
 */

import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        System.out.println("Favor ingresar un número entero positivo");

        Scanner numero = new Scanner( System.in );

        int start = 1;
        int end = numero.nextInt();
        int total = 0;
        for(int i = start; i <= end; i++) {
            total += i;
        }
        System.out.println("La suma de los números del " + start + " a " + end + " es " + total);
    }
}
