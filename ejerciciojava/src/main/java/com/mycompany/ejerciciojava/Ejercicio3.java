/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciojava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, notaMinima;

        System.out.print("Ingrese la nota del primer corte: ");
        nota1 = teclado.nextDouble();

        System.out.print("Ingrese la nota del segundo corte: ");
        nota2 = teclado.nextDouble();

        notaMinima = (3.0 - nota1 * 0.20 - nota2 * 0.20) / 0.60;

        if (notaMinima <= 0) {
            System.out.println("Ya tiene la nota necesaria para aprobar.");
        } else if (notaMinima > 5.0) {
            System.out.println("No es posible aprobar con una nota maxima de 5.0.");
            System.out.println("Necesita sacar: " + notaMinima);
        } else {
            System.out.println("Nota minima necesaria en el tercer corte: "
                    + notaMinima);
        }

        teclado.close();
    }
}
    


