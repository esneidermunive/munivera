/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Mavenproject4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner teclado = new Scanner(System.in);
        
        double celcius, farengie;
        
        System.out.print("ingrese la temperatura de grados celcius:");
        celcius = teclado.nextDouble();
        
        double farengei = celcius * 9/5 + 32;
        
        System.out.print("temperatura de farengei:" + farengei);
        
    }
}
