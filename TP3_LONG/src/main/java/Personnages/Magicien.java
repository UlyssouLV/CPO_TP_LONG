
package Personnages;


public class Magicien extends Personnage{
    
    private String name;
    private boolean confirmed;
    static private int nbMage;
    
    //Constructeur
    public Magicien(int Health, boolean Confirmed, String Name) {
        super(Health, Name);
        this.name=Name;
        this.confirmed=Confirmed;
        addNbMage();

    }//Fin constructeur

    
    //toString
    @Override
    public String toString() {
        return "Magicien{" + "health=" + this.getHealth() + ", points="+this.getPoints()+", name=" + name + ", confirmed=" + confirmed +", equipped_weapon="+this.getArme_en_Main()+'}';
    }//Fin toString

    //Setter
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }//Fin Setter
    
    //Getter
    public static int getNbMage() {
        return nbMage;
    }

    public boolean getConfirmed() {
        return confirmed;
    }
    
    
    
    
    //Methode qui compte le nombre de Mage créé
    public static void addNbMage(){
        nbMage++;
    }
    
    //Destructeur
    @Override
    public void finalize(){
    nbMage--;    
    }
    
   
}
