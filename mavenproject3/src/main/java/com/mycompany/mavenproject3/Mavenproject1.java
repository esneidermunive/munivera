/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;
import java.util.Scanner;

/**
 *
 * @author esneider
 */
public class Mavenproject1 {

   public static void main(String[] args) {
        // Creamos el objeto Scanner para leer los datos ingresados por teclado
        Scanner teclado=new Scanner(System.in);

        // Declaración de variables para los lados, perímetro y área
        double L1, L2, L3, P, A;

        System.out.println("--- Calculadora de Perimetro y Area de Triangulo ---");
        
        // Solicitamos los valores de los lados
        System.out.print("Ingrese el valor de L1: ");
        L1 = teclado.nextDouble();

        System.out.print("Ingrese el valor de L2: ");
        L2 = teclado.nextDouble();

        System.out.print("Ingrese el valor de L3 (base): ");
        L3 = teclado.nextDouble();

        // Fórmulas de la pizarra:
        // P = L1 + L2 + L3
        P = L1 + L2 + L3;

        // A = (L3 * L2) / 2
        A = (L3 * L2) / 2;

        // Mostramos los resultados en pantalla
        System.out.println("\n--- Resultados ---");
        System.out.println("El Perimetro es: " + P);
        System.out.println("El Area es: " + A);
    }
}
