
/**
 * Write a description of class BlackJack here.
 * 
 * @author (Jayden Ders) 
 * @version (9.25.17)
 */
import java.util.Scanner;
import java.lang.Math;
public class BlackJackRunner
{       

    public static void play(){
        Hand player = new Hand();
        Hand dealer = new Hand();
        /*
        card1 =  draw.getRandNum();
        card2 =  draw.getRandNum();
        hand = card1 + card2;
        System.out.println("Your hand is " + card1 + " and " + card2 + ".");
         */

        System.out.println("You draw a " + player.getCard1() +" and a " + player.getCard2() + ".");
        System.out.println("Your total is "  + player.getTotal() + ".");
        System.out.println("The dealer draws a " + dealer.getCard1() + " and another hidden card.");
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("Would you like to /hit/ or /stay/?    ");
        String hitStay = keyboard.next();

        while(hitStay.equalsIgnoreCase("hit")){
          System.out.println();    
          System.out.println("You draw a " + player.getRandNum() + ".");
          System.out.println("Your total is " + player.getTotal() + ".");
          System.out.println();
           
          if (player.check21() == true){
                System.out.println("You have won! You got BlackJack!");
                System.exit(0);
          } 
          if (player.getTotal() > 21) {
            System.out.println("You have busted. Your total was " + player.getTotal());
            System.exit(0);
    	  }
    	  System.out.println("Would you like to /hit/ or /stay/?    ");
          hitStay = keyboard.next();
       }
       System.out.println();
       System.out.println("It is now the dealer's turn");
       System.out.println("The dealer reveals his hidden card! It was a " +dealer.getCard2() +".");
       System.out.println("His total is " + dealer.getTotal() + ".");
       while (dealer.getTotal() <=17){
           System.out.println();
           System.out.println("The dealer draws a " + dealer.getRandNum() +".");
           System.out.println("The dealer's total is " + dealer.getTotal() + ".");
           System.out.println();
       }
       if (dealer.getTotal() > 21){
           System.out.println("The dealer busted! You WIN!");
           System.exit(0);
       }
       if (dealer.getTotal() == player.getTotal()){
           System.out.println("You have tied with the dealer. No one wins.");
           System.exit(0);
          
       }
       if (dealer.getTotal() > player.getTotal()){
           System.out.println("The dealer's total is higher than yours! You LOSE!!");
           System.exit(0);
        }
       if (player.getTotal() > dealer.getTotal()){
           System.out.println("Your total is greater than the dealer's! You WIN!!");
           System.exit(0);
        }
       if (dealer.getTotal() ==21){
           System.out.println("The dealer got BlackJack! You LOSE!!");
           System.exit(0);
        }
    }
}
