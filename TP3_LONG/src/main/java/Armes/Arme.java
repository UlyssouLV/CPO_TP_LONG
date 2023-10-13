
package Armes;

public class Arme {
   
    private int level;
    private String nom,type;
    
    // Constructeur
    public Arme(int lvl, String name) {
        this.level=lvl;
        this.nom=name; 
    } // Fin Constructeur

    // Getter Level
    public int getLevel() {
        return level;
    }
    //Getter Nom
    public String getNom() {
        return nom;
    }
    //Getter type
    public String getType() {
        return type;
    }
    
    //Setter type
    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
    
}
