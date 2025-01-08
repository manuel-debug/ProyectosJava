/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1.ventas;

import java.util.Random;
//import java.util.Scanner;

/**
 * Array con 30 ventas del mes, y que diga cuáles y cuántas son mayores que
 * $2000.
 *
 * @author Manuel Gonzalez Vaz
 */
public class Ejercicio1Ventas {

    public static void main(String[] args) {
        /**
         * Array almacena valores de las ventas de un mes(30)
         */
        double[] ventas = new double[30];
        double totalVentas = 0;

        /**
         * Variable de tipo scanner que nos servira para introducir los datos
         * por teclado
         */
        //Scanner sc = new Scanner(System.in);
        /**
         * Variable random me permite generar numeros aleatorios
         */
        Random rand = new Random();

        System.out.println("Ingrese las 30 ventas del mes: ");

        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Venta " + (i + 1) + ": ");
            /**
             * Esta linea se encarga de guardar las ventas en el array. Se puede
             * hacer por teclado o por numeros aleatorios.
             */
            //ventas[i]=sc.nextDouble();
            ventas[i] = rand.nextDouble() * 3000;
            /**
             * "%.2f%n" es el formateo de las ventas para que solo coja los dos
             * primeros decimales
             */
            System.out.printf("%.2f%n", ventas[i]);

            /**
             * pausa el tiempo por 1 segundo
             */
            //try {
            //    Thread.sleep(1000);
            //} catch (InterruptedException ex) {
            //    System.out.println("Thread interrupted: " + ex.getMessage());
            //}
        }

        System.out.printf("%n%n___________________________________________%n"
                + "Resumen de las ventas mayor o igual a 2000%n"
                + "___________________________________________%n%n");
        
        /**
         * comprobación de las ventas
         */
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] >= 2000) {
                //totalVentas = ventas[i] + totalVentas;
                totalVentas++;
                System.out.printf("Venta " + (i + 1) + ": %.2f%n", ventas[i]);
            }
        }
        System.out.printf("%n%nTotal de ventas: %.2f%n", totalVentas);

    }
}
