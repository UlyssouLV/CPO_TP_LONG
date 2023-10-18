
package Personnages;


public class Magicien extends Personnage{
    
    private int health;
    private String name;
    private boolean confirmed;
    //Constructeur
    public Magicien(int Health, boolean Confirmed, String Name) {
        super(Health, Name);
        this.health =Health;
        this.name=Name;
        this.confirmed=Confirmed;
    }//Fin constructeur

    
    //toString
    @Override
    public String toString() {
        return "Magicien{" + "health=" + health + ", name=" + name + ", confirmed=" + confirmed +", equipped_weapon="+this.getArme_en_Main()+'}';
    }//Fin toString

    //Setter
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
    
    
}
