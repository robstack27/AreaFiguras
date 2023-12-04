/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areafiguras;
import static java.lang.Math.PI;
/**
 *
 * @author labctr
 */
public class Circulo {
    
    private float  radio;
    
    public void Cargar(float radio){
        this.radio = radio;
    } 
    public float Area() {
        return (float)(PI * this.radio * this.radio);
        
    }
    
    
}
