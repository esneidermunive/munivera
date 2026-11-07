/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject14;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Mavenproject14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double farengie;
        
        System.out.println("Ingrese el valor de grados farengie");
        farengie = teclado.nextDouble();
        
        double celcio = (farengie - 32) / 1.8;
        
        System.out.println("El valor de grados celcio es: " + celcio);
        
    }
}
