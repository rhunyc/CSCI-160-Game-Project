package Game;


import GameEntities.Player;
import GameEntities.Coworker;
import HelperClasses.MenuHelper;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class GameSetup {
    
    private GameSetup(){
        
    }
    
    public static Coworker setupCoworker(int option){
        Coworker coworker = new Coworker();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your co-worker's name: ");
        String name = scan.next();
        
        switch (option) {
            case 1:
                Coworker case1 = new Coworker(name, 0);
                coworker = case1;
                break;
            case 2:
                Coworker case2 = new Coworker(name, 1);
                coworker = case2;
                break;
            case 3:
                Coworker case3 = new Coworker(name);
                coworker = case3;
                break;

        }    
        return coworker;
    }
    
    public static Player setupPlayer(int option){
        Player player = new Player();

        
        switch (option) {
            case 1:
                String name = MenuHelper.getInput("Enter your name: ");
                Player case1 = new Player(name, 0);
                player = case1;
                break;
            case 2:
                String name2 = MenuHelper.getInput("Enter your name: ");
                Player case2 = new Player(name2, 1);
                player = case2;
                break;
            case 3:
                String name3 = "";
                Player case3 = new Player(name3);
                player = case3;
                if (player.getName() == null){
                    String name4 = MenuHelper.getInput("Enter your name: ");
                    player.setName(name4);
                }
                break;

        }    
        return player;
    }
    
    
    public static Game setupGame(){
        System.out.println("Welcome to Blλck Mesa : Evλcuaiton.");                
        System.out.println("You and a coworker have been hard at work only to hear an");
        System.out.println("alarm sound and a message over the P.A. system.");
        System.out.println("\"Please, evacuate the building immediately! This is not a test!");
        System.out.println("The military are here, but they ar- ahh!\" followed by gunshots.");
        System.out.println("You look to your coworker, frightened, only knowing you must reach");
        System.out.println("the surface by whatever means necessary.");        
        System.out.println("The resonance cascade has just occured in the facility");
        System.out.println("and the alien forces from the planet Xen have invaded.");
        System.out.println("However they are not the only threat.");
        System.out.println("The military has dispatched forces to the facility to \"control\"");
        System.out.println("the situation. They are not your allies.");
        System.out.println("In additions, there is also a massive leak of radiation in the facility,");
        System.out.println("which overtime will flood the entire research center.");
        System.out.println("Your goal is to reach the surface, via accessing elevators.");
        System.out.println("Be careful, if the radiation level gets too high, you'll both die.");
        

        int playerChoice= MenuHelper.displayMenu("Please pick your occupation within Black Mesa:\n 1) Scientist\n 2) Security Guard\n 3) Random", 1, 3);   
        Player player = GameSetup.setupPlayer(playerChoice);
        int coworkerChoice = MenuHelper.displayMenu("Please choose the occupation of your coworker:\n 1) Scientist\n 2) Security Guard\n 3) Random", 1, 3);
        Coworker coworker = GameSetup.setupCoworker(coworkerChoice);
        int difficulty = MenuHelper.displayMenu("Please select a level of difficulty:\n 1) Easy\n 2) Medium\n 3) Hard.",1,3);
        Game game = new Game(difficulty, coworker, player);
        game.setDifficultyModifier(difficulty);
        return game;
    }
    
    
}
