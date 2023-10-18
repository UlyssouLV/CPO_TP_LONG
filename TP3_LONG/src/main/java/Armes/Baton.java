
package Armes;

public class Baton extends Arme{
    
    private int age,lvl;
    private String name;
    //Constructeur
    public Baton(int age, int Lvl, String Name) {
        super(Lvl, Name);
        this.age = age;
        this.lvl = Lvl;
        this.name = Name;
    }  // Fin Constructeur

    //toString
    @Override
    public String toString() {
        return "Baton{" + "age=" + age + ",lvl=" + lvl +",name="+name+'}';
    }//fin toString
    
    
    
}
