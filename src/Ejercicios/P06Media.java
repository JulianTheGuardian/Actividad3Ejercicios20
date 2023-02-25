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
public class P06Media {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double n1;
        double n2;
        double n3;
        double media;
        
        System.out.println("Ingrese el primer numero: ");
        n1 = scan.nextDouble();
        
        System.out.println("Ingrese el segundo numero: ");
        n2 = scan.nextDouble();
        
        System.out.println("Ingrese el tercer numero: ");
        n3 = scan.nextDouble();
        
        media = (n1 + n2 + n3)/3;
        
        System.out.println("La media de los 3 numeros es: " + media);
    }
}
