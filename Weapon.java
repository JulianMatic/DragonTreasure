/*-*+
-/
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dragon.Treasure;

/**
 *
 * @author Jonatan
 */
public class Weapon extends Item{
    private int increaseDamage;
    
    public Weapon(String name, String itemDesc, int increaseDamage) {
        super(name, itemDesc);
    }

    /**
     * @return the increaseDamage
     */
    public int getIncreaseDamage() {
        return increaseDamage;
    }

    /**
     * @param increaseDamage the increaseDamage to set
     */
    public void setIncreaseDamage(int increaseDamage) {
        this.increaseDamage = increaseDamage;
    }
    
}
