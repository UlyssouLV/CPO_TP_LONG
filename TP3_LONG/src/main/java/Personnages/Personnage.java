
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import com.ulysselongepf.tp3_long.etreVivant;
import java.util.ArrayList;

public abstract class Personnage implements etreVivant {
    ArrayList<Arme> inventaireArmes= new ArrayList<Arme>();
    private String name;
    private int health,points;
    private Arme Arme_en_Main;
    static private int nbCarracter;


    //Constructeur
    public Personnage(int health, String name) {
        this.name = name;
        this.health = health;
        addNbCarracter();
    }// fin Constructeur

    //Getters
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    } 
    public Arme getArme_en_Main(){
        return Arme_en_Main;
    }
    public static int getNbCarracter() {
        return nbCarracter;
    }
    public int getPoints() {
        return points;
    }
    // Fin Getters
    
    //Setter
    public void setHealth(int health) {
        this.health = health;
    }
    public void setPoints(int points) {
        this.points = points;
    }
   
    //Methode d'ajout d'Armes à l'inventaire
    public void addWeaponToInv(Arme arme){
        if(inventaireArmes.size()==5){
            System.out.println("Ce personnage a un inventaire d'armes complet");
        } else {
            inventaireArmes.add(arme);
        }
    } // Fin méthode d'ajout d'armes à l'inventaire
    
    //Methode pour désarmer le personnage
    public void disarm(){
        this.Arme_en_Main=null;
    }//Fin méthode de désarmement
    
    //Methode pour equiper en main une arme de l'inventaire
    public void equipWeapon(String weapon){
        String msg="Cette arme n'est pas posséedée par le personnage";
        for(int i=0;i<inventaireArmes.size();i++){
            if(inventaireArmes.get(i).getName().equals(weapon)){
                msg = "L'arme a bien été équipée";
                Arme_en_Main = inventaireArmes.get(i);
            }
        } 
        System.out.println(msg);
    }//Fin de méthode d'équipement d'arme de l'inventaire
    
    
    //Methode pour connaitre le nombre d'armes de prédilection
    public int numberOfWeaponOfChoice(){
        int nb=0;
        //Test de Classe
        for(int i=0;i<inventaireArmes.size();i++){
            if((this instanceof Magicien && inventaireArmes.get(i)instanceof Baton)|| (this instanceof Guerrier && inventaireArmes.get(i) instanceof Epee)){
                nb++;
            }
        }
        return nb;
    }
    
    //Methode qui compte le nombre de personnage
    public static void addNbCarracter(){
        nbCarracter++;
    }
    
    //Destructeur
    @Override
    public void finalize(){
        nbCarracter--;
    }
    
     // Methode Fatigue
    public void seFatiguer(){
        points-=10;
    }
    //Methode estVivant
    public boolean estVivant(){
        if(health>0){
            return true;
        } else return false;
    }
    //Methode estAttaqué
    public void estAttaqué(int points){
        health-=points;
    }
    //Methode attaquer()
    public void attaquer(Personnage victime){
        if(this instanceof Magicien){ // Magicien
            if(this.Arme_en_Main instanceof Baton){//Arme prédilection
                if((victime instanceof Guerrier && ((Guerrier) victime).getRidingHorse()==true) || (victime instanceof Magicien && ((Magicien) victime).getConfirmed()==true)) {
                    victime.estAttaqué(20*Arme_en_Main.getAge()/2); // Dégats divisés par 2
                }
            } else victime.estAttaqué(20*Arme_en_Main.getAge()); // Dégat pas divisés
        
        } else  if(this instanceof Guerrier){ // Guerrier
            if(this.Arme_en_Main instanceof Epee){//Arme prédilection
                if((victime instanceof Guerrier && ((Guerrier) victime).getRidingHorse()==true) || (victime instanceof Magicien && ((Magicien) victime).getConfirmed()==true)) {
                    victime.estAttaqué(30*Arme_en_Main.getFinesse()/2); // Dégats divisés par 2
                }
            } else victime.estAttaqué(30*Arme_en_Main.getFinesse()); // Dégat pas divisés    
        }
        this.seFatiguer();
    }
    
     
}
