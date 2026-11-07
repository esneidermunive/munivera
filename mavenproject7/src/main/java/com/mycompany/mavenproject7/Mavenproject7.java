/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Mavenproject7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        
        double precioTarifa,precioPagado;
        
        System.out.println("Ingrese precio de la tarifa");
        precioTarifa = teclado.nextDouble();
        
        System.out.println("Ingrese el precio pagado");
        precioPagado = teclado.nextDouble();
        
        double descuento = (precioTarifa - precioPagado) / precioTarifa * 100;
       
        System.out.println("ingrese el resultado final" + descuento);
        
        
        
        
    }
}
