package com.example.josephryan.beatthedealer.Games;

import com.example.josephryan.beatthedealer.Persons.Dealer;
import com.example.josephryan.beatthedealer.Persons.Person;
import com.example.josephryan.beatthedealer.Persons.Player;

import java.util.ArrayList;

/**
 * Created by josephryan on 30/01/2018.
 */

public abstract class Game {

    ArrayList<Person> playersInGame;
    int maxCards;

    public Game(int maxCards){
        this.playersInGame = new ArrayList<>();
        this.maxCards = maxCards;
    }

    public int getMaxCards() {
        return this.maxCards;
    }

    public void addPlayer(Person person) {
        this.playersInGame.add(person);
    }

    public Person getPlayer(int i){
        return this.playersInGame.get(i);
    }

    public int getPlayerCount() {
        return this.playersInGame.size();
    }

    public abstract String getResult(Player player, Dealer dealer);

    public void updateScore(Person person, int points){
        if(points < 0 && person.getScore() == 0) {
            return;
        }
        person.score += points;
    }
}
