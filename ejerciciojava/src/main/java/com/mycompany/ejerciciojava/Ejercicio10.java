/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciojava;

/**
 *
 * @author esneider munive
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double precio, iva, total;

        System.out.print("Ingrese el precio del articulo: ");
        precio = teclado.nextDouble();

        iva = precio * 0.19;
        total = precio + iva;

        System.out.println("Precio del articulo: $" + precio);
        System.out.println("Valor del IVA (19%): $" + iva);
        System.out.println("Precio total con IVA: $" + total);

        teclado.close();
    }
} 
    

