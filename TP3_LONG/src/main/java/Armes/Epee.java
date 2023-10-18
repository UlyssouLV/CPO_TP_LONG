
package Armes;


public class Epee extends Arme{
    
   private int finesse,lvl;
   private String name;

   
    //Constructeur
    public Epee(int finesse, int Lvl, String Name) {
        super(Lvl, Name);
        this.finesse = finesse;
        this.lvl = Lvl;
        this.name=Name;
    } // fin Constructeur

    @Override
    public String toString() {
        return "Epee{" + "finesse=" + finesse + ",lvl="+lvl+",name="+name+'}';
    }
    
    
    
   
   
    

   
    
} // Fin class

