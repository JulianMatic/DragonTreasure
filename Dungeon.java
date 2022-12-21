/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dragon.Treasure;

import java.util.Scanner; //importerar Scanner

//skapar klass Dungeon
public class Dungeon {
    //skapar metod playGame
    public static void playGame(){
        Scanner scanner = new Scanner(System.in); //skapar instans av Scanner
        DragonTreasure dT = new DragonTreasure();
        Room [][] rooms = DragonTreasure.setupGame(); //tillskriver värde till variabeln room från setupGame i DragonTreasure
        
        System.out.println("Välkommen till Dragon Treasure");
        System.out.println("Skriv ditt namn och tryck på [Enter] för att starta ett nytt spel..."); //utskrifter i prombten
        String playerName = scanner.nextLine(); //nästa värde från användaren tilldelas variablen playerName (namnet på spelaren

        Player player = new Player(playerName, 1, 0,null); //skapar ny instans av Player och sötter första rummet till [0][1]
        
        System.out.println("Välkommen " +playerName+ " till din skattjakt."); 
        
        System.out.printf( "%nDu står utanför en grotta. Det luktar svavel från öppningen.%n"); 
        
        

        System.out.println("Grottöppningen är österut. Skriv \"ö\" och tryck på [Enter] för att komma in i grottan"); //ustrikfter i prompt
//        
        String riktning = scanner.nextLine(); //nästa värde från användaren tilldelas variablen riktning
        while(!riktning.equals("ö")){//loop om användaren skriver in annat värde än ö
        System.out.println("Felaktning riktning");
        System.out.println("Grottöppningen är österut. Skriv \"ö\" och tryck på [Enter] för att komma in i grottan"); //ustrikfter i prompt
//        
        riktning = scanner.nextLine(); //nästa värde från användaren tilldelas variablen riktning
        
        }if(riktning.equals("ö"))  //när användare skriver ö, skriv ut nedan och fortsätt
            System.out.println("När du går in i grottan kollapsar ingången bakom dig.\n");


        System.out.println(player.getCurrentRoomForPlayer(rooms)); //skriver ut namn och beskrivning i första rummet
        
        
    
       do {//startat loop
           
            System.out.println("Navigera: (n,v,s,ö)"); //skriver ut alternativ för olika input
            String userInput = scanner.nextLine(); //nästa värde från användaren tilldelas userInput
            player.Move(userInput, rooms); //använder metoden move i klassen Player med det nya värdet för userInput 
            System.out.println(player.getCurrentRoomForPlayer(rooms)); //skriver ut det nya nuvarande rum
         
        } while(player.getCurrentRoomForPlayer(rooms) != rooms[0][2]);//Loopen avslutas när koordinaten blir [0][2]   
            
        
       
//        dT.endGame(); //startar metoden endGame
        
        
      
    
        
    


}


       
       
       
                   }


