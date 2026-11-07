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

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double centimetros, pulgadas;

        System.out.print("Ingrese la medida en centimetros: ");
        centimetros = teclado.nextDouble();

        pulgadas = centimetros / 2.54;

        System.out.println("Medida en pulgadas: " + pulgadas);

        teclado.close();
    }
} 
    

