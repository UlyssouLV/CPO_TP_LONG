/*
26 Septembre 2023
TP1
Ulysse LONG
 */
package com.ulysselongepf.tp1_convertisseur_long;

import java.util.Scanner;

public class TP1_convertisseur_LONG {

    public static double CelciusVersKelvin (double tCelcius) {
    //Entrée : double représentant température en Celcius
    //Sortie : double représentant température en Kelvin
    //Variables éventuelles 
    double tKelvin; tKelvin = tCelcius+273.15;
    return tKelvin;
    }
    
    public static double KelvinVersCelcius (double tKelvin) {
    //Entrée : double représentant température en Kelvin
    //Sortie : double représentant température en Celcius
    //Variables éventuelles 
    double tCelcius; tCelcius = tKelvin-273.15;
    return tCelcius;
    }
    
    public static double CelciusVersFarenheit (double tCelcius) {
    //Entrée : double représentant température en Celcius
    //Sortie : double représentant température en Farenheit
    //Variables éventuelles 
    double tFarenheit; tFarenheit = tCelcius*1.8000+32;
    return tFarenheit;
    }
    
    public static double FarenheitVersCelcius (double tFarenheit) {
    //Entrée : double représentant température en Farenheit
    //Sortie : double représentant température en Celcius
    //Variables éventuelles 
    double tCelcius; tCelcius = (tFarenheit-32)/1.8000;
    return tCelcius;
    }
    
    public static double KelvinVersFarenheit (double tKelvin) {
    //Entrée : double représentant température en Kelvin
    //Sortie : double représentant température en Farenheit
    //Variables éventuelles 
    double tFarenheit, tCelcius;
    tCelcius = KelvinVersCelcius(tKelvin);
    tFarenheit = CelciusVersFarenheit(tCelcius);
    return tFarenheit;
    }
    
    public static double FarenheitVersKelvin (double tFarenheit) {
    //Entrée : double représentant température en Farenheit
    //Sortie : double représentant température en Kelvin
    //Variables éventuelles 
    double tKelvin, tCelcius;
    tCelcius = FarenheitVersCelcius(tFarenheit);
    tKelvin = CelciusVersKelvin(tCelcius);
    return tKelvin;
    }

    public static void main(String[] args) {
        
         // Variables éventuelles
        double saisie;
        int conversion;
        boolean condition = true;
        
        // Affichage Saisie et Input
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("\n Please enter a temperature :"); 
        saisie = sc.nextDouble(); // Saisie température
        
        //Do While pour gérer Exceptions
        do {
          System.out.println("\n Please enter the type of conversion :\n1) Celcius to Kelvin\n2) Kelvin to Celcius\n3) Farenehit to Celcius\n4) Celcius to Farenheit\n5) Kelvin to Farenheit\n6) Farenheit to Kelvin");
          conversion = sc.nextInt(); // Saisie conversion
          
          //Exceptions
          if (conversion > 6 || conversion <1) {
          //pas compris entre 1 et 6
          System.out.println("Input error, please enter a valid conversion between 1 and 6");  
         } else {
              condition = false;  
            }      
        } while(condition);
        
        //Switch
        switch(conversion){
            case 1 -> //Celcius to Kelvin
                System.out.println("Temperature :\nCelcius : "+saisie+"\nKelvin : "+CelciusVersKelvin(saisie));
                
            case 2 -> //Kelvin to Celcius
                System.out.println("Temperature :\nKelvin : "+saisie+"\nCelcius : "+KelvinVersCelcius(saisie));
                
            case 3 -> //Farenheit to Celcius
                System.out.println("Temperature :\nFarenheit : "+saisie+"\nCelcius : "+FarenheitVersCelcius(saisie));
                
            case 4 -> //Celcius to Farenheit
                System.out.println("Temperature :\nCelcius : "+saisie+"\nFarenheit : "+CelciusVersFarenheit(saisie));
                
            case 5 -> //Kelvin to Farenheit
                System.out.println("Temperature :\nKelvin : "+saisie+"\nFarenheit : "+KelvinVersFarenheit(saisie));
                
            case 6 -> //Farenheit to Kelvin
                System.out.println("Temperature :\nFarenheit : "+saisie+"\nKelvin : "+FarenheitVersKelvin(saisie));
                
            default -> {
            }
            }
        }
    
        
}
