/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areafiguras;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class AreaFiguras {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float r,c,t ;
        int opcion;
    
        
        do{
            System.out.println("Calculadora de Areas");
            System.out.println("1. Calcular Area de un triangulo");
            System.out.println("2. Calcular Area de un cuadrado");
            System.out.println("3. Calcular Area de un circulo");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1 -> {
                    Triangulo trl = new Triangulo ();
                    System.out.println("Ingrese la base del triangulo");
                    c = entrada.nextFloat();
                    System.out.println("Ingrese la altura del triangulo");
                    t = entrada.nextFloat();
                    trl.Cargar(c,t );
                    System.out.println("Area del triangulo"+trl.Area());
                }
                case 2 -> {
                    Cuadrado crl = new Cuadrado ();
                    System.out.println("ingrese el lado del cuadrado");
                    c = entrada.nextFloat();
                    crl.Cargar(c);
                    System.out.println("Area del cuadrado"+crl.Area());
                }
                case 3 -> {
                    Circulo cir = new Circulo ();
                    System.out.println("ingrese el radio del circulo");
                    r = entrada.nextFloat();
                    cir.Cargar(r);
                    System.out.println("Area del circulo"+cir.Area());
                }
                case 4 -> {
                    System.out.println("Hasta luego!");
                }
                default ->{
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            }
        } while (opcion != 4);
    
    }
}

