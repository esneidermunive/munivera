/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciojava;

/**
 *
 * @author esneider munive
 */
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = teclado.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

        teclado.close();
    }
} 
    
