package model.strategy;

import model.Shape;

public class ScissorsStrategy implements Strategy {

    @Override
    public Shape chooseShape() {
        return Shape.SCISSORS;
    }
}