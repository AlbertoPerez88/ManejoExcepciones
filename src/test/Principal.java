/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static aritmetica.Aritmetica.division;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {
    public static void main(String[] args) {
        int resultado = 0;
        
        try {
            resultado = division(10,0);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        
    }
}
