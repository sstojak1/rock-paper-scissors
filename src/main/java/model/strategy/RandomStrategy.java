package model.strategy;

import model.Shape;

public class RandomStrategy implements Strategy {

    @Override
    public Shape chooseShape() {
        return Shape.randomShapeValue();
    }
}
