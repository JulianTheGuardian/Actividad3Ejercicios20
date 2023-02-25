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
public class P07Tiempo {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int min;
        int hora;
        
        System.out.println("Ingrese la cantidad de minutos a convertir: ");
        min = scan.nextInt();
        
        hora = min/60;
        min = min%60;
        
        System.out.println("Esos minutos equivalen a " + hora + " horas con " + min + " minutos.");

    }
}
