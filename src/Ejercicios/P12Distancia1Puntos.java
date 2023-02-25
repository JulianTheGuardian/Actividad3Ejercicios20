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
public class P12Distancia1Puntos {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int x1;
        int x2;
        int y1;
        int y2;
        double distancia;
        
        System.out.print("Ingrese la coordenada en X del primer punto: ");
        x1 = scan.nextInt();
        
        System.out.print("Ingrese la coordenada en Y del primer punto: ");
        y1 = scan.nextInt();
        
        System.out.print("Ingrese la coordenada en X del segundo punto: ");
        x2 = scan.nextInt();
        
        System.out.print("Ingrese la coordenada en Y del segundo punto: ");
        y2 = scan.nextInt();
        
        if(x1 == x2){
            distancia = Math.abs(y1-y2);
        }
        else if(y1 == y2){
            distancia = Math.abs(x1-x2);
        }
        else{
            distancia = Math.sqrt(Math.pow(Math.abs(x1-x2), 2)+Math.pow(Math.abs(y1-y2), 2));
        }
        
        System.out.println("La distancia entre ambos puntos es de: " + distancia);
    }
}
