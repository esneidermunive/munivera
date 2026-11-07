/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Mavenproject9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double horasTrabajadas, valorDeHora, salarioTotal;
        
        System.out.println("Ingrese las horas Trabajadas");
        horasTrabajadas = teclado.nextDouble();
        
        System.out.println("Ingrese el salario Total");
        salarioTotal = teclado.nextDouble();
        
        valorDeHora = salarioTotal / horasTrabajadas;
        
        System.out.println("El valor de Hora es: " + valorDeHora);
         
    }
}
