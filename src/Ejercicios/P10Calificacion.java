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
public class P10Calificacion {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        double parcial1;
        double parcial2;
        double parcial3;
        double examenFinal;
        double trabajoFinal;
        double promedioParciales;
        double calificacion;
    
        System.out.print("Ingrese la nota de su primer parcial: ");
        parcial1 = scan.nextDouble();
        
        System.out.print("Ingrese la nota de su segundo parcial: ");
        parcial2 = scan.nextDouble();
        
        System.out.print("Ingrese la nota de su tercer parcial: ");
        parcial3 = scan.nextDouble();
        
        promedioParciales = (parcial1 + parcial2 + parcial3) /3;
        
        System.out.print("Ingrese la nota de su examen final: ");
        examenFinal = scan.nextDouble();
        
        System.out.print("Ingrese la nota de su trabajo final: ");
        trabajoFinal = scan.nextDouble();
        
        calificacion = promedioParciales*0.55 + examenFinal*0.3 + trabajoFinal*0.15;
        
        System.out.println("Su calificacion final es " + calificacion);
    }
}
