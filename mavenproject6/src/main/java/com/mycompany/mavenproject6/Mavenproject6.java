/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Mavenproject6 {
   
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
      double centimetros, pulgadas;
      
        System.out.println("Ingrese sus centimetros");
        
        centimetros=teclado.nextDouble();
        
        pulgadas=centimetros /2.54;
        
        System.out.println("Sus centimetros a pulgadas es:"+ pulgadas);
        
     
    }
}
