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

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double radio, area;

        System.out.print("Ingrese el radio del circulo: ");
        radio = teclado.nextDouble();

        if (radio >= 0) {
            area = Math.PI * radio * radio;

            System.out.println("El area del circulo es: " + area);
        } else {
            System.out.println("El radio no puede ser negativo.");
        }

        teclado.close();
    }
} 
    

