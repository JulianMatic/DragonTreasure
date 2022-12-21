/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dragon.Treasure;


//skapar klass DragonTreasure
public class DragonTreasure {

    //skapar setupGame med datatyp Room
    public static Room[][] setupGame(){
        Key nyckel = new Key("Nyckel","Öppnar en dörr");
        Monster drake = new Monster("Drake", 18, 1, "är MYCKET farlig");
        Monster vätte = new Monster("Vätte",5,1,"liten, men ettrig");
        Treasure skatt = new Treasure("Skattkista","Massa glimmrande saker",50);
        Weapon svärd = new Weapon("Svärd","Gör dig starkare",1);
        Potion hälsoDryck = new Potion("Hälsodryck","Stäker din hälsa med 6",6);
        
        
        //skapar 2-dimesionell array innehållande rum, namn och beskrivning.
        Room[][] rooms = {
                {new Room("Rum Sword", "Du ser en död kropp på golvet.\nDu kan gå österut [ö]\nDu kan gå söderut [s]", svärd), new Room("Rum Monster", "Du ser en brinnande fackla i rummets ena hörn och känner en motbjudande stank.\nDu kan gå västerut [v]\nDu kan gå österut [ö]",vätte), new Room("Rum Exit", "Du lämnar grottan med livet i behåll.")},
                {new Room("Rum Start", "Rummet Är upplyst av några ljus som sitter på ett bord framför dig.\nDu kan gå norrut [n]\nDu kan gå söderut [s]")},
                {new Room("Rum Key", "Du kommer in i ett fuktigt rum med vatten sipprandes längs den västra väggen.\nDu kan gå norrut [n]\nDu kan gå österut [ö] ",nyckel), new Room("Rum Potion", "Du kommer in i ett fuktigt rum med vatten sipprandes längs den västra väggen.\nDu kan gå västerut [v]\nDu kan gå österut [ö]",hälsoDryck), new Room("Rum Dragon", "Dörren är låst",skatt,drake)}
        };
        
       //Låser dörren till rummet [2][2] i arrayen 
       rooms[2][2].setLocked(true);
       
    
    

    
    
    
    return rooms;
    }
    //startar main
    public static void main(String[] args) {
        
        //startar metod playGame
        Dungeon.playGame();

    }
    //skapar endGame
    public void endGame(){
        System.out.println("Gratz, du överlevde spelet");//skriver ut text
        System.exit(0);//avslutar spelet
        
    }

}

