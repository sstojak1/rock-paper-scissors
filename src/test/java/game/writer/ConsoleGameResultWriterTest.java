package game.writer;

import game.GameResult;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConsoleGameResultWriterTest {

    @Test
    void shouldPrintGameResult() {
        final var gameResult = new GameResult(1, 1, 0);

        String expectedSystemOutput = "Player A wins 1 of 1 games\\s+" +
                "Player B wins 0 of 1 games\\s+" +
                "Tie: 0 of 1 games\\s+";

        ByteArrayOutputStream actualOutputContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutputContent));
        new ConsoleGameResultWriterImpl().write(gameResult);

        assertTrue(actualOutputContent.toString().matches(expectedSystemOutput));
    }
}
