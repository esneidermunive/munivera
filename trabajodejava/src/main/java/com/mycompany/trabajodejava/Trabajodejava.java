/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajodejava;

import java.util.Scanner;

/**     
 *
 * @author Usuario
 */
public class Trabajodejava {

    public static void main(String[] args) {
        System.out.println("Hello World! ");
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("===== TALLER DE EJERCICIOS JAVA =====");
        System.out.println("1. Salario neto y retencion");
        System.out.println("2. Valor de una hora trabajada");
        System.out.println("3. Nota minima del tercer corte");
        System.out.println("4. Area de un triangulo");
        System.out.println("5. Perimetro de un triangulo");
        System.out.println("6. Celsius a Fahrenheit");
        System.out.println("7. Fahrenheit a Celsius");
        System.out.println("8. Millas marinas a metros");
        System.out.println("9. Porcentaje de descuento");
        System.out.println("10. Calcular IVA");
        System.out.println("11. Operaciones matematicas");
        System.out.println("12. Ultima cifra de un numero");
        System.out.println("13. Centimetros a pulgadas");
        System.out.println("14. Segundos a horas, minutos y segundos");
        System.out.println("15. Precio total de articulos");
        System.out.println("16. Area de un circulo");
        System.out.println("17. Area y perimetro de un rectangulo");
        System.out.println("18. Area y perimetro de un cuadrado"); 
        System.out.print("\nElige un ejercicio del 1 al 18: ");
        int opcion = teclado.nextInt();

        double a, b, c, resultado;

        switch (opcion) {

            case 1:
                System.out.print("Valor de una hora: ");
                a = teclado.nextDouble();
                System.out.print("Horas trabajadas: ");
                b = teclado.nextDouble();

                resultado = a * b;
                double retencion = resultado * 0.05;

                System.out.println("Salario total: $" + resultado);
                System.out.println("Retencion del 5%: $" + retencion);
                System.out.println("Salario neto: $" + (resultado - retencion));
                break;

            case 2:
                System.out.print("Salario total mensual: ");
                a = teclado.nextDouble();
                System.out.print("Horas trabajadas: ");
                b = teclado.nextDouble();

                if (b > 0) {
                    System.out.println("Valor por hora: $" + (a / b));
                } else {
                    System.out.println("Las horas deben ser mayores que cero.");
                }
                break;

            case 3:
                System.out.print("Nota del primer corte (0 a 5): ");
                a = teclado.nextDouble();
                System.out.print("Nota del segundo corte (0 a 5): ");
                b = teclado.nextDouble();

                resultado = (3.0 - a * 0.20 - b * 0.20) / 0.60;

                if (resultado <= 0) {
                    System.out.println("Ya alcanzaste la nota minima.");
                } else if (resultado <= 5) {
                    System.out.println("Necesitas sacar " + resultado
                            + " en el tercer corte.");
                } else {
                    System.out.println("No es posible aprobar con esas notas.");
                }
                break;

            case 4:
                System.out.print("Base del triangulo: ");
                a = teclado.nextDouble();
                System.out.print("Altura del triangulo: ");
                b = teclado.nextDouble();

                System.out.println("Area: " + (a * b / 2));
                break;

            case 5:
                System.out.print("Primer lado: ");
                a = teclado.nextDouble();
                System.out.print("Segundo lado: ");
                b = teclado.nextDouble();
                System.out.print("Tercer lado: ");
                c = teclado.nextDouble();

                System.out.println("Perimetro: " + (a + b + c));
                break;

            case 6:
                System.out.print("Temperatura en Celsius: ");
                a = teclado.nextDouble();

                resultado = (a * 9 / 5) + 32;
                System.out.println("Temperatura en Fahrenheit: " + resultado);
                break;

            case 7:
                System.out.print("Temperatura en Fahrenheit: ");
                a = teclado.nextDouble();

                resultado = (a - 32) * 5 / 9;
                System.out.println("Temperatura en Celsius: " + resultado);
                break;

            case 8:
                System.out.print("Millas marinas: ");
                a = teclado.nextDouble();

                System.out.println("Metros: " + (a * 1852));
                break;

            case 9:
                System.out.print("Precio de tarifa: ");
                a = teclado.nextDouble();
                System.out.print("Precio pagado: ");
                b = teclado.nextDouble();

                if (a > 0) {
                    resultado = ((a - b) / a) * 100;
                    System.out.println("Porcentaje de descuento: "
                            + resultado + "%");
                } else {
                    System.out.println("La tarifa debe ser mayor que cero.");
                }
                break;

            case 10:
                System.out.print("Precio del articulo: ");
                a = teclado.nextDouble();

                // Se utiliza el 19% como ejemplo de IVA.
                resultado = a * 0.19;
                System.out.println("Valor del IVA (19%): $" + resultado);
                break;

            case 11:
                System.out.print("Primer numero entero: ");
                int n1 = teclado.nextInt();
                System.out.print("Segundo numero entero: ");
                int n2 = teclado.nextInt();

                System.out.println("Suma: " + (n1 + n2));
                System.out.println("Resta: " + (n1 - n2));
                System.out.println("Multiplicacion: " + (n1 * n2));

                if (n2 != 0) {
                    System.out.println("Division: " + ((double) n1 / n2));
                    System.out.println("Modulo: " + (n1 % n2));
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;

            case 12:
                System.out.print("Introduce un numero entero: ");
                int numero = teclado.nextInt();

                System.out.println("Ultima cifra: " + Math.abs(numero % 10));
                break;

            case 13:
                System.out.print("Centimetros: ");
                a = teclado.nextDouble();

                System.out.println("Pulgadas: " + (a / 2.54));
                break;

            case 14:
                System.out.print("Tiempo total en segundos: ");
                int segundos = teclado.nextInt();

                int horas = segundos / 3600;
                int minutos = (segundos % 3600) / 60;
                int segundosRestantes = segundos % 60;

                System.out.println("Horas: " + horas);
                System.out.println("Minutos: " + minutos);
                System.out.println("Segundos: " + segundosRestantes);
                break;

            case 15:
                System.out.print("Precio por unidad: ");
                a = teclado.nextDouble();
                System.out.print("Cantidad de articulos: ");
                b = teclado.nextDouble();

                System.out.println("Valor total: $" + (a * b));
                break;

            case 16:
                System.out.print("Radio del circulo: ");
                a = teclado.nextDouble();

                resultado = Math.PI * a * a;
                System.out.println("Area del circulo: " + resultado);
                break;

            case 17:
                System.out.print("Longitud del rectangulo: ");
                a = teclado.nextDouble();
                System.out.print("Ancho del rectangulo: ");
                b = teclado.nextDouble();

                System.out.println("Area: " + (a * b));
                System.out.println("Perimetro: " + (2 * a + 2 * b));
                break;

            case 18:
                System.out.print("Lado del cuadrado: ");
                a = teclado.nextDouble();

                System.out.println("Area: " + (a * a));
                System.out.println("Perimetro: " + (4 * a));
                break;

            default:
                System.out.println("Opcion no valida. Elige del 1 al 18.");
        }
    }
    
}
