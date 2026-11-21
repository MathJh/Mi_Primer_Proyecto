/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

/**
 *
 * @author Mathias Andres Jimenez Herrera
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contrasena;

        do {
            System.out.println("Ingrese la contraseña:");
            contrasena = sc.nextLine();

            if (!contrasena.equals("java2026")) {
                System.out.println("Contraseña incorrecta. Intente de nuevo.");
            }
        } while (!contrasena.equals("java2026"));

        System.out.println("Acceso concedido.");
    }
}