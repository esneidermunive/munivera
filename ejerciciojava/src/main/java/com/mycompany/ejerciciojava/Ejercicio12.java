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

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, ultimaCifra;

        System.out.print("Ingrese un numero entero: ");
        numero = teclado.nextInt();

        ultimaCifra = Math.abs(numero % 10);

        System.out.println("La ultima cifra es: " + ultimaCifra);

        teclado.close();
    }
}
    

