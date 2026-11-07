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

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.print("Ingrese el primer numero entero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        num2 = teclado.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + ((double) num1 / num2));
            System.out.println("Resto o modulo: " + (num1 % num2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        teclado.close();
    }
} 
    

