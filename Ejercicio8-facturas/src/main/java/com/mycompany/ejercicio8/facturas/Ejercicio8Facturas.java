/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio8.facturas;

import com.mycompany.ejercicio8.facturas.Models.Factura;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * El programa es para gestionar facturas de una empresa azucarera, que se
 * encarga de la venta por kilos; la factura pedirá el código del producto, la
 * cantidad de kilos, el precio por cada kilo, y el importe de esa factura.
 * Además, por cada 5 facturas, nos dirá cuál de ellas sobrepasó la cantidad de
 * $1000, y nos dará la facturación total de esas 5 facturas.
 *
 * @author Manuel González Vaz
 */
public class Ejercicio8Facturas {

    public static void main(String[] args) {

        String codigo = "";
        double kilos = 0;
        double precioKilo = 0;
        double importe = 0;
        Scanner sc = new Scanner(System.in);
        List<Factura> facturas = new ArrayList<>();
        
        double facturacionTotal = 0;
        double kilosTotal = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura " + i);
            System.out.println("Introduzca el codigo");
            codigo = sc.nextLine();
            System.out.println("Introduzca los kilos del pedido");
            kilos = sc.nextDouble();
            System.out.println("Introduzca el precio por kilo");
            precioKilo = sc.nextDouble();
            
            //Consumir el salto de línea restante después de nextDouble()
            sc.nextLine();
            
            importe = kilos * precioKilo;
            facturacionTotal += importe;
            kilosTotal += kilos;

            Factura factura = new Factura();
            factura.setCodigo(codigo);
            factura.setKilos(kilos);
            factura.setPrecioKilo(precioKilo);
            factura.setImporte(importe);

            facturas.add(factura);
        }
        System.out.println("La facturacion total es de: " + facturacionTotal
                + "\nLos kilos facturados totales son: " + kilosTotal);
        
        System.out.println("Las facturas que sobrepasan los 1000$ son: ");
        for (Factura elemento : facturas) {
            if (elemento.getImporte() >= 1000) {
                System.out.println("Factura con codigo: " + elemento.getCodigo());
            }
        }

    }
}
