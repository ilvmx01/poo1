/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ilvmx.dpo1u4ea;

/**
 *
 * @author israellaravega
 * UNADM
 * Programación Orientada a Objetos 1
 * Grupo: DS-DPO1-2401-B2-002
 * Unidad 4: Evidencia de Aprendizaje
 *
 */
public class Producto { //atributos
    private int id;
    private String nombre;
    private int cantidad;
    private double precio;
    //constructor para inicializar los atributos
    public Producto(int id, String nombre, int cantidad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        
    }
    //metodos de la clase
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    @Override //sobreescribimos el metodo toString de la clase Object para mostrar cadena de caracteres como se pide
    public String toString() {
        return "Producto [ID=" + id + ", NOMBRE=" + nombre + ", CANTIDAD=" + cantidad + ", PRECIO=" + precio + "]";
        
    }
    
}
