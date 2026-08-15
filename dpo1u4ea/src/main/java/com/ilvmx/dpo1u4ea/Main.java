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
import java.util.Scanner; //importamos libreria para usar la funcion de escaneo de teclado

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario(100);  // Suponemos un tamaño máximo de 100 productos

        while (true) {
            System.out.println("=== Sistema de Gestión de Inventario ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto por ID");
            System.out.println("3. Ordenar productos por nombre");
            System.out.println("4. Ordenar productos por precio");
            System.out.println("5. Mostrar inventario completo");
            System.out.println("6. Salir");
            System.out.println("========================================");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("== Agregar Producto ==");
                    System.out.print("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    Producto producto = new Producto(id, nombre, cantidad, precio);
                    inventario.agregarProducto(producto);
                    break;

                case 2:
                    System.out.println("== Buscar Producto por ID ==");
                    System.out.print("Ingrese el ID del producto a buscar: ");
                    int idBuscar = scanner.nextInt();
                    Producto encontrado = inventario.buscarProductoPorId(idBuscar);
                    if (encontrado != null) {
                        System.out.println("Producto encontrado: " + encontrado);
                    } else {
                        System.out.println("Producto NO encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("== Ordenar Productos por Nombre ==");
                    inventario.ordenarPorNombre();
                    break;

                case 4:
                    System.out.println("== Ordenar Productos por Precio ==");
                    inventario.ordenarPorPrecio();
                    break;

                case 5:
                    System.out.println("== Inventario Completo ==");
                    inventario.mostrarInventario();
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
    
    
}
