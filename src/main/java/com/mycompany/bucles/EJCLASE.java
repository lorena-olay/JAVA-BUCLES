/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class EJCLASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");
        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();
         if (opcion != 1 || opcion != 2 || opcion != 3 || opcion != 4){
            System.out.println("LA OPCIÓN ES ENTRE 1 Y 4");
        }
        switch (opcion){
            case 1:
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");break;
            case 2:
                System.out.println("Ha seleccionado calcular el área de un triángulo...");break;
            case 3:
                System.out.println("Ha seleccionado calcular el área de un círculo..."); break;
            case 4:
                System.out.println("Ha seleccionado terminar");break;
            }}while(opcion != 4);
        
    }    
        }
    

    



            
