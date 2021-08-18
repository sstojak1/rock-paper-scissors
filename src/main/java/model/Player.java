package model;

import lombok.AllArgsConstructor;
import model.strategy.Strategy;

@AllArgsConstructor
public class Player {
    private final Strategy strategy;

    public Shape chooseShape(){
        return strategy.chooseShape();
    }
}
