/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio3.totalpago;

import java.util.Scanner;

/**
 * Saber total a pagar, en base al descuento que se haga. 
 * La pieza de pan cuesta a $5. 
 * Si se compraron más de 50 piezas, cada pieza costará a $4.5 
 * Si se compraron más de 100, cada pieza costará a $4.
 *
 * @author Manuel González Vaz
 */
public class Ejercicio3TotalPago {

    public static void main(String[] args) {
        double precioBase = 0;
        double precioFinal = 0;
        int piezas = 0;
        /**
         * Variable de tipo scanner que nos servira para introducir los datos
         * por teclado
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Introducir el numeros de piezas que se han comprado
         */
        System.out.println("Introduce el numeros de piezas a comprar");
        piezas = sc.nextInt();
        
        /**
         * Calcular el precio total segun el numeros de piezas
         */
        if(piezas<=50 && piezas>0){
            precioBase=5;
            
        }else if(piezas>50 && piezas<=100){
            precioBase=4.5;
            
        }else if(piezas>100){
            precioBase=4;
            
        }
        precioFinal=piezas*precioBase;
        
        System.out.println("el precio final es: "+precioFinal);

    }
}
