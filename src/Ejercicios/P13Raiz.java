/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P13Raiz {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        double n;
        
        System.out.println("Ingrese un numero: ");
        n = scan.nextDouble();
         
        System.out.println("La raiz cuadrada de " + n + " es: " + Math.sqrt(n));
        System.out.println("La raiz cubica de " + n + " es: " + Math.cbrt(n));
    }
}
