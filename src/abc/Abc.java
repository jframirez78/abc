/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Abc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    double perimetro;
    double centro;
    double area;
    double lado;

    Scanner nuevo = new Scanner(System.in);
        System.out.println("Ingrese la medida de uno de los lados del hexágono: ");
       lado = nuevo.nextDouble();
       perimetro = lado*6;
       centro= sqrt((lado*lado)-((lado/2)*(lado/2)));
       area = (perimetro * centro) /2;
       System.out.println("El perimetro del hexágono es: "+perimetro);
       System.out.println("El area del hexágono es: "+area);
       
       
    
    }
           
}

 
