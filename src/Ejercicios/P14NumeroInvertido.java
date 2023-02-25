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
public class P14NumeroInvertido {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String n;
        String reversa = "";
        
        System.out.print("Ingrese el numero a dar vuelta: ");
        n = scan.nextLine();
        
        for (int i = n.length()-1; i >= 0; i--) {
            reversa = reversa + n.charAt(i);
        }
        
        System.out.println("El numero dado vuelta es: " + reversa);
    }
}
