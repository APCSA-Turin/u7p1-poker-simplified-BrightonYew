package com.example.project;


import java.util.ArrayList;

public class testrunner {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        
        player1.addCard(new Card("7", "♠"));
        player1.addCard(new Card("7", "♣"));
        
        player2.addCard(new Card("8", "♠"));
        player2.addCard(new Card("3", "♣"));
        
        ArrayList<Card> communityCards = new ArrayList<>();
        communityCards.add(new Card("A", "♦"));
        communityCards.add(new Card("A", "♥"));
        communityCards.add(new Card("A", "♠"));
    
        String p1Result = player1.playHand(communityCards);
        String p2Result = player2.playHand(communityCards);
        
        String winner = Game.determineWinner(player1, player2, p1Result, p2Result, communityCards);
        
        System.out.println(winner);
    }   
}