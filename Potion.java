/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dragon.Treasure;

/**
 *
 * @author Jonatan
 */
public class Potion extends Item {
    private int healing;

    public Potion(String name, String itemDesc, int healing) {
        super(name, itemDesc);
        this.healing = healing;
        
    }

    /**
     * @return the healing
     */
    public int getHealing() {
        return healing;
    }

    /**
     * @param healing the healing to set
     */
    public void setHealing(int healing) {
        this.healing = healing;
    }
    
    
    
}
