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
public class P15IntercambiarValores {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        double A;
        double B;
        
        System.out.print("Ingrese el valor de A: ");
        A = scan.nextDouble();
        
        System.out.print("Ingrese el valor de B: ");
        B = scan.nextDouble();
        
        A = A+B;
        B = A-B;
        A = A-B;
        
        System.out.println("El nuevo valor de A es: " + A);
        System.out.println("El nuevo valor de B es: " + B);

    }
}
