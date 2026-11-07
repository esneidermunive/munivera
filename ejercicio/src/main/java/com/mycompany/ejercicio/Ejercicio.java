/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
      
        double centimetros, pulgadas;
      
        System.out.println("Ingrese sus centimetros: ");
        
        centimetros=teclado.nextDouble();
        
        pulgadas=centimetros /2.54;
        
        System.out.println("Sus centimetros a pulgadas es:"+ pulgadas);
    }
}
