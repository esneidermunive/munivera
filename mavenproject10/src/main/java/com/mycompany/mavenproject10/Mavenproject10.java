/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Mavenproject10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double primerCorte, segundoCorte;
        
        System.out.println("Ingrese el primer Corte");
        primerCorte = teclado.nextDouble();
        
        System.out.println("Ingrese el segundo Corte");
        segundoCorte = teclado.nextDouble();
        
        double sumaDeLosDosCortes = (primerCorte * 0.20) + (segundoCorte * 0.20); 
         double loQueFalta = 3.0 - sumaDeLosDosCortes;
         
         double tercerCorte = loQueFalta / 0.60;
         
         System.out.println("La nota minima Que necesitas es: " + tercerCorte);
         
         
        
        
    }
}
