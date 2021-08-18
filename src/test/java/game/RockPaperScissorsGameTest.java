package game;

import model.Player;
import model.strategy.PaperStrategy;
import model.strategy.RockStrategy;
import model.strategy.ScissorsStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RockPaperScissorsGameTest {

    @Test
    void paperShouldBeatRock() {
        final var playerA = new Player(new PaperStrategy());
        final var playerB = new Player(new RockStrategy());
        final var twoPlayerGame = new TwoPlayerGame(playerA, playerB);

        final var winner = twoPlayerGame.play();

        assertEquals(playerA, winner);
    }

    @Test
    void rockShouldBeatScissors() {
        final var playerA = new Player(new RockStrategy());
        final var playerB = new Player(new ScissorsStrategy());
        final var twoPlayerGame = new TwoPlayerGame(playerA, playerB);

        final var winner = twoPlayerGame.play();

        assertEquals(playerA, winner);
    }

    @Test
    void scissorsShouldBeatPaper() {
        final var playerA = new Player(new ScissorsStrategy());
        final var playerB = new Player(new PaperStrategy());
        final var twoPlayerGame = new TwoPlayerGame(playerA, playerB);

        final var winner = twoPlayerGame.play();

        assertEquals(playerA, winner);
    }

    @Test
    void gameShouldBeTiedWhenPlayersChooseTheSameShape() {
        final var playerA = new Player(new PaperStrategy());
        final var playerB = new Player(new PaperStrategy());
        final var twoPlayerGame = new TwoPlayerGame(playerA, playerB);

        final var winner = twoPlayerGame.play();

        assertNull(winner);
    }
}
