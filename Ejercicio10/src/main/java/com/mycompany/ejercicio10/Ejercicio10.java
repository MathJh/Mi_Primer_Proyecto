/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

/**
 *
 * @author Mathias Andres Jimenez Herrera
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el número " + i + ":");
            numero = sc.nextInt();
            suma = suma + numero;
        }
        promedio = suma / 10.0;
        System.out.println("----- RESULTADOS -----");
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
