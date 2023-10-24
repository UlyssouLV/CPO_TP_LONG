
package Personnages;

public class Guerrier extends Personnage{
    
    private String name;
    private boolean ridingHorse;
    private static int nbWarrior;
    

    //Constructeur
    public Guerrier(int Health, boolean RidingHorse, String Name) {
        super(Health, Name);
        this.name = Name;
        this.ridingHorse = RidingHorse;
        addNbWarrior();
    } // Fin Constructeur

    
    //toString
    @Override
    public String toString() {
        return "Guerrier{" + "health=" + this.getHealth() + ", points="+this.getPoints()+", name=" + name + ", ridingHorse=" + ridingHorse +", equipped_weapon="+this.getArme_en_Main()+ '}';
    }//Fin toString

    
    //Setter
    public void setRidingHorse(boolean ridingHorse) {
        this.ridingHorse = ridingHorse;
    }  
    
    //Getter
    public static int getNbWarrior() {
        return nbWarrior;
    }
    public boolean getRidingHorse(){
        return ridingHorse;
    }
    
    
    //Methode qui compte le nombre de guerrier à chaque création
    public static void addNbWarrior(){
        nbWarrior++;
    }
    
    //Destructeur
    public void finalize(){
    nbWarrior--;
    }
    
}
