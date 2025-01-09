/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio2.mayor;

import java.util.Random;
//import java.util.Scanner;

/**
 * Saber cuál es el mayor de un arreglo.
 *
 * @author Manuel González Vaz
 */
public class Ejercicio2Mayor {

    public static void main(String[] args) {

        /**
         * Array que contendra 5 numeros enteros
         */
        int[] arrayInt = new int[5];
        /**
         * Numero entero el cual es el mayor de arrayInt
         */
        int mayor = arrayInt[0];
        /**
         * Variable de tipo scanner que nos servira para introducir los datos
         * por teclado
         */
        //Scanner sc = new Scanner(System.in);
        /**
         * Variable random me permite generar numeros aleatorios
         */
        Random rand = new Random();

        System.out.println("Introduzca los 5 numeros");
        for (int i = 0; i < arrayInt.length; i++) {
            //arrayInt[i]= sc.nextInt();

            arrayInt[i] = (1 + rand.nextInt(5));
            System.out.println(arrayInt[i]);

            if (arrayInt[i] > mayor) {
                mayor = arrayInt[i];
            }
        }
        System.out.println("El numero mayor en el arreglo es " + mayor);
    }
}
