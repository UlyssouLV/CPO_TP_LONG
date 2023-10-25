
package Armes;

public class Arme {
   
    private int level,age,finesse;
    private String name;
    
    // Constructeur
    public Arme(int lvl, String name) {
        this.level=lvl;
        this.name=name; 
    } // Fin Constructeur

    // Getter Level
    public int getLevel() {
        return level;
    }
    //Getter Nom
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getFinesse() {
        return finesse;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFinesse(int finesse) {
        this.finesse = finesse;
    }
    
    
    
  
    
    
    
    
    
}
