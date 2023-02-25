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
public class P17HoraCiclista {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int hora;
        int min;
        int seg;
        int segViaje;
        
        System.out.print("Ingrese la hora a la que salio el ciclista: ");
        hora = scan.nextInt();
        
        System.out.print("Ingrese los minutos a los que salio el ciclista: ");
        min = scan.nextInt();
        
        System.out.print("Ingrese los segundos a los que salio el ciclista: ");
        seg = scan.nextInt();
        
        System.out.print("Ingrese los segundos que tardo en llegar a su destino el ciclista: ");
        segViaje = scan.nextInt();
        
        seg = seg + segViaje;
        min = min + seg/60;
        hora = hora + min/60;
        min = min%60;
        seg = seg%60;
        
        if(hora > 23){
            hora = 0;
        }
        
        System.out.println("El ciclista llego a su destino a las: " + hora + ":" + min + ":" + seg);
    }
}
