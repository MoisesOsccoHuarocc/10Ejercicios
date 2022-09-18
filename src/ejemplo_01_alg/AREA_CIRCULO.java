/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_01_alg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class AREA_CIRCULO {
    public static void main(String[] args) throws IOException {
  
        final double PI = 3.14159265;  // declarando una constante
        double area;  // declaración de variables
        double radio; 
        
        // configuración del bufer de entrada
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("PROGRAMA QUE CALCULA EL AREA DEL CIRCULO.");
        // Entrada(radio)
        System.out.println("Escribe el valor del radio: ");
        entrada = bufer.readLine();
        radio = Double.parseDouble(entrada);
        
        // proceso
        area = PI * radio * radio;
        
        // Salida(area)
        System.out.println("El AREA DEL CIRCULO ES: " + area );        
        
    }
    
}
