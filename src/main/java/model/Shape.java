package model;

import java.util.List;
import java.util.Random;

public enum Shape {
    ROCK {
        public boolean beats(final Shape shapeValue) {
            return shapeValue.equals(Shape.SCISSORS);
        }
    },
    PAPER {
        public boolean beats(final Shape shapeValue) {
            return shapeValue.equals(Shape.ROCK);
        }
    },
    SCISSORS {
        public boolean beats(final Shape shapeValue) {
            return shapeValue.equals(Shape.PAPER);
        }
    };

    private static final List<Shape> SHAPE_VALUES = List.of(values());
    private static final Random RANDOM_SHAPE_VALUE_GENERATOR = new Random();
    private static final int TOTAL_SHAPE_VALUES = SHAPE_VALUES.size();

    public abstract boolean beats(final Shape shapeValue);

    public static Shape randomShapeValue() {
        return SHAPE_VALUES.get(RANDOM_SHAPE_VALUE_GENERATOR.nextInt(TOTAL_SHAPE_VALUES));
    }
}
