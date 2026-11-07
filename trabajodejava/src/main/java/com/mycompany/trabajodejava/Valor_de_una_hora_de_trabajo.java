/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajodejava;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class Valor_de_una_hora_de_trabajo {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int opcion = 1;
    double a,b,resultado,retencion;
      switch (opcion) {
     case 1 -> {
         System.out.print("Valor de una hora: ");
         a = teclado.nextDouble();
         System.out.print("Horas trabajadas: ");
         b = teclado.nextDouble();
         
         resultado = a * b;
         retencion = resultado * 0.05;
         
         System.out.println("Salario total: $" + resultado);
         System.out.println("Retencion del 5%: $" + retencion);
         System.out.println("Salario neto: $" + (resultado - retencion));
        }
    }
 }}
