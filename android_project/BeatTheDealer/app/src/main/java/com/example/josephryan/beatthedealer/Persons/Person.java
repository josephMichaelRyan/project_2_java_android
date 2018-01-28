package com.example.josephryan.beatthedealer.Persons;

import com.example.josephryan.beatthedealer.DeckOfCards.Card;


import java.util.ArrayList;

/**
 * Created by josephryan on 27/01/2018.
 */

public abstract class Person {

    ArrayList<Card> hand;

    public Person(){
        this.hand = new ArrayList<>();
        }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void acceptCard(Card card) {
        this.hand.add(card);
    }

    public String[] getEachCard(){
        String[] cards = new String[this.getHand().size()];

        for(int i = 0; i < this.getHand().size(); i++){
            String rank = this.getHand().get(i).getRank().name();
            String suit = this.getHand().get(i).getSuit().name();

            cards[i] = "The " + rank.toLowerCase() + " of " + suit.toLowerCase() + ". ";
        }
        return cards;
    }

    public String buildCardString(Person person){

        String[] cards = person.getEachCard();

        StringBuilder builder = new StringBuilder(); //join method was unavailable for level 15 API
        for(String card : cards) {
            builder.append(card);
        }
        String cardStrings = builder.toString();
        return cardStrings;

    }
}
