/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Mavenproject11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double base, altura;
        
        System.out.println("Ingrese la base");
        base = teclado.nextDouble();
        
        System.out.println("Ingrese la altura");
        altura = teclado.nextDouble();
        
        double area = (base * altura) /2;
        
        System.out.println("El area Del Triangulo es: " + area);
        
        
    }
}
