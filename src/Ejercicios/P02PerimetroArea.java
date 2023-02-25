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
public class P02PerimetroArea {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String comprobar = "";
        double base;
        double altura;
        double perimetro;
        double area;
        
        System.out.println("Ingrese la base del rectagulo:");
        comprobar = scan.nextLine();
        
        while(comprobar.matches("[^0-9]+")){
            System.out.println("Ingrese un número como base:");
            comprobar = scan.nextLine();
        }
        
        base = Double.parseDouble(comprobar);
        
        System.out.println("Ingrese la altura del rectagulo:");
        comprobar = scan.nextLine();
        
        while(comprobar.matches("[^0-9]+")){
            System.out.println("Ingrese un número como base:");
            comprobar = scan.nextLine();
        }
        
        altura = Double.parseDouble(comprobar);
        
        area = base*altura;
        
        perimetro = base*2+altura*2;
        
        System.out.println("La área del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
    
}
