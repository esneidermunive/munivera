/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciojava;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double precioUnidad, total;
        int cantidad;

        System.out.print("Ingrese el precio por unidad: ");
        precioUnidad = teclado.nextDouble();

        System.out.print("Ingrese la cantidad de articulos: ");
        cantidad = teclado.nextInt();

        if (precioUnidad >= 0 && cantidad >= 0) {
            total = precioUnidad * cantidad;

            System.out.println("Cantidad de articulos: " + cantidad);
            System.out.println("Precio por unidad: $" + precioUnidad);
            System.out.println("Valor total a pagar: $" + total);
        } else {
            System.out.println("Ingrese valores validos.");
        }

        teclado.close();
    }
} 
    
 
