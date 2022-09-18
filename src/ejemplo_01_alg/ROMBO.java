/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_01_alg;
import java.util.Scanner;
/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class ROMBO {
        public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);  
        double D, dd, A, L, P;
        System.out.println("PROGRAMA QUE CALCULA EL AREA Y PERIMETRO DEL ROMBO.");        
        System.out.print("INGRESE DIAMETRO MAYOR : ");
        D = Double.parseDouble(ingreso.next());
        System.out.print("INGRESE DIAMETRO MENOR : ");
        dd = Double.parseDouble(ingreso.next());                        
        A = (D * dd)/2;
        System.out.println("AREA                   : " + A);
        System.out.println("");
        System.out.print("INGRESE LADO           : ");
        L = Double.parseDouble(ingreso.next());
        P = 4 * L;
        System.out.println("PERIMETRO              : " + P);                
    }      
    
}

