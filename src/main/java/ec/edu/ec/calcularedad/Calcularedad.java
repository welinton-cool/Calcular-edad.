/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ec.calcularedad;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Calcularedad {

    public static void main(String[] args) {
        
        Scanner e=new Scanner(System.in);
        System.out.println("ingresa la edad :");
        int edad=e.nextInt();

        if (edad>=0 && edad<120){
           //categoriza la persona 
           if (edad>=0&& edad>12){
               System.out.println("eres un niño.");
               
           } else if (edad>=13&& edad>=35){
               System.out.println("eres joven.");
               
        }else{
               System.out.println("eres adulto.");
               
           } 
                   
        }else {
            System.out.println("error?");
        } 
            
    }
}

