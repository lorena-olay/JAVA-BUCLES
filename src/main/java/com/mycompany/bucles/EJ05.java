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
public class EJ05 {

    /*5.- Implementa el programa del ejercicio 2 usando un do – while.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        do {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        } while (x<=n);
    }

}
