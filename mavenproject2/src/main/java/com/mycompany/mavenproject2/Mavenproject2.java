/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner (System.in);
        
        double nota1,nota2,nota3, notafinal;
        
        System.out.println("Por favor digite la primera nota");
        nota1=teclado.nextDouble();
        
         System.out.println("Por favor digite la segunda nota");
        nota2=teclado.nextDouble();
        
         System.out.println("Por favor digite la tercera nota");
        nota3=teclado.nextDouble();
        
        notafinal= ((nota1*0.2) +(nota2*0.2)+(nota3*0.6));
        
        System.out.println(nota1*0.2);
        System.out.println(nota2*0.2);
        System.out.println(nota3*0.6);
        System.out.println(notafinal);
    }
}

    