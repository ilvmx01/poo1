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
public class Inventario {
    private Producto[] productos;
    private int contador;

    public Inventario(int tamaño) {
        productos = new Producto[tamaño];
        contador = 0;
    }

    public void agregarProducto(Producto producto) {
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
            System.out.println("Producto agregado exitosamente.");
        } else {
            System.out.println("Inventario lleno. No se puede agregar más productos.");
        }
    }

    public Producto buscarProductoPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getId() == id) {
                return productos[i];
            }
        }
        return null;
    }

    public void ordenarPorNombre() {
        quickSort(productos, 0, contador - 1, "nombre");
        System.out.println("Productos ordenados por nombre exitosamente.");
    }

    public void ordenarPorPrecio() {
        quickSort(productos, 0, contador - 1, "precio");
        System.out.println("Productos ordenados por precio exitosamente.");
    }

    private void quickSort(Producto[] array, int low, int high, String criterio) {
        if (low < high) {
            int pi = partition(array, low, high, criterio);
            quickSort(array, low, pi - 1, criterio);
            quickSort(array, pi + 1, high, criterio);
        }
    }

    private int partition(Producto[] array, int low, int high, String criterio) {
        Producto pivot = array[high]; //elegemimos el ultimo elemento como pivote
        int i = (low - 1); //indice del elemento mas pequeño
        for (int j = low; j < high; j++) {
            boolean condition;
            if (criterio.equals("nombre")) {
                condition = array[j].getNombre().compareTo(pivot.getNombre()) < 0;
            } else {
                condition = array[j].getPrecio() < pivot.getPrecio();
            }
            if (condition) {
                i++;
                // intercambiamos array[i] y array[j]
                Producto temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Intercambiamos array[i + 1] y array[high] (o el pivote)
        Producto temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public void mostrarInventario() {
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }
    
    
    
}
