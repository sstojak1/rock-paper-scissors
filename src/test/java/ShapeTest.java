import model.Shape;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeTest {

    @Test
    void shouldReturnRandomShapeValue() {
        final var shapeValue = Shape.randomShapeValue();
        final var allShapeValues = Arrays.asList(Shape.values());
        assertThat(allShapeValues).contains(shapeValue);
    }
}
