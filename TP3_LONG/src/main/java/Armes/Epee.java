
package Armes;


public class Epee extends Arme{
    
   private String name;

   
    //Constructeur
    public Epee(int fein, int Lvl, String Name) {
        super(Lvl, Name);
        this.name=Name;
        this.setFinesse(fein);
    } // fin Constructeur

    @Override
    public String toString() {
        return "Epee{" + "finesse=" + this.getFinesse() + ",lvl="+this.getLevel()+",name="+name+'}';
    }
    
    
    
   
   
    

   
    
} // Fin class

