/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio5.whilepromedio;

import java.util.Scanner;

/**
 * Capturar sólo números positivos, y obtener la media(promedio) de esos
 * números.
 *
 * @author Manuel González Vaz
 */
public class Ejercicio5WhilePromedio {

    public static void main(String[] args) {
        /**
         * Numero que introducimos por teclado
         */
        int numero = 0;
        /**
         * Suma total de todos los numeros
         */
        double sumaTotal = 0;
        /**
         * Cantidad de numeros que se han introducido
         */
        int cantidadValores = 0;
        /**
         * Resultado del ejercicio obtenido de dividir la sumaTotal entre la
         * cantidadValores
         */
        double promedio = 0;
        /**
         * Variable de tipo scanner que nos servira para introducir los datos
         * por teclado
         */
        Scanner sc = new Scanner(System.in);

        while(numero>=0){
            
            /**
             * Introduzco el numero por teclado
             */
            System.out.println("Introduce un numero positivo para "
                    + "añadir al promedio\nSi quiere parar introduzca uno "
                    + "negativo");
            System.out.println("Total: "+ sumaTotal);
            System.out.println("Cantidad: "+ cantidadValores);
            numero=sc.nextInt();
            
            /**
             * Si es igual a 0 no me interesa añadirlo al promedio
             */
            if(numero==0){
                System.out.println("0 no es un numero valido para el promedio"
                        + ", introduzca otro");
            }
            /**
             * Si es menor que 0 es negativo por tanto lo calculara y mostrara
             * el resultado
             */
            else if(numero<0){
                promedio=sumaTotal/cantidadValores;
                System.out.println("El promedio es "+promedio);
            }
            /**
             * Si no es ninguno de los casos anteriores hara los 
             * calculos necesarios
             */
            else{
                sumaTotal=numero+sumaTotal;
                cantidadValores++;
            }
        }
        
        
    }
}
