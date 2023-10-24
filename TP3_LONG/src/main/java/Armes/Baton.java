
package Armes;

public class Baton extends Arme{
    int Age;
    //Constructeur
    public Baton(int age, int level, String nom) {
        super(level, nom);
        this.setAge(age);
    }  // Fin Constructeur



    
    //toString
    @Override
    public String toString() {
        return "Baton{" + "age=" + this.getAge() + ",lvl=" + this.getLevel() +",name="+this.getName()+'}';
    }//fin toString
    
    
    
}
