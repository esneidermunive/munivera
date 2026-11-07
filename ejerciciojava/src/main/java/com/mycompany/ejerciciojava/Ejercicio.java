/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciojava;

/**
 *
 * @author esneider munive
 */
import java.util.Scanner;

/**
 * 
 * @author esneider munive
 */
public class Ejercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorHora, horasTrabajadas;
        double salarioTotal, retencion, salarioNeto;

        System.out.print("Ingrese el valor de la hora: ");
        valorHora = teclado.nextDouble();

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = teclado.nextDouble();

        salarioTotal = valorHora * horasTrabajadas;
        retencion = salarioTotal * 0.05;
        salarioNeto = salarioTotal - retencion;

        System.out.println("Salario total: $" + salarioTotal);
        System.out.println("Retencion del 5%: $" + retencion);
        System.out.println("Salario neto: $" + salarioNeto);  

        teclado.close();
    }
}
    

