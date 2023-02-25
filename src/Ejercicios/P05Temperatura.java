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
public class P05Temperatura {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double fah;
        double cel;
        
        System.out.println("Ingrese la temperatura en Fahrenheit:");
        fah = scan.nextDouble();
        
        cel = (fah-32)/1.8;
        
        System.out.println("La temperatura en celcius es: " + cel);
    }
}
