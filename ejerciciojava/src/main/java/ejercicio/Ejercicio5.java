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

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lado1, lado2, lado3, perimetro;

        System.out.print("Ingrese el primer lado: ");
        lado1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        lado2 = teclado.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        lado3 = teclado.nextDouble();

        perimetro = lado1 + lado2 + lado3;

        System.out.println("El perimetro del triangulo es: " + perimetro);

        teclado.close();
    }
}
    

