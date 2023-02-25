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
public class P01Saludo {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String nombre = "";
        
        System.out.println("Ingrese su nombre: ");
        nombre = scan.nextLine();
        
        System.out.println("Hola " + nombre);
    }
}
