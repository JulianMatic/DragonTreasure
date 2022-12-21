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
            case "n": //om användaren skriver n
                System.out.println("Du valde norr"); //skriver ut du valde väderstreck
                if (yPos - 1 < 0) {
                    System.out.println("Du kan inte gå norrut");//om värdet på ypositionen blir mindre än 0, skriver programmet ut du kan inte gå norr
                } else if (rooms[yPos - 1][xPos].isLocked()) { 
                    System.out.println("Det här rummet är låst");//om värdet på nästa rum norrut(-1 på Yaxeln)är låst, skrivs texten "det här rummet är låst" ut
                } else {
                    yPos = yPos - 1;//om inget av det andra stämmer minskas värdet på Ypositionen i 2d-arrayen med 1. Spelare har därmed flyttat sig till det rummet.
                }
                break;
            case "v":
                System.out.println("Du valde väst");//skriver ut du valde väderstreck
                if (xPos - 1 < 0) { 
                    System.out.println("Du kan inte gå västerut");//om värdet på xpositionen blir mindre än 0, skriver programmet ut du kan inte gå väst
                } else if (rooms[yPos][xPos - 1].isLocked()){
                    System.out.println("Det rummet är låst");//om värdet på nästa rum västerut(-1 på Xaxeln) är låst, skrivs texten "det här rummet är låst" ut
                }else {
                    xPos = xPos - 1;//om inget av det andra stämmer minskas värdet på Xpositionen i 2d-arrayen med 1. Spelare har därmed flyttat sig till det rummet.
                }

                break;
            case "s":
                System.out.println("Du valde syd");//skriver ut du valde väderstreck
                if (yPos + 1 > rooms.length - 1) {
                    System.out.println("Du kan inte gå söderut");//Om position Y blir större än 2, skrivs du kan inte gå söderut
                    } else if (rooms[yPos + 1][xPos].isLocked()){//om värdet på nästa rum söderut(+1 på Yaxeln) är låst, skrivs texten "det här rummet är låst" ut
                    System.out.println("Dörren är låst"); //
                } else {
                    yPos = yPos + 1;//om inget av det andra stämmer ökas värdet på Ypositionen i 2d-arrayen med 1. Spelare har därmed flyttat sig till det rummet.
                }
                break;
            case "ö":
                System.out.println("Du valde öst");//skriver ut du valde väderstreck
                if (xPos + 1 > rooms[yPos].length - 1) {
                    System.out.println("Du kan inte gå österut");//Om position X blir större än 2, skrivs du kan inte gå österut
                }else if (rooms[yPos][xPos+1].isLocked()){
                    System.out.println("Dörren är låst");//om värdet på nästa rum österut(+1 på Xaxeln) är låst, skrivs texten "det här rummet är låst" ut
                    
                    
                } else {
                    xPos = xPos + 1;//om inget av det andra stämmer ökas värdet på Xpositionen i 2d-arrayen med 1. Spelare har därmed flyttat sig till det rummet.
                }

                break;
                
              default:
                System.out.println("Error! Du måste välja rätt");//vid felaktigt kommando (ej n,s,w,e) skrivs detta ut
                
       
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
        
       
    System.out.println("Du stöter på en " +rooms.monster+ " som attackerar");
        do{
           System.out.println(rooms.monster+ "gör" +Monster.getDamage()+  " i skada");
           Player.this.healthPoints = -(Monster.getDamage());
           System.out.println("Du gör " +Player.this.damage);
           Monster.setHealthPoints = -(Player.this.damage);
        }while((Player.this.healthPoints()>0 && Monster.getHealthPoints()>0);)  
   
}
    
}