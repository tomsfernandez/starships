package edu.austral.model;

import edu.austral.model.entities.Shot;
import edu.austral.model.entities.Starship;

import java.util.List;

public class Player {

    private final String name;
    private final int number;
    private int score = 0;
    private Starship ship;
    private boolean alive = true;

    public Player(String name, int number){
        this.name = name;
        this.number = number;
        // TODO create ship
    }

    public Player(String name, int number, Starship spaceship) {
        this.name = name;
        this.number = number;
        this.ship = spaceship;
    }

    public void addToScore(int toAdd){
        score += toAdd;
    }

    public void rotate(float angle){
        ship.rotate(angle);
    }

    public void moveForward(){
        ship.move();
    }

    public void moveBackwards(){
        ship.moveBackwards();
    }

    public List<Shot> shoot(){
        return ship.shoot(this);
    }
}