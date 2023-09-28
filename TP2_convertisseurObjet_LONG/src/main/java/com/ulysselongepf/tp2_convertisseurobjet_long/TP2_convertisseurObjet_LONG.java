/*
27 Septembre
Ulysse LONG
TP2 : Convertisseur de températures version classes
 */

package com.ulysselongepf.tp2_convertisseurobjet_long;

import java.util.Scanner;

public class TP2_convertisseurObjet_LONG {

    public static void main(String[] args) {
        
        //Variables éventuelles
        int conversion;
        float temp;
        boolean program=true;
        
        //Création convertisseur
        Convertisseur SuperTemperator = new Convertisseur();
        
        // Do While pour répéter le programme arrivé à la fin selon l'envie user
        do{  
        boolean condition=true;

        // Affichage Saisie et Input
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Saisissez une température"); 
        temp = sc.nextFloat(); // Saisie température
        
        //Do While pour gérer Exceptions
        do {
        
        System.out.println("En quelle unité voulez-vous convertir cette température ?\n1) Celcius en Kelvin\n2) Kelvin en Celcius\n3) Farenehit en Celcius\n4) Celcius en Farenheit\n5) Kelvin en Farenheit\n6) Farenheit en Kelvin");
        conversion = sc.nextInt();//Saisie conversion
        
        //Exceptions
         if (conversion > 6 || conversion <1) {
         //pas compris entre 1 et 6
         System.out.println("Erreur de saisie, choisissez une valeur entre 1 et 6");  
        } else {
             condition = false;  
           }      
       } while(condition);
        
        //Switch
        switch(conversion){
            case 1 -> //Celcius to Kelvin
                System.out.println(SuperTemperator.CelciusVersKelvin(temp));
      
            case 2 -> //Kelvin to Celcius
                System.out.println(SuperTemperator.KelvinVersCelcius(temp));

            case 3 -> //Farenheit to Celcius
                System.out.println(SuperTemperator.FarenheitVersCelcius(temp));

            case 4 -> //Celcius to Farenheit
                System.out.println(SuperTemperator.CelciusVersFarenheit(temp));

            case 5 -> //Kelvin to Farenheit
                System.out.println(SuperTemperator.KelvinVersFarenheit(temp));

            case 6 -> //Farenheit to Kelvin
                System.out.println(SuperTemperator.FarenheitVersKelvin(temp));

            default -> {
            }
            }
        
        //Demande si l'utilisateur veut reconvertir une température
        int restart=0;
        condition = true;
        
        //Do While pour gérer Exceptions
        do {
        System.out.println("Voulez-vous reconvertir une température ?\n1) Oui\n2) Non"); 
        restart = sc.nextInt(); // Saisie restart
        
        //Exceptions
         if ((!(restart==1)) && (!(restart==2))) {
         //pas compris entre 1 et 2
         System.out.println("Erreur de saisie, choisissez une valeur entre 1 et 2");  
        } else {
             condition = false;  
           }      
       } while(condition);
        
       //Test de la valeur saisie
       if(restart==2){
           program=false;
       }
        
        }while(program);
        
        //Affichage du nombre de conversions réalisées
        System.out.println("Nombre de conversions réalisées :");
        System.out.print(SuperTemperator);
    }
}
