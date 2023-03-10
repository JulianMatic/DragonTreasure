package Dragon.Treasure;
//skapar klass Player
public class Player {
    private String name; //instansvariabel namn av typ String
    private int yPos; //instansvariabel position Y av typ int
    private int xPos; //instansvariabel position X av typ int
    private int healthPoints = 10;
    private int damage = 1;
    private Item items [];
    
      //konstruktor initialiserar parameterar med respektive variabel
    public Player(String name, int startPosY, int startPosX, Item[] items) {
       
        this.name = name;
        this.items = items;
        this.yPos = startPosY;
        this.xPos = startPosX;
        this.damage = damage;
        this.healthPoints = healthPoints;
    }
    
    //skapar getters och setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }
    
    /**
     * @return the healthPoints
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }
    
     public Item[] getItems() {
        return items;
    }

   
    public void setItems(Item[] items) {
        this.items = items;
    }
    
    
     //skapar metod MOve med parametrar movement och rooms
    public void Move(String movement, Room[][] rooms) {
        switch (movement) {//skapar switch
            case "n": //om anv?ndaren skriver n
                System.out.println("Du valde norr"); //skriver ut du valde v?derstreck
                if (yPos - 1 < 0) {
                    System.out.println("Du kan inte g? norrut");//om v?rdet p? ypositionen blir mindre ?n 0, skriver programmet ut du kan inte g? norr
                } else if (rooms[yPos - 1][xPos].isLocked()) { 
                    System.out.println("Det h?r rummet ?r l?st");//om v?rdet p? n?sta rum norrut(-1 p? Yaxeln)?r l?st, skrivs texten "det h?r rummet ?r l?st" ut
                } else {
                    yPos = yPos - 1;//om inget av det andra st?mmer minskas v?rdet p? Ypositionen i 2d-arrayen med 1. Spelare har d?rmed flyttat sig till det rummet.
                }
                break;
            case "v":
                System.out.println("Du valde v?st");//skriver ut du valde v?derstreck
                if (xPos - 1 < 0) { 
                    System.out.println("Du kan inte g? v?sterut");//om v?rdet p? xpositionen blir mindre ?n 0, skriver programmet ut du kan inte g? v?st
                } else if (rooms[yPos][xPos - 1].isLocked()){
                    System.out.println("Det rummet ?r l?st");//om v?rdet p? n?sta rum v?sterut(-1 p? Xaxeln) ?r l?st, skrivs texten "det h?r rummet ?r l?st" ut
                }else {
                    xPos = xPos - 1;//om inget av det andra st?mmer minskas v?rdet p? Xpositionen i 2d-arrayen med 1. Spelare har d?rmed flyttat sig till det rummet.
                }

                break;
            case "s":
                System.out.println("Du valde syd");//skriver ut du valde v?derstreck
                if (yPos + 1 > rooms.length - 1) {
                    System.out.println("Du kan inte g? s?derut");//Om position Y blir st?rre ?n 2, skrivs du kan inte g? s?derut
                    } else if (rooms[yPos + 1][xPos].isLocked()){//om v?rdet p? n?sta rum s?derut(+1 p? Yaxeln) ?r l?st, skrivs texten "det h?r rummet ?r l?st" ut
                    System.out.println("D?rren ?r l?st"); //
                } else {
                    yPos = yPos + 1;//om inget av det andra st?mmer ?kas v?rdet p? Ypositionen i 2d-arrayen med 1. Spelare har d?rmed flyttat sig till det rummet.
                }
                break;
            case "?":
                System.out.println("Du valde ?st");//skriver ut du valde v?derstreck
                if (xPos + 1 > rooms[yPos].length - 1) {
                    System.out.println("Du kan inte g? ?sterut");//Om position X blir st?rre ?n 2, skrivs du kan inte g? ?sterut
                }else if (rooms[yPos][xPos+1].isLocked()){
                    System.out.println("D?rren ?r l?st");//om v?rdet p? n?sta rum ?sterut(+1 p? Xaxeln) ?r l?st, skrivs texten "det h?r rummet ?r l?st" ut
                    
                    
                } else {
                    xPos = xPos + 1;//om inget av det andra st?mmer ?kas v?rdet p? Xpositionen i 2d-arrayen med 1. Spelare har d?rmed flyttat sig till det rummet.
                }

                break;
                
              default:
                System.out.println("Error! Du m?ste v?lja r?tt");//vid felaktigt kommando (ej n,s,w,e) skrivs detta ut
                
       
        }
    }
        
    

    public Room getCurrentRoomForPlayer(Room[][] rooms){ //skapar variabel getCurrentRoomForPlayer med parameter Room. Returnerar rooms med parametrarna getYpos och getYpos
        return rooms[this.getYPos()][this.getXPos()];
    

}

    /**
     * @param healthPoints the healthPoints to set
     */
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    
    public void doBattle(){
        
       
    System.out.println("Du st?ter p? en " +rooms.monster+ " som attackerar");
        do{
           System.out.println(rooms.monster+ "g?r" +Monster.getDamage()+  " i skada");
           Player.this.healthPoints = -(Monster.getDamage());
           System.out.println("Du g?r " +Player.this.damage);
           Monster.setHealthPoints = -(Player.this.damage);
        }while((Player.this.healthPoints()>0 && Monster.getHealthPoints()>0);)  
   
}
    
}