
package Dragon.Treasure;

/**
 *
 * @author Jonatan
 */
public class Monster {
    private String name;
    private int healthPoints;
    private int damage;
    private String monsterDesc;
    
    public Monster(String name, int healthPoints, int damage, String monsterDesc){
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.monsterDesc = monsterDesc;
        
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
     * @return the healthPoints
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * @param healthPoints the healthPoints to set
     */
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the monsterDesc
     */
    public String getMonsterDesc() {
        return monsterDesc;
    }

    /**
     * @param monsterDesc the monsterDesc to set
     */
    public void setMonsterDesc(String monsterDesc) {
        this.monsterDesc = monsterDesc;
    }
}
