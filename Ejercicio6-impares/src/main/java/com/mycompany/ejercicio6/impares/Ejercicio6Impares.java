/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio6.impares;

/**
 * Programa que multiplique los 10 primeros números impares.
 *
 * @author Manuel González Vaz
 */
public class Ejercicio6Impares {

    public static void main(String[] args) {
        /**
         * Numero impar que aumentara hasta el decimo (19)
         */
        int numero = 1;
        /**
         * Multiplicación total de los numeros impares
         */
        long total = 1;

        /**
         * Creo un bucle for de 10 iteraciones en el cual se mutiplicara los
         * numeros y se le sumara dos al numero impar para obtener el siguiente
         */
        for (int i = 0; i < 10; i++) {
            total *= numero;
            numero += 2;
        }
        System.out.println("Total: "+total);
    }
}
