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
public class P18Iniciales {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String name1;
        String name2;
        String ape1;
        String ape2;
        
        System.out.print("Ingrese su primer nombre: ");
        name1 = scan.nextLine();
        
        System.out.print("Ingrese su segundo nombre: ");
        name2 = scan.nextLine();
        
        System.out.print("Ingrese su primer apellido: ");
        ape1 = scan.nextLine();
        
        System.out.print("Ingrese su segundo apellido: ");
        ape2 = scan.nextLine();
        
        System.out.println("Sus siglas son: " + name1.toUpperCase().charAt(0) + name2.toUpperCase().charAt(0) + ape1.toUpperCase().charAt(0) + ape2.toUpperCase().charAt(0));
    }
}
