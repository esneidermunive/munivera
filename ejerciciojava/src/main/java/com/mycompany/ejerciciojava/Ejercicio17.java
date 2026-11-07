/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciojava;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double ladoA, ladoB, perimetro, area;

        System.out.print("Ingrese el primer lado: ");
        ladoA = teclado.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        ladoB = teclado.nextDouble();

        if (ladoA >= 0 && ladoB >= 0) {
            perimetro = 2 * ladoA + 2 * ladoB;
            area = ladoA * ladoB;

            System.out.println("Perimetro del rectangulo: " + perimetro);
            System.out.println("Area del rectangulo: " + area);
        } else {
            System.out.println("Los lados no pueden ser negativos.");
        }

        teclado.close();
    }
} 
    

