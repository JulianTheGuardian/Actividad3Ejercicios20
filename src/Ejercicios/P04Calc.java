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
public class P04Calc {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double n1;
        double n2;
        
        System.out.println("Ingrese un numero:");
        n1 = scan.nextDouble();
        
        System.out.println("Ingrese otro numero:");
        n2 = scan.nextDouble();
        
        System.out.println("La suma del los numeros es: " + (n1+n2));
        System.out.println("La resta del los numeros es: " + (n1-n2));
        System.out.println("La multiplicacion del los numeros es: " + (n1*n2));
        
        if(n2 != 0){
        System.out.println("La division del los numeros es: " + (n1/n2));
        }
        else{
            System.out.println("No se peude dividir entre 0");
        }
    }
}
