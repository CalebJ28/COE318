package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println(" ");
        System.out.println("House Cards: "+ game.getHouseCards().getCards());
        System.out.println("Player Cards: "+ game.getYourCards().getCards());
    }
    
  @Override
    public boolean hitMe() {
        System.out.println("Would you like to pickup another card? (Enter Yes or No)");
        String hit= user.nextLine();
        if (hit.equalsIgnoreCase("No"))
        { return false;}
        else if (hit.equalsIgnoreCase("Yes"))
        {return true;}
        else {
        System.out.println("There was an error, gamer over!!");
        }
        return false;
    }
  @Override
    public void gameOver() {
       display();
       System.out.println("House Score: "+ game.score(game.getHouseCards()));
       System.out.println("Your Score: "+ game.score(game.getYourCards()));
       if (game.score(game.getYourCards())>21){
           System.out.println("You Lost" );
       }
       else if (game.score(game.getYourCards())== game.score(game.getHouseCards())){
           System.out.println("You Lost" );
       }
       else if (game.score(game.getYourCards())<21&&(game.score(game.getHouseCards())>21)){
           System.out.println("You Won" );
       }
       else if (game.score(game.getYourCards())<21&&game.score(game.getHouseCards())<21&&game.score(game.getYourCards())>game.score(game.getHouseCards())){
           System.out.println("You Won" );}
    }
    }

