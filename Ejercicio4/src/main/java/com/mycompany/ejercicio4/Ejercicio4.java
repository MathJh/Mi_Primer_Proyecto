/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author Mathias Andres Jimenez Herrera
 */
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nota;
        System.out.println("ingrese la nota:");
        nota=sc.nextDouble();
        if (nota>=7){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
    }
}
