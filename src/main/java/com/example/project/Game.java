package com.example.project;
import java.util.ArrayList;




public class Game{
    public static String determineWinner(Player p1, Player p2,String p1Hand, String p2Hand,ArrayList<Card> communityCards){
        p2.sortAllCards(); //sort the cards in case looking for high card
        p1.sortAllCards();


        Card highestp1Card; //used to determine highest card in each players hand
        Card highestp2Card;


        if (Utility.getRankValue(p1.getHand().get(0).getRank()) > Utility.getRankValue(p1.getHand().get(1).getRank())) {
            highestp1Card = p1.getHand().get(0);
        } else {
            highestp1Card = p1.getHand().get(1);
        }


        if (Utility.getRankValue(p2.getHand().get(0).getRank()) > Utility.getRankValue(p2.getHand().get(1).getRank())) {
            highestp2Card = p2.getHand().get(0);
        } else {
            highestp2Card = p2.getHand().get(1);
        }


        int p1rank = 0;
        int p2rank = 0;


        p1rank = Utility.getHandRanking(p1.playHand(communityCards)); //used to determine whose combo is better
        p2rank = Utility.getHandRanking(p2.playHand(communityCards));




        if (p1rank == p2rank) { //if its the same combo, check whose card is higher
            if (Utility.getRankValue(p1.getAllCards().get(4).getRank()) > Utility.getRankValue(p2.getAllCards().get(4).getRank())) {
                return "Player 1 wins!";
            }
            if (Utility.getRankValue(p1.getAllCards().get(4).getRank()) < Utility.getRankValue(p2.getAllCards().get(4).getRank())) {
                return "Player 2 wins!";
            }
            if (p1rank == 1 || p1rank == 5) { //in cases such as highcard or three of a kind, look for the higher card in your hand
                if (Utility.getRankValue(highestp1Card.getRank()) > Utility.getRankValue(highestp2Card.getRank())) {
                    return "Player 1 wins!";
                }
                if (Utility.getRankValue(highestp1Card.getRank()) < Utility.getRankValue(highestp2Card.getRank())) {
                    return "Player 2 wins!";
                }
            }
            return "Tie!";
        }


        if (p1rank > p2rank) { //who has the better combo wins
            return "Player 1 wins!";
        }
        if (p2rank > p1rank) {
            return "Player 2 wins!";
        }


        return "Error";
    }


    public static void play(){ //simulate card playing
   
    }
       
       


}
