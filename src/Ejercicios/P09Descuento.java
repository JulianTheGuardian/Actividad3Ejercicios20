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
public class P09Descuento {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        double precioCompra;
        double descuento;

        System.out.print("Ingrese el precio total de su compra: ");
        precioCompra = scan.nextDouble();
        
        descuento = precioCompra * 0.15;
        
        System.out.println("Usted debe de pagar un total de " + (precioCompra-descuento));
    }
}
