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
public class P03Hipotenusa {
    
    public static void main(String[] args){
        
       Scanner scan = new Scanner(System.in);
       
       String comprobar;
       double cateto1;
       double cateto2;
       double hipotenusa;
       
       System.out.println("Ingrese un cateto del triangulo:");
       comprobar = scan.nextLine();
       
       while(comprobar.matches("[^0-9]+")){
            System.out.println("El cateto debe de ser un número positivo: ");
            comprobar = scan.nextLine();
       }
       
       cateto1 = Double.parseDouble(comprobar);
       
       System.out.println("Ingrese el otro cateto del triangulo:");
       comprobar = scan.nextLine();
       
       while(comprobar.matches("[^0-9]+")){
            System.out.println("El cateto debe de ser un número positivo: ");
            comprobar = scan.nextLine();
       }
       
       cateto2 = Double.parseDouble(comprobar);
       
       hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
       hipotenusa = Math.sqrt(hipotenusa);
       
       System.out.println("La hipotenusa del triangulo es: " + hipotenusa);
    }
}
