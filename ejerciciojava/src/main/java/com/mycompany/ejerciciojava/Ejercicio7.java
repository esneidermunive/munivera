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

 public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.print("Ingrese los grados Fahrenheit: ");
        fahrenheit = teclado.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperatura en Celsius: " + celsius);

        teclado.close();
    }
} 
    

