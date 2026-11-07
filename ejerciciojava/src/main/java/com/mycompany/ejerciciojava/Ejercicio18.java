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

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lado, perimetro, area;

        System.out.print("Ingrese la medida de un lado: ");
        lado = teclado.nextDouble();

        if (lado >= 0) {
            perimetro = 4 * lado;
            area = lado * lado;

            System.out.println("Perimetro del cuadrado: " + perimetro);
            System.out.println("Area del cuadrado: " + area);
        } else {
            System.out.println("El lado no puede ser negativo.");
        }

        teclado.close();
    }
} 
    

