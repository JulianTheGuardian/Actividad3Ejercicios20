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
public class P16TiempoAlcanzarVehiculo {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        double vel1;
        double vel2;
        double distancia;
        int hora;
        int min;
        int segundos;
        
        System.out.print("Ingrese la velocidad del vehiculo de adelante (km/h): ");
        vel1 = scan.nextDouble();
        
        System.out.print("Ingrese la velocidad del vehiculo de detras (km/h): ");
        vel2 = scan.nextDouble();
        
        System.out.print("Ingrese la distancia vehiculo enter los vehiculos (m): ");
        distancia = scan.nextDouble();
        
        if(vel1>vel2){
            System.out.println("El vehiculo de atras nunca adelantara al de delante si no acelera.");
        }
        else{
            vel1 = vel1*1000/3600;
            vel2 = vel2*1000/3600;

            for (segundos= 0; distancia > 0; segundos++) {
                distancia = distancia + vel1 - vel2;
            }
            
            min = segundos/60;
            segundos = segundos%60;
            hora = min/60;
            min = min%60;
            
            System.out.println("El vehiculo de atras pasara al de adelante en: " + hora + " horas con " + min + " minutos y " + segundos + " segundos");
        }
    }
}
