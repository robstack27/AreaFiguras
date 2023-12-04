/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areafiguras;

/**
 *
 * @author labctr
 */
public class Cuadrado {
    private float lado;
    
    public void Cargar(float lado){
        this.lado = lado;
    }
   
    public float Area (){
        return this.lado*this.lado*this.lado*this.lado;
    }
           
    
}
