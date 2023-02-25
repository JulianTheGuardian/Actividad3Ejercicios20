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
public class P19NotaPuntos {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int preguntas;
        int correctas;
        int incorrectas;
        int vacias;
        int puntos;
        int puntosMax;
        int nota;
        int notaMax;
        
        System.out.print("Ingrese la nota maxima que colocan en su institucion: ");
        notaMax = scan.nextInt();
        
        System.out.print("Ingrese el numero total de preguntas: ");
        preguntas = scan.nextInt();
        
        puntosMax= preguntas*5;
        
        System.out.print("Ingrese el numero de respuestas correctas: ");
        correctas = scan.nextInt();
        
        System.out.print("Ingrese el numero de respuestas incorrectas: ");
        incorrectas = scan.nextInt();
        
        System.out.print("Ingrese el numero de preguntas sin responder: ");
        vacias = scan.nextInt();
        
        if(preguntas == correctas+incorrectas+vacias){
            puntos = correctas*5-incorrectas;
            nota = (puntos/puntosMax)*notaMax;
            System.out.println("Su nota final es : " + nota);
        }
        else{
            System.out.println("La cantidad de preguntas ingresada no concuerda con los datos entregados.");
            System.out.println("Reintente en otro momento");
        }
    }
}
