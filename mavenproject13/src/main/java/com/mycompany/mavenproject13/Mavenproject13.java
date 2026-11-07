/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject13;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Mavenproject13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double celcio;
        
         System.out.println("Ingrese el valor de grados celcio");
         celcio = teclado.nextDouble();
         
         double farengie = (celcio * 1.8) + 32;
         
         System.out.println("El valor de grados farengie es: " + farengie);
         
         
         
         
    }
}
