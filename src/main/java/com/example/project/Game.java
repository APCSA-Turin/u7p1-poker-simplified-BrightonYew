package com.example.project;
import java.util.ArrayList;


public class Game{
    public static String determineWinner(Player p1, Player p2,String p1Hand, String p2Hand,ArrayList<Card> communityCards){
        p2.sortAllCards();
        p1.sortAllCards();
        int p1rank = 0;
        int p2rank = 0;

        p1rank = Utility.getHandRanking(p1.playHand(communityCards));
        p2rank = Utility.getHandRanking(p2.playHand(communityCards));

        System.out.println(p1rank + " " + p2rank);

        if (p1rank == p2rank) { //if its the same combo, check whose card is higher
            System.out.println(p1rank);
            if (Utility.getRankValue(p1.getAllCards().get(4).getRank()) > Utility.getRankValue(p2.getAllCards().get(4).getRank())) {
                System.out.println("BBBBB");
                return "Player 1 wins!";
            }
            if (Utility.getRankValue(p1.getAllCards().get(4).getRank()) < Utility.getRankValue(p2.getAllCards().get(4).getRank())) {
                System.out.println("GGGGGG");
                return "Player 2 wins!";
            }
            if (p1rank == 1) { //in cases such as highcard, look for the higher card in your hand
                System.out.println("test");
                if (Utility.getRankValue(p1.getHand().get(1).getRank()) > Utility.getRankValue(p2.getHand().get(1).getRank())) {
                    System.out.println("AAAA");
                    return "Player 1 wins!";
                }
                if (Utility.getRankValue(p1.getHand().get(1).getRank()) < Utility.getRankValue(p2.getHand().get(1).getRank())) {
                    System.out.println("HHHHHHHH");
                    return "Player 2 wins!";
                }
            }
            System.out.println("GGGGGGGGG");
            return "Tie!";
        }

        if (p1rank > p2rank) {
            System.out.println("EEEEEE");
            return "Player 1 wins!";
        }
        if (p2rank > p1rank) {
            System.out.println("FFFFFFF");
            return "Player 2 wins!";
        }

        return "Error";
    }

    public static void play(){ //simulate card playing
    
    }
        
        

}