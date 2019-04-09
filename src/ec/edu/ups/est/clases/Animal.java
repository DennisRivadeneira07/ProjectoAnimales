/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.est.clases;

/**
 *
 * @author LENOVO
 */
public class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private String sexo;
    
    
    //atrivutos constructores getters seters y to string
    public Animal(){
        
    }

    public Animal(String nombre, int edad, double peso, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
     public void setPeso(double peso){
     this.peso=peso;   
    }
     public void setSexo (String sexo){
         this.sexo=sexo;
     }
    public String getNombre(){
        return this.nombre;
}

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }
    
}
    
