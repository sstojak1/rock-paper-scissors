import org.junit.jupiter.api.Test;
import game.RockPaperScissorsGameImpl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RockPaperScissorsGameImplTest {

    @Test
    void shouldFinishSuccessfullyWithExpectedOutput() {
        ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputContent));
        final var rockPaperScissorsGame = new RockPaperScissorsGameImpl();
        rockPaperScissorsGame.play();

        String expectedSystemOutput = "Player A wins \\d+ of 100 games\\s+" +
                "Player B wins \\d+ of 100 games\\s+" +
                "Tie: \\d+ of 100 games\\s+";

        assertTrue(outputContent.toString().matches(expectedSystemOutput));
    }
}