/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author esneider munive
 */
/*public class mayorEdad import java.util.Scanner;*/

public class MayorEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digita tu edad");
        int edad = teclado.nextInt();
        
        if (edad >= 18) {
            System.out.println("La persona es Mayor");
        } else {
            System.out.println("No es Mayor");
        }
        
        teclado.close();
    }
}
    

