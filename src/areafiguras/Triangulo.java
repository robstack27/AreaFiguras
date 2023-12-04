/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areafiguras;

/**
 *
 * @author labctr
 */
public class Triangulo {
    //atributos
    private float base;
    private float altura;
    //métodos
    public void Cargar (float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    public float Area (){
        return (this.base * this.altura)/2;
    }
    
}
