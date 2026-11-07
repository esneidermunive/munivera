/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;

/**
 *
 * @author esneider munive
 */
import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
     Scanner teclado = new Scanner(systen.in);
      System.out.println("ingrese el valor de su compra");
      double total = teclado.nextDouble();
      double IVA = total -total / 1.19;
        System.out.println("el valor del IVA es" + IVA);    
    }
}
