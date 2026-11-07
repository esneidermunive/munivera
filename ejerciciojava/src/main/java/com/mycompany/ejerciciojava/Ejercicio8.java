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

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double millas, metros;

        System.out.print("Ingrese la cantidad de millas marinas: ");
        millas = teclado.nextDouble();

        metros = millas * 1852;

        System.out.println("Distancia en metros: " + metros);

        teclado.close();
    }
} 
    

