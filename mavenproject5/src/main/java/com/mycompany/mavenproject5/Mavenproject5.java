/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Mavenproject5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner teclado = new Scanner(System.in);
         
        int num1, num2;
        
        System.out.println("ingrese el primer numero: ");
         num1 = teclado.nextInt();
         
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        
        int suma, resta, multiplicacion, division;
         
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
       division = num1 / num2;
       
        
        
        
    }
}
