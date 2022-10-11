/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import excepciones.OperacionesExcepciones;

/**
 *
 * @author Alumno Mañana
 */
public class Aritmetica {
    
    public static int division(int numerador, int denominador) throws OperacionesExcepciones{
        if(denominador == 0){
            throw new OperacionesExcepciones("Division entre 0");
        }
        return numerador / denominador;
    }
}
