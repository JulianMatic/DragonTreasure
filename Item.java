
package Dragon.Treasure;

/**
 *
 * @author Jonatan
 */
abstract class Item {
    private String name;
    private String itemDesc;
    
    
   public Item(String name, String itemDesc){
    this.name = name;
    this.itemDesc = itemDesc;
    
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the itemDesc
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * @param itemDesc the itemDesc to set
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}