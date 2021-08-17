package model;

import java.util.List;
import java.util.Random;

public enum ShapeValue implements Shape {
    ROCK {
        public boolean beats(final ShapeValue shapeValue) {
            return shapeValue.equals(ShapeValue.SCISSORS);
        }
    },
    PAPER {
        public boolean beats(final ShapeValue shapeValue) {
            return shapeValue.equals(ShapeValue.ROCK);
        }
    },
    SCISSORS {
        public boolean beats(final ShapeValue shapeValue) {
            return shapeValue.equals(ShapeValue.PAPER);
        }
    };

    private static final List<ShapeValue> SHAPE_VALUES = List.of(values());
    private static final Random RANDOM_SHAPE_VALUE_GENERATOR = new Random();
    private static final int TOTAL_SHAPE_VALUES = SHAPE_VALUES.size();

    public static ShapeValue randomShapeValue() {
        return SHAPE_VALUES.get(RANDOM_SHAPE_VALUE_GENERATOR.nextInt(TOTAL_SHAPE_VALUES));
    }
}
