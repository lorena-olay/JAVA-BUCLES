package com.mycompany.bucles;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lorena
 */
public class EJERCICIO_DE_CLASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double FACTOR_MULTIPLICATIVO = 5.85;
        // TODO code application logic here
        //Pedimos todos los datos que necesitamos
        //do{
        String edad_por_teclado = JOptionPane.showInputDialog("Escribe tu edad: ");
        int edad = Integer.parseInt(edad_por_teclado);
        String sueldomes_por_teclado = JOptionPane.showInputDialog("Escribe tu sueldo de un mes: ");
        int sueldo_bruto_mes = Integer.parseInt(sueldomes_por_teclado);
        String hipoteca_por_teclado = JOptionPane.showInputDialog("Escribe la hipoteca que quieres: ");
        int hipoteca = Integer.parseInt(hipoteca_por_teclado);
        String añoshipoteca_por_teclado = JOptionPane.showInputDialog("Escribe el tiempo de la hipotéca: ");
        int años_hipoteca = Integer.parseInt(añoshipoteca_por_teclado);
        //while(edad < 0);
        //Calculamos la rentabilidad de la hipoteca
        double renta = sueldo_bruto_mes * FACTOR_MULTIPLICATIVO;
        double edad_hipoteca = edad + años_hipoteca;
        //Creamos las condiciones para ver si es apto o no
        if(hipoteca>renta || 5<hipoteca&&hipoteca<30 || edad_hipoteca>=75){
        JOptionPane.showMessageDialog(null, "No apto");
        }else{
        JOptionPane.showMessageDialog(null, "Apto");
        }
    }
    
}
