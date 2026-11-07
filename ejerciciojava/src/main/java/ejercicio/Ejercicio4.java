/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author esneider munive
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.print("Ingrese la base del triangulo: ");
        base = teclado.nextDouble();

        System.out.print("Ingrese la altura del triangulo: ");
        altura = teclado.nextDouble();

        area = (base * altura) / 2;

        System.out.println("El area del triangulo es: " + area);

        teclado.close();
    }
}
    

