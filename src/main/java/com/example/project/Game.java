package com.example.project;
import java.util.ArrayList;


public class Game{
    public static String determineWinner(Player p1, Player p2,String p1Hand, String p2Hand,ArrayList<Card> communityCards){

        int p1rank = 0;
        int p2rank = 0;

        p1rank = Utility.getHandRanking(p1.playHand(communityCards));
        p2rank = Utility.getHandRanking(p2.playHand(communityCards));

        if (p1rank > p2rank) {
            return "Player 1 wins!";
        }
        if (p2rank > p1rank) {
            return "Player 2 wins!";
        }
        if (p1rank == p2rank) {
            if (Utility.getRankValue(p1.getAllCards().get(4).getRank()) > Utility.getRankValue(p2.getAllCards().get(4).getRank())) {
                return "Player 1 wins!";
            }
            if (Utility.getRankValue(p1.getAllCards().get(4).getRank()) < Utility.getRankValue(p2.getAllCards().get(4).getRank())) {
                return "Player 2 wins!";
            }
            return "Tie!";
        }
        return "Error";
    }

    public static void play(){ //simulate card playing
    
    }
        
        

}