package model.strategy;

import model.Shape;

public class PaperStrategy implements Strategy {

    @Override
    public Shape chooseShape() {
        return Shape.PAPER;
    }
}
