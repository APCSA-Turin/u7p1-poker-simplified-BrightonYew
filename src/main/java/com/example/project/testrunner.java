package com.example.project;
public class testrunner {
    public static void main(String[] args) {
        Player test = new Player();
        test.addallCard(new Card("Q", "♦"));
        test.addallCard(new Card("6", "♦"));
        test.addallCard(new Card("8", "♦"));
        test.addallCard(new Card("3", "♦"));
        test.addallCard(new Card("2", "♦"));

        //System.out.println(test.getAllCards());
        test.sortAllCards();
        System.out.println(test.getAllCards());

    }   
}