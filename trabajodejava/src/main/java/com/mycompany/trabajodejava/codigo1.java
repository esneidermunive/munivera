/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajodejava;

import java.util.Scanner;

/**
 *
 * @author esnieder munive
 */
public class codigo1 {

    public class Ejercicio1 {

        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Valor de la hora: ");
                double valorHora = sc.nextDouble();

                System.out.print("Horas trabajadas: ");
                double horas = sc.nextDouble();

                double salarioTotal = valorHora * horas;
                double retencion = salarioTotal * 0.05;
                double salarioNeto = salarioTotal - retencion;

                System.out.println("Salario total: " + salarioTotal);
                System.out.println("Retencion: " + retencion);
                System.out.println("Salario neto: " + salarioNeto);
            }
        }
    }
}
