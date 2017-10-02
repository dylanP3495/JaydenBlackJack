
/**
 * Write a description of class drawNum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Hand
{
    private int card1;
    private int card2;
    private int total;
    public Hand(){
        total = 0;
        card1 = getRandNum();
        card2 = getRandNum();
        total = (card1 + card2);
    }

    public int getRandNum(){
        int num= (int)((Math.random() * 9) +2);
        
        total += num;
        return num;
    }

    public int getCard1(){
        return card1;
    }

    public int getCard2(){
        return card2;
    }    
    
    public int getTotal(){
        return total;
    }

    public boolean check21(){
        return total == 21;
       }
}
