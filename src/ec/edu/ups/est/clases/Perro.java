/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.est.clases;

import ec.edu.ups.est.interfaces.Acciones;

/**
 *
 * @author LENOVO
 */
public class Perro extends Animal implements Acciones  {

    @Override
    public void comer() {
        System.out.println("El perro"+this.getNombre());
        //implementar metodos en comun pero cada uno hace acciones distintas .
    }

    @Override
    public void dormir() {
        
    }

    @Override
    public void moverse() {
           }

    @Override
    public void jugar() {
    }

    @Override
    public void reproducirce() {
     }
    
}
