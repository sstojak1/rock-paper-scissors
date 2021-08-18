package game;

import model.Player;
import model.strategy.PaperStrategy;
import model.strategy.ScissorsStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoPlayerRepeatableGameTest {

    @Test
    void ScissorsShouldWinEveryGame() {
        final var playerA = new Player(new ScissorsStrategy());
        final var playerB = new Player(new PaperStrategy());
        final var twoPlayerRepeatableGame = new TwoPlayerRepeatableGame(playerA, playerB);

        final var expectedGameResult = new GameResult(100, 100, 0);

        final var actualGameResult = twoPlayerRepeatableGame.play(100);

        assertEquals(expectedGameResult, actualGameResult);
    }

    @Test
    void EveryGameShouldEndAsATie() {
        final var playerA = new Player(new ScissorsStrategy());
        final var playerB = new Player(new ScissorsStrategy());
        final var twoPlayerRepeatableGame = new TwoPlayerRepeatableGame(playerA, playerB);

        final var expectedGameResult = new GameResult(100, 0, 0);

        final var actualGameResult = twoPlayerRepeatableGame.play(100);

        assertEquals(expectedGameResult, actualGameResult);
    }
}
