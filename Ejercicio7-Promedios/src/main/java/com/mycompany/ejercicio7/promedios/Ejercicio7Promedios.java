/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio7.promedios;

import java.util.Scanner;

/**
 * Capturaremos 10 números enteros, y el programa al final nos dirá de esos 10
 * números, cuál es el promedio de los positivos, cuál fue de los negativos, y
 * la cantidad de ceros ingresados.
 *
 * @author Manuel González Vaz
 */
public class Ejercicio7Promedios {

    public static void main(String[] args) {
        /**
         * Numero introducido por teclado
         */
        int numero = 0;
        /**
         * Resultado de dividir la suma total con la cantidad de valores
         * positivos
         */
        double promedioPositivo = 0;
        /**
         * Resultado de dividir la suma total con la cantidad de valores
         * negativos
         */
        double promedioNegativo = 0;
        /**
         * Numero total de numeros positivos introducidos
         */
        int cantidadPositivos = 0;
        /**
         * Numero total de numeros negativos introducidos
         */
        int cantidadNegativos = 0;
        /**
         * suma total de los numeros positivos introducidos
         */
        double sumaPositivos = 0;
        /**
         * suma total de los numeros negativos introducidos
         */
        double sumaNegativos = 0;
        /**
         * Cantidad total de 0's
         */
        int cantidadCeros = 0;
        /**
         * Variable de tipo scanner que nos servira para introducir los datos
         * por teclado
         */
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un numero");
            numero = sc.nextInt();
            if (numero > 0) {
                sumaPositivos += numero;
                cantidadPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                cantidadNegativos++;
            } else {
                cantidadCeros++;
            }
        }

        promedioPositivo = sumaPositivos / cantidadPositivos;
        promedioNegativo = sumaNegativos / cantidadNegativos;

        if (cantidadPositivos != 0) {
            System.out.println("El promedio positivo es: " + promedioPositivo);
        } else {
            System.out.println("No se introdujeron positivos");
        }

        if (cantidadNegativos != 0) {
            System.out.println("El promedio negativo es: " + promedioNegativo);
        } else {
            System.out.println("No se introdujeron negativos");
        }

        System.out.println("La cantidad de cero introducidos es: " + cantidadCeros);
    }
}
