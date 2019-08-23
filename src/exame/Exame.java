/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exame;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Exame {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int ca1,ca2,ca3,ca4;
       int NO1 = 0,NO2 = 0,NO3 = 0,NO4 = 0,AUX=0,AUX2 = 0;
       int nM = 0,nm = 0;
       
        System.out.println("UNIVERSIDAD DE GUATEMALA");
        System.out.println("Examenes privados");
        System.out.println("Ingrese Numero de carnet: ");
            ca1 = entrada.nextInt();
            
        System.out.println("Ingrese Nota 1: ");
            NO1 = entrada.nextInt();
        System.out.println("Ingrese Nota 2: ");
             NO2 = entrada.nextInt();
        System.out.println("Ingrese Nota 3: ");
             NO3 = entrada.nextInt();
        System.out.println("Ingrese Nota 4: ");
             NO4 = entrada.nextInt();
        
       
        if (NO1>NO2 && NO1>NO3 && NO1>NO4){
             AUX = NO1;
        }
        else {
                if(NO2 > NO1 && NO2 > NO3 && NO2 > NO4){
                AUX=NO2;
                }
        else{
                if(NO3 > NO1 && NO3 > NO2 && NO3 > NO4){
                    AUX=NO3;    
                }
                else{
                    if(NO4 > NO1 && NO4 > NO2 && NO4> NO3){
                    AUX=NO4;    
                }
                }}
        }
        
         System.out.println("el mayor es "+AUX+" y el menor es "+AUX2);
        if (NO1<NO2 && NO1<NO3 && NO1<NO4){
             AUX2 = NO1;
        }
        else {
                if(NO2 < NO1 && NO2 < NO3 && NO2 < NO4){
                AUX2=NO2;
                }
        else{
                if(NO3 < NO1 && NO3 < NO2 && NO3 < NO4){
                    AUX2=NO3;    
                }
                else{
                    if(NO4 < NO1 && NO4 < NO2 && NO4< NO3){
                    AUX2=NO4;    
                }
                }}
        }
           

        System.out.println("La nota mayor es: "+AUX);
        System.out.println("La nota menor es: "+AUX2);
        System.out.println("el menor es "+AUX+" y el menor es "+AUX2);
        
        
    }
    
}
