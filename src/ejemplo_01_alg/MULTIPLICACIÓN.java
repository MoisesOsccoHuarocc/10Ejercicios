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
public class MULTIPLICACIÓN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
           multiplicacion();
    }
    
     public static void multiplicacion(){
        Scanner teclado = new Scanner(System.in);
        
        int num1,num2,num3,num4,num5,multiplicar;
        System.out.println("PROGRAMA QUE CALCULA LA MULTIPLICACION DE 5 NUMEROS.");   
        System.out.println("Ingrese el primer numero:");
        num1= teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2= teclado.nextInt();
        System.out.println("Ingrese el tercer numero:");
        num3= teclado.nextInt();
        System.out.println("Ingrese el cuarto numero:");
        num4= teclado.nextInt();
        System.out.println("Ingrese el quinto numero:");
        num5= teclado.nextInt();
        
        multiplicar=num1*num2*num3*num4*num5;
        
        System.out.println("La multiplicacion es:" +multiplicar);
        
    }
}
