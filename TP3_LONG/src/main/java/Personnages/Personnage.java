
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

public class Personnage {
    ArrayList<Arme> inventaireArmes= new ArrayList<Arme>();
    private String name,type;
    private int health;
    private Arme Arme_en_Main;

    //Constructeur
    public Personnage(int health, String name) {
        this.name = name;
        this.health = health;
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
    }// Fin Getters

    //Setter
    public void setType(String type) {
        this.type = type;
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
            if(inventaireArmes.get(i).getNom().equals(weapon)){
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
        if("Guerrier".equals(type)){
            for(int i=0;i<inventaireArmes.size();i++){
                if("Epee".equals(inventaireArmes.get(i).getType())){
                    nb++;
                }
            }
        } else if("Magicien".equals(type)){
            for(int i=0;i<inventaireArmes.size();i++){
                if("Baton".equals(inventaireArmes.get(i).getType())){
                    nb++;
                }
            }
        }
        return nb;
    }
    
     
}
