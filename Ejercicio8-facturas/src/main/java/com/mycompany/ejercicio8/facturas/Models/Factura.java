/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8.facturas.Models;

/**
 *
 * @author Manuel González Vaz
 */
public class Factura {

    private String codigo = "";
    private double kilos = 0;
    private double precioKilo = 0;
    private double importe = 0;

    public Factura() {
    }

    public Factura(String codigo, double kilos, double precioKilo, double importe) {
        this.codigo=codigo;
        this.kilos=kilos;
        this.precioKilo=precioKilo;
        this.importe=importe;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public double getPrecioKilo() {
        return precioKilo;
    }

    public void setPrecioKilo(double precioKilo) {
        this.precioKilo = precioKilo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + "\nkilos=" + kilos + "\nprecioKilo=" + precioKilo + "\nimporte=" + importe + '}';
    }
    
    
}
