/*
27 Septembre 2023
Classe Convertisseur avec tous les types de conversion de température en méthodes
 */
package com.ulysselongepf.tp2_convertisseurobjet_long;

public class Convertisseur {
    public int nbConversions;
    
    //Constructeur
    public Convertisseur() {
        nbConversions=0;
    }//Fin Méthode
    
    //toString
    @Override
    public String toString () {
        return ""+nbConversions;
    }   //Fin toString
    
    // Methode Celcius/Kelvin
    public float CelciusVersKelvin (float tCelcius) {
    //Entrée : double représentant température en Celcius
    //Sortie : double représentant température en Kelvin
    //Variables éventuelles 
    float tKelvin; tKelvin = (float) (tCelcius+273.15);
    nbConversions++;
    return tKelvin;
    }
    
    //Methode Kelvin/Celcius
    public float KelvinVersCelcius (float tKelvin) {
    //Entrée : double représentant température en Kelvin
    //Sortie : double représentant température en Celcius
    //Variables éventuelles 
    float tCelcius; tCelcius = (float) (tKelvin-273.15);
    nbConversions++;
    return tCelcius;
    }
    
    //Methode Celcius/Farenheit
    public float CelciusVersFarenheit (float tCelcius) {
    //Entrée : double représentant température en Celcius
    //Sortie : double représentant température en Farenheit
    //Variables éventuelles 
    float tFarenheit; tFarenheit = (float) (tCelcius*1.8000+32);
    nbConversions++;
    return tFarenheit;
    }
    
    //Methode Farenheit/Celcius
    public double FarenheitVersCelcius (float tFarenheit) {
    //Entrée : double représentant température en Farenheit
    //Sortie : double représentant température en Celcius
    //Variables éventuelles 
    float tCelcius; tCelcius = (float) ((tFarenheit-32)/1.8000);
    nbConversions++;
    return tCelcius;
    }
    
    //Methode Kelvin/Farenheit
    public float KelvinVersFarenheit (float tKelvin) {
    //Entrée : double représentant température en Kelvin
    //Sortie : double représentant température en Farenheit
    //Variables éventuelles 
    float tFarenheit, tCelcius;
    tCelcius = KelvinVersCelcius(tKelvin);
    tFarenheit = CelciusVersFarenheit(tCelcius);
    nbConversions++;
    return tFarenheit;
    }
    
    //Methode Farenheit/Kelvin
    public float FarenheitVersKelvin (float tFarenheit) {
    //Entrée : double représentant température en Farenheit
    //Sortie : double représentant température en Kelvin
    //Variables éventuelles 
    float tKelvin, tCelcius;
    tCelcius = (float) FarenheitVersCelcius(tFarenheit);
    tKelvin = CelciusVersKelvin(tCelcius);
    nbConversions++;
    return tKelvin;
    }

}//Fin classe
