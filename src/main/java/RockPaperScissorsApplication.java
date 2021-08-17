import game.GameResult;
import game.RockPaperScissorsGameImpl;
import game.writer.ConsoleGameResultWriterImpl;
import model.Player;
import model.ShapeValue;

public class RockPaperScissorsApplication {

    public static void main(String[] args) {
        final int gamesToPlay = 100;
        final var playerPaper = new Player(ShapeValue.PAPER);
        final var playerB = new Player();
        final var rockPaperScissorsGame = new RockPaperScissorsGameImpl(playerPaper, playerB);

        for (int game = 0; game < gamesToPlay; game++) {
            playerB.setPlayerShape(ShapeValue.randomShapeValue());
            rockPaperScissorsGame.play();
        }
        final var gameResult = new GameResult(gamesToPlay, playerPaper.getGamesWon(), playerB.getGamesWon());
        new ConsoleGameResultWriterImpl().write(gameResult);
    }
}
