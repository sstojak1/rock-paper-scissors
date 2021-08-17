import model.ShapeValue;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeValueTest {

    @Test
    void shouldReturnRandomShapeValue() {
        final var shapeValue = ShapeValue.randomShapeValue();
        final var allShapeValues = Arrays.asList(ShapeValue.values());
        assertThat(allShapeValues).contains(shapeValue);
    }
}
