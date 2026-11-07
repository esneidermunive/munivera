/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject12;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Mavenproject12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double lado1, lado2, lado3;
        
        System.out.println("Ingrese el primer lado");
        lado1 = teclado.nextDouble();
        
        System.out.println("Ingrese el segundo lado");
        lado2 = teclado.nextDouble();
        
        System.out.println("Ingrese el tercer lado");
        lado3 = teclado.nextDouble();
        
         double perimetro = lado1 + lado2 + lado3;
         
        System.out.println("El perimetro De un Triangulo es: " + perimetro);
        
         
         
    }
}
