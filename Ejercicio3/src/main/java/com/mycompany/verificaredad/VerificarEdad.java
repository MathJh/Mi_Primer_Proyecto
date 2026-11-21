/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificaredad;

/**
 *
 * @author Mathias Andres Jimenez Herrera
 */
import java.util.Scanner;
public class VerificarEdad {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad de una persona:");
        edad=sc.nextInt();
        if (edad>=18){
            System.out.println("Es mayor de edad");
        }
    }
}
