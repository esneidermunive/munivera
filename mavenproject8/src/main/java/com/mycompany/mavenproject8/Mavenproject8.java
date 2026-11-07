/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Mavenproject8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double horasTrabajadas, valorDeHoras;
        double retencion, salarioNeto, salarioTotal;
        
        System.out.println("Ingrese las horas trabajadas ");
        horasTrabajadas = teclado.nextDouble();
        
        System.out.println("Ingrese el valor de horas");
        valorDeHoras = teclado.nextDouble();
        
   salarioTotal = horasTrabajadas * valorDeHoras;
   retencion = salarioTotal * 0.05;
   salarioNeto = salarioTotal - retencion;
   
        System.out.println("El salario Total es: " + salarioTotal);
        System.out.println("La retencion es: " + retencion);
        System.out.println("El salario Neto es: " + salarioNeto);
        
        
     
      
          
    }
}
