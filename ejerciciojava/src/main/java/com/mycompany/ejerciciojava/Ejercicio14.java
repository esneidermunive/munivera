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

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int segundos, horas, minutos, segundosRestantes;

        System.out.print("Ingrese el tiempo en segundos: ");
        segundos = teclado.nextInt();

        if (segundos >= 0) {
            horas = segundos / 3600;
            minutos = (segundos % 3600) / 60;
            segundosRestantes = segundos % 60;

            System.out.println("Horas: " + horas);
            System.out.println("Minutos: " + minutos);
            System.out.println("Segundos: " + segundosRestantes);
        } else {
            System.out.println("Ingrese un tiempo positivo.");
        }

        teclado.close();
    }
}
    

