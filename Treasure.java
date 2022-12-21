/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dragon.Treasure;

/**
 *
 * @author Jonatan
 */
public class Treasure extends Item {

    private int goldValue;

    public Treasure(String name, String itemDesc, int goldValue) {
        super(name, itemDesc);
        this.goldValue = goldValue;
    }

    /**
     * @return the goldValue
     */
    public int getGoldValue() {
        return goldValue;
    }

    /**
     * @param goldValue the goldValue to set
     */
    public void setGoldValue(int goldValue) {
        this.goldValue = goldValue;
    }

}
