package model.strategy;

import model.Shape;

public class RockStrategy implements Strategy {

    @Override
    public Shape chooseShape() {
        return Shape.ROCK;
    }
}
