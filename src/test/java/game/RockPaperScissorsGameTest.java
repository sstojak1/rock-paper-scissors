package game;

import model.Player;
import model.ShapeValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RockPaperScissorsGameTest {

    final Player playerA = new Player();
    final Player playerB = new Player();
    final RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGameImpl(playerA, playerB);

    @Test
    void paperShouldBeatRock() {
        playerA.setPlayerShape(ShapeValue.PAPER);
        playerB.setPlayerShape(ShapeValue.ROCK);

        final var expectedGameResult = new GameResult(1, 1, 0);

        rockPaperScissorsGame.play();

        final var actualGameResult = new GameResult(1, playerA.getGamesWon(), playerB.getGamesWon());

        assertEquals(expectedGameResult, actualGameResult);
    }

    @Test
    void rockShouldBeatScissors() {
        playerA.setPlayerShape(ShapeValue.ROCK);
        playerB.setPlayerShape(ShapeValue.SCISSORS);

        final var expectedGameResult = new GameResult(1, 1, 0);

        rockPaperScissorsGame.play();

        final var actualGameResult = new GameResult(1, playerA.getGamesWon(), playerB.getGamesWon());

        assertEquals(expectedGameResult, actualGameResult);
    }

    @Test
    void scissorsShouldBeatPaper() {
        playerA.setPlayerShape(ShapeValue.SCISSORS);
        playerB.setPlayerShape(ShapeValue.PAPER);

        final var expectedGameResult = new GameResult(1, 1, 0);

        rockPaperScissorsGame.play();

        final var actualGameResult = new GameResult(1, playerA.getGamesWon(), playerB.getGamesWon());

        assertEquals(expectedGameResult, actualGameResult);
    }

    @Test
    void gameShouldBeTiedWhenPlayersChooseTheSameShape() {
        playerA.setPlayerShape(ShapeValue.SCISSORS);
        playerB.setPlayerShape(ShapeValue.SCISSORS);

        final var expectedGameResult = new GameResult(1, 0, 0);

        rockPaperScissorsGame.play();

        final var actualGameResult = new GameResult(1, playerA.getGamesWon(), playerB.getGamesWon());

        assertEquals(expectedGameResult, actualGameResult);
    }
}
