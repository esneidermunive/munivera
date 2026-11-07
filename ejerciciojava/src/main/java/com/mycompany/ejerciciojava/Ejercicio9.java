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

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double precioTarifa, precioPagado;
        double descuento, porcentaje;

        System.out.print("Ingrese el precio de tarifa: ");
        precioTarifa = teclado.nextDouble();

        System.out.print("Ingrese el precio pagado: ");
        precioPagado = teclado.nextDouble();

        if (precioTarifa > 0 && precioPagado >= 0
                && precioPagado <= precioTarifa) {
            descuento = precioTarifa - precioPagado;
            porcentaje = (descuento / precioTarifa) * 100;

            System.out.println("Valor descontado: $" + descuento);
            System.out.println("Porcentaje de descuento: "
                    + porcentaje + "%");
        } else {
            System.out.println("Los precios ingresados no son validos.");
        }

        teclado.close();
    }
} 
    

