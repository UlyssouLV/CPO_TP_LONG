
package Personnages;

public class Guerrier extends Personnage{
    
    private int health;
    private String name,type;
    private boolean ridingHorse;

    //Constructeur
    public Guerrier(int Health, boolean RidingHorse, String Name) {
        super(Health, Name);
        this.health = Health;
        this.name = Name;
        this.ridingHorse = RidingHorse;
    } // Fin Constructeur

    
    //toString
    @Override
    public String toString() {
        return "Guerrier{" + "health=" + health + ", name=" + name + ", ridingHorse=" + ridingHorse +", equipped_weapon="+this.getArme_en_Main()+ '}';
    }//Fin toString

    
    //Setter
    public void setRidingHorse(boolean ridingHorse) {
        this.ridingHorse = ridingHorse;
    }  
    
    
}
