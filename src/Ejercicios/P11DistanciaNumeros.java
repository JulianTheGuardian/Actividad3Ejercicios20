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
public class P11DistanciaNumeros {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int n1;
        int n2;
        int distancia;
        
        System.out.print("Ingrese un numero entero: ");
        n1 = scan.nextInt();
        
        System.out.print("Ingrese otro numero entero: ");
        n2 = scan.nextInt();
        
        distancia = Math.abs(n1-n2);
        
        System.out.println("La distancia entre " + n1 + " y " + n2 + " es " + distancia);
    }
}
