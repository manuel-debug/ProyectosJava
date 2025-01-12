/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4.dowhile;

import java.util.Scanner;

/**
 * Programa que pida números, y al poner cero, deje de pedir, y que los sume.
 * @author Manuel González Vaz
 */
public class Ejercicio4Dowhile {

    public static void main(String[] args) {
        /**
         * Numero que introduce el usuario
         */
        int numero=0;
        /**
         * Suma total de los numeros que ha introducido el usuario
         */
        int total=0;
        /**
         * Variable de tipo scanner que nos servira para introducir los datos
         * por teclado
         */
        Scanner sc = new Scanner(System.in);
        
        /**
         * Bucle que no parara de pedir numeros hasta que se introduzca un 0
         */
        do{
            System.out.println("Introduzca numero a sumar\nSi desea parar "
                    + "introduzca 0");
            numero=sc.nextInt();
            total=numero+total;
        }while(numero!=0);
        
        System.out.println("El total de la suma es: "+total);
        
    }
}
